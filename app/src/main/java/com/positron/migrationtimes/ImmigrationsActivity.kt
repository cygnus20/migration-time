package com.positron.migrationtimes

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.support.v4.app.NavUtils
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.positron.migrationtimes.adapters.ImmigrationsRecyclerViewAdapter
import com.positron.migrationtimes.models.Immigration
import com.positron.migrationtimes.services.MigrationTimeAPI
import com.positron.migrationtimes.util.Constants
import com.positron.migrationtimes.util.Constants.Companion.BASE_URL
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

class ImmigrationsActivity : BaseActivity() {

    lateinit var recyclerView: RecyclerView
    private lateinit var viewManager: LinearLayoutManager
    private lateinit var immigrations: MutableList<Immigration>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val contentFrameLayout = content_frame

        var emptyList: List<Immigration> = listOf()

        layoutInflater.inflate(R.layout.activity_main, contentFrameLayout)

        viewManager = LinearLayoutManager(this)

        recyclerView = recycler_view.apply {
            layoutManager = viewManager

        }

        recyclerView.addOnScrollListener(object : EndlessRecyclerOnScrollListener(viewManager) {
            override fun onLoadMore(current_page: Int) {
                getMoreImmigrations(current_page)
            }

        })

        retry_btn.setOnClickListener {
            getImmigrations(this)
        }

        recyclerView.adapter = ImmigrationsRecyclerViewAdapter(this, emptyList, {})

        if (savedInstanceState != null && !savedInstanceState.containsKey(Constants.PARCELIZED_POSTS)) {
            getImmigrations(this)
        }

        else if (savedInstanceState != null && savedInstanceState.containsKey(Constants.PARCELIZED_POSTS)) {
            UtilityMethods.hideErrorMessage(network_error_view, recyclerView)
            UtilityMethods.hideView(loading_view)
            this.immigrations = savedInstanceState.getParcelableArrayList(Constants.PARCELIZED_POSTS)!!
            recyclerView.adapter = ImmigrationsRecyclerViewAdapter(this, this.immigrations) { i: Immigration ->
                viewImmigration(i)
            }

        }

        else
            getImmigrations(this)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        if (::immigrations.isInitialized)
            outState?.putParcelableArrayList(Constants.PARCELIZED_POSTS, immigrations as ArrayList<out Parcelable>)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        NavUtils.navigateUpFromSameTask(this)
    }

    private fun getImmigrations(context: Context) {
        UtilityMethods.hideErrorMessage(network_error_view, recyclerView)
        UtilityMethods.showView(loading_view)

        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val api = retrofit.create(MigrationTimeAPI::class.java)

        val call = api.getImmigrations()

        call.enqueue(object: Callback<List<Immigration>> {

            override fun onResponse(call: Call<List<Immigration>>, response: Response<List<Immigration>>) {
                UtilityMethods.hideView(loading_view)

                val res = response.body()
                immigrations = res!!.filter{ i -> i.title != null }.toMutableList()

                recyclerView.adapter = ImmigrationsRecyclerViewAdapter(context, immigrations) {
                        immig: Immigration -> viewImmigration(immig)
                }

                (recyclerView.adapter as ImmigrationsRecyclerViewAdapter).notifyDataSetChanged()
            }

            override fun onFailure(call: Call<List<Immigration>>, t: Throwable) {
                Log.v("Error", t.toString())

                if (t is IOException) {
                    UtilityMethods.showErrorMessage(network_error_view, recyclerView)
                    UtilityMethods.hideView(loading_view)
                }
            }


        })

    }

    private fun getMoreImmigrations(page: Int) {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val api = retrofit.create(MigrationTimeAPI::class.java)

        val call = api.getImmigrations(page)

        call.enqueue(object: Callback<List<Immigration>> {

            override fun onResponse(call: Call<List<Immigration>>, response: Response<List<Immigration>>) {
                val header = response.headers()
                val res = response.body()

                val totalPages = header["X-WP-TotalPages"]?.toInt()

                if (totalPages != null) {
                    val immigs = res!!.filter{ i -> i.title != null }

                    immigrations.addAll(immigs)

                    (recyclerView.adapter as ImmigrationsRecyclerViewAdapter).notifyDataSetChanged()
                }

            }

            override fun onFailure(call: Call<List<Immigration>>, t: Throwable) {
                Log.v("Error", t.toString())

            }

        })
    }

    fun viewImmigration(immig: Immigration) {
        val intent = Intent(this, PostContentActivity::class.java).apply {
            putExtra(Constants.POST_TITLE, immig.title?.rendered)
            putExtra(Constants.POST_CONTENT, immig.content?.rendered)
            putExtra(Constants.IMAGE_URL, immig.jetPackFeaturedMediaUrl)
        }
        startActivity(intent)
    }
}
