package com.positron.migrationtimes

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.support.v4.app.NavUtils
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.positron.migrationtimes.adapters.JobsRecyclerViewAdapter
import com.positron.migrationtimes.models.Job
import com.positron.migrationtimes.services.MigrationTimeAPI
import com.positron.migrationtimes.util.Constants
import com.positron.migrationtimes.util.EndlessRecyclerOnScrollListener
import com.positron.migrationtimes.util.UtilityMethods
import kotlinx.android.synthetic.main.activity_base.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.network_error_view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.io.IOException
import java.util.*

class JobsActivity : BaseActivity() {

    lateinit var recyclerView: RecyclerView
    private lateinit var viewManager: LinearLayoutManager
    private lateinit var jobs: MutableList<Job>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val contentFrameLayout = content_frame

        val emptyList: List<Job> = listOf()

        layoutInflater.inflate(R.layout.activity_main, contentFrameLayout)

        viewManager = LinearLayoutManager(this)

        recyclerView = recycler_view.apply {
            layoutManager = viewManager

        }

        recyclerView.addOnScrollListener(object : EndlessRecyclerOnScrollListener(viewManager) {
            override fun onLoadMore(current_page: Int) {
                getMoreJobs(current_page)
            }

        })

        retry_btn.setOnClickListener {
            getJobs(this)
        }

        recyclerView.adapter = JobsRecyclerViewAdapter(this, emptyList, {})

        if (savedInstanceState != null && !savedInstanceState.containsKey(Constants.PARCELIZED_POSTS)) {
            getJobs(this)
        }

        else if (savedInstanceState != null && savedInstanceState.containsKey(Constants.PARCELIZED_POSTS)) {
            UtilityMethods.hideErrorMessage(network_error_view, recyclerView)
            UtilityMethods.hideView(loading_view)
            this.jobs = savedInstanceState.getParcelableArrayList(Constants.PARCELIZED_POSTS)!!
            recyclerView.adapter = JobsRecyclerViewAdapter(this, this.jobs) {
                    j: Job -> viewJob(j)
            }

        }

        else
            getJobs(this)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        if (::jobs.isInitialized)
            outState?.putParcelableArrayList(Constants.PARCELIZED_POSTS, jobs as ArrayList<out Parcelable>)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        NavUtils.navigateUpFromSameTask(this)
    }

    private fun getJobs(context: Context) {
        UtilityMethods.hideErrorMessage(network_error_view, recyclerView)
        UtilityMethods.showView(loading_view)

        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val api = retrofit.create(MigrationTimeAPI::class.java)

        val call = api.getJobs()

        call.enqueue(object: Callback<List<Job>> {

            override fun onResponse(call: Call<List<Job>>, response: Response<List<Job>>) {
                UtilityMethods.hideView(loading_view)

                val res = response.body()
                jobs = res!!.filter{ i -> i.title != null }.toMutableList()

                recyclerView.adapter = JobsRecyclerViewAdapter(context, jobs) {
                        j: Job -> viewJob(j)
                }

                (recyclerView.adapter as JobsRecyclerViewAdapter).notifyDataSetChanged()
            }

            override fun onFailure(call: Call<List<Job>>, t: Throwable) {
                Log.v("Error", t.toString())

                if (t is IOException) {
                    UtilityMethods.showErrorMessage(network_error_view, recyclerView)
                    UtilityMethods.hideView(loading_view)
                }
            }

        })

    }

    private fun getMoreJobs(page: Int) {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val api = retrofit.create(MigrationTimeAPI::class.java)

        val call = api.getJobs(page)

        call.enqueue(object: Callback<List<Job>> {

            override fun onResponse(call: Call<List<Job>>, response: Response<List<Job>>) {
                val header = response.headers()
                val res = response.body()

                val totalPages = header["X-WP-TotalPages"]?.toInt()

                if (totalPages != null) {
                    val newJobs = res!!.filter{ i -> i.title != null }

                    jobs.addAll(newJobs)

                    (recyclerView.adapter as JobsRecyclerViewAdapter).notifyDataSetChanged()
                }

            }

            override fun onFailure(call: Call<List<Job>>, t: Throwable) {
                Log.v("Error", t.toString())

            }

        })
    }

    private fun viewJob(job: Job) {
        val intent = Intent(this, JobContentActivity::class.java).apply {
            putExtra(Constants.POST_TITLE, job.title?.rendered)
            putExtra(Constants.POST_CONTENT, job.content?.rendered)
            putExtra(Constants.COMPANY_NAME, job.fields?.companyName)
            putExtra(Constants.JOB_LOCATION, job.fields?.jobLocation)
            putExtra(Constants.COMPANY_WEBSITE, job.fields?.companyWebsite)
            putExtra(Constants.COMPANY_APPLICATION_EMAIL, job.fields?.application)

        }
        startActivity(intent)
    }
}
