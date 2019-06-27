package com.positron.migrationtimes

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.support.v4.app.NavUtils
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.positron.migrationtimes.adapters.WorksRecyclerViewAdapter
import com.positron.migrationtimes.models.Work
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

class WorksActivity : BaseActivity() {

    lateinit var recyclerView: RecyclerView
    private lateinit var viewManager: LinearLayoutManager
    private lateinit var works: MutableList<Work>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val contentFrameLayout = content_frame

        var emptyList: List<Work> = listOf()

        layoutInflater.inflate(R.layout.activity_main, contentFrameLayout)

        viewManager = LinearLayoutManager(this)

        recyclerView = recycler_view.apply {
            layoutManager = viewManager

        }

        recyclerView.addOnScrollListener(object : EndlessRecyclerOnScrollListener(viewManager) {
            override fun onLoadMore(current_page: Int) {
                getMoreWorks(current_page)
            }

        })

        retry_btn.setOnClickListener {
            getWorks(this)
        }

        recyclerView.adapter = WorksRecyclerViewAdapter(this, emptyList, {})

        if (savedInstanceState != null && !savedInstanceState.containsKey(Constants.PARCELIZED_POSTS)) {
            getWorks(this)
        }

        else if (savedInstanceState != null && savedInstanceState.containsKey(Constants.PARCELIZED_POSTS)) {
            UtilityMethods.hideErrorMessage(network_error_view, recyclerView)
            UtilityMethods.hideView(loading_view)
            this.works = savedInstanceState.getParcelableArrayList(Constants.PARCELIZED_POSTS)!!
            recyclerView.adapter = WorksRecyclerViewAdapter(this, this.works) {
                    v: Work -> viewWork(v)
            }

        }

        else
            getWorks(this)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        if (::works.isInitialized)
            outState?.putParcelableArrayList(Constants.PARCELIZED_POSTS, works as ArrayList<out Parcelable>)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        NavUtils.navigateUpFromSameTask(this)
    }

    private fun getWorks(context: Context) {
        UtilityMethods.hideErrorMessage(network_error_view, recyclerView)
        UtilityMethods.showView(loading_view)

        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val api = retrofit.create(MigrationTimeAPI::class.java)

        val call = api.getWorks()

        call.enqueue(object: Callback<List<Work>> {

            override fun onResponse(call: Call<List<Work>>, response: Response<List<Work>>) {
                UtilityMethods.hideView(loading_view)

                val res = response.body()
                works = res!!.filter{ i -> i.title != null }.toMutableList()

                recyclerView.adapter = WorksRecyclerViewAdapter(context, works) {
                        work: Work -> viewWork(work)
                }

                (recyclerView.adapter as WorksRecyclerViewAdapter).notifyDataSetChanged()
            }

            override fun onFailure(call: Call<List<Work>>, t: Throwable) {
                Log.v("Error", t.toString())

                if (t is IOException) {
                    UtilityMethods.showErrorMessage(network_error_view, recyclerView)
                    UtilityMethods.hideView(loading_view)
                }
            }

        })

    }

    private fun getMoreWorks(page: Int) {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val api = retrofit.create(MigrationTimeAPI::class.java)

        val call = api.getWorks(page)

        call.enqueue(object: Callback<List<Work>> {

            override fun onResponse(call: Call<List<Work>>, response: Response<List<Work>>) {
                val header = response.headers()
                val res = response.body()

                val totalPages = header["X-WP-TotalPages"]?.toInt()

                if (totalPages != null) {
                    val newWorks = res!!.filter{ i -> i.title != null }

                    works.addAll(newWorks)

                    (recyclerView.adapter as WorksRecyclerViewAdapter).notifyDataSetChanged()
                }

            }

            override fun onFailure(call: Call<List<Work>>, t: Throwable) {
                Log.v("Error", t.toString())

            }

        })
    }

    private fun viewWork(work: Work) {
        val intent = Intent(this, PostContentActivity::class.java).apply {
            putExtra(Constants.POST_TITLE, work.title?.rendered)
            putExtra(Constants.POST_CONTENT, work.content?.rendered)
            putExtra(Constants.IMAGE_URL, work.jetPackFeaturedMediaUrl)
        }
        startActivity(intent)
    }
}
