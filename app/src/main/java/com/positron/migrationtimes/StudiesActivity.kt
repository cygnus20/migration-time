package com.positron.migrationtimes

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.support.v4.app.NavUtils
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.positron.migrationtimes.adapters.StudiesRecyclerViewAdapter
import com.positron.migrationtimes.models.Study
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

class StudiesActivity : BaseActivity() {

    lateinit var recyclerView: RecyclerView
    private lateinit var viewManager: LinearLayoutManager
    private lateinit var studies: MutableList<Study>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val contentFrameLayout = content_frame

        val emptyList: List<Study> = listOf()

        layoutInflater.inflate(R.layout.activity_main, contentFrameLayout)

        viewManager = LinearLayoutManager(this)

        recyclerView = recycler_view.apply {
            layoutManager = viewManager

        }

        recyclerView.addOnScrollListener(object : EndlessRecyclerOnScrollListener(viewManager) {
            override fun onLoadMore(current_page: Int) {
                getMoreStudies(current_page)
            }

        })

        retry_btn.setOnClickListener {
            getStudies(this)
        }

        recyclerView.adapter = StudiesRecyclerViewAdapter(this, emptyList, {})

        if (savedInstanceState != null && !savedInstanceState.containsKey(Constants.PARCELIZED_POSTS)) {
            getStudies(this)
        }

        else if (savedInstanceState != null && savedInstanceState.containsKey(Constants.PARCELIZED_POSTS)) {
            UtilityMethods.hideErrorMessage(network_error_view, recyclerView)
            UtilityMethods.hideView(loading_view)
            this.studies = savedInstanceState.getParcelableArrayList(Constants.PARCELIZED_POSTS)!!
            recyclerView.adapter = StudiesRecyclerViewAdapter(this, this.studies) {
                    s: Study -> viewStudy(s)
            }

        }

        else
            getStudies(this)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        if (::studies.isInitialized)
            outState?.putParcelableArrayList(Constants.PARCELIZED_POSTS, studies as ArrayList<out Parcelable>)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        NavUtils.navigateUpFromSameTask(this)
    }

    private fun getStudies(context: Context) {
        UtilityMethods.hideErrorMessage(network_error_view, recyclerView)
        UtilityMethods.showView(loading_view)

        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val api = retrofit.create(MigrationTimeAPI::class.java)

        val call = api.getStudies()

        call.enqueue(object: Callback<List<Study>> {

            override fun onResponse(call: Call<List<Study>>, response: Response<List<Study>>) {
                UtilityMethods.hideView(loading_view)

                val res = response.body()
                studies = res!!.filter{ i -> i.title != null }.toMutableList()

                recyclerView.adapter = StudiesRecyclerViewAdapter(context, studies) {
                        s: Study -> viewStudy(s)
                }

                (recyclerView.adapter as StudiesRecyclerViewAdapter).notifyDataSetChanged()
            }

            override fun onFailure(call: Call<List<Study>>, t: Throwable) {
                Log.v("Error", t.toString())

                if (t is IOException) {
                    UtilityMethods.showErrorMessage(network_error_view, recyclerView)
                    UtilityMethods.hideView(loading_view)
                }
            }

        })

    }

    private fun getMoreStudies(page: Int) {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val api = retrofit.create(MigrationTimeAPI::class.java)

        val call = api.getStudies(page)

        call.enqueue(object: Callback<List<Study>> {

            override fun onResponse(call: Call<List<Study>>, response: Response<List<Study>>) {
                val header = response.headers()
                val res = response.body()

                val totalPages = header["X-WP-TotalPages"]?.toInt()

                if (totalPages != null) {
                    val newStudies = res!!.filter{ i -> i.title != null }

                    studies.addAll(newStudies)

                    (recyclerView.adapter as StudiesRecyclerViewAdapter).notifyDataSetChanged()
                }

            }

            override fun onFailure(call: Call<List<Study>>, t: Throwable) {
                Log.v("Error", t.toString())

            }

        })
    }

    private fun viewStudy(study: Study) {
        val intent = Intent(this, PostContentActivity::class.java).apply {
            putExtra(Constants.POST_TITLE, study.title?.rendered)
            putExtra(Constants.POST_CONTENT, study.content?.rendered)
            putExtra(Constants.IMAGE_URL, study.jetPackFeaturedMediaUrl)
        }
        startActivity(intent)
    }
}
