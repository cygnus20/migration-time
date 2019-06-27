package com.positron.migrationtimes

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.support.v4.app.NavUtils
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.positron.migrationtimes.adapters.VisasRecyclerViewAdapter
import com.positron.migrationtimes.models.Visa
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

class VisasActivity : BaseActivity() {

    lateinit var recyclerView: RecyclerView
    private lateinit var viewManager: LinearLayoutManager
    private lateinit var visas: MutableList<Visa>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val contentFrameLayout = content_frame

        var emptyList: List<Visa> = listOf()

        layoutInflater.inflate(R.layout.activity_main, contentFrameLayout)

        viewManager = LinearLayoutManager(this)

        recyclerView = recycler_view.apply {
            layoutManager = viewManager

        }

        recyclerView.addOnScrollListener(object : EndlessRecyclerOnScrollListener(viewManager) {
            override fun onLoadMore(current_page: Int) {
                getMoreVisas(current_page)
            }

        })

        retry_btn.setOnClickListener {
            getVisas(this)
        }

        recyclerView.adapter = VisasRecyclerViewAdapter(this, emptyList, {})

        if (savedInstanceState != null && !savedInstanceState.containsKey(Constants.PARCELIZED_POSTS)) {
            getVisas(this)
        }

        else if (savedInstanceState != null && savedInstanceState.containsKey(Constants.PARCELIZED_POSTS)) {
            UtilityMethods.hideErrorMessage(network_error_view, recyclerView)
            UtilityMethods.hideView(loading_view)
            this.visas = savedInstanceState.getParcelableArrayList(Constants.PARCELIZED_POSTS)!!
            recyclerView.adapter = VisasRecyclerViewAdapter(this, this.visas) {
                    v: Visa -> viewVisa(v)
            }

        }

        else
            getVisas(this)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        if (::visas.isInitialized)
            outState?.putParcelableArrayList(Constants.PARCELIZED_POSTS, visas as ArrayList<out Parcelable>)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        NavUtils.navigateUpFromSameTask(this)
    }

    private fun getVisas(context: Context) {
        UtilityMethods.hideErrorMessage(network_error_view, recyclerView)
        UtilityMethods.showView(loading_view)

        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val api = retrofit.create(MigrationTimeAPI::class.java)

        val call = api.getVisas()

        call.enqueue(object: Callback<List<Visa>> {

            override fun onResponse(call: Call<List<Visa>>, response: Response<List<Visa>>) {
                UtilityMethods.hideView(loading_view)

                val res = response.body()
                visas = res!!.filter{ i -> i.title != null }.toMutableList()

                recyclerView.adapter = VisasRecyclerViewAdapter(context, visas) {
                    visa: Visa -> viewVisa(visa)
                }

                (recyclerView.adapter as VisasRecyclerViewAdapter).notifyDataSetChanged()
            }

            override fun onFailure(call: Call<List<Visa>>, t: Throwable) {
                Log.v("Error", t.toString())

                if (t is IOException) {
                    UtilityMethods.showErrorMessage(network_error_view, recyclerView)
                    UtilityMethods.hideView(loading_view)
                }
            }

        })

    }

    private fun getMoreVisas(page: Int) {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val api = retrofit.create(MigrationTimeAPI::class.java)

        val call = api.getVisas(page)

        call.enqueue(object: Callback<List<Visa>> {

            override fun onResponse(call: Call<List<Visa>>, response: Response<List<Visa>>) {
                val header = response.headers()
                val res = response.body()

                val totalPages = header["X-WP-TotalPages"]?.toInt()

                if (totalPages != null) {
                    val newVisas = res!!.filter{ i -> i.title != null }

                    visas.addAll(newVisas)

                    (recyclerView.adapter as VisasRecyclerViewAdapter).notifyDataSetChanged()
                }

            }

            override fun onFailure(call: Call<List<Visa>>, t: Throwable) {
                Log.v("Error", t.toString())

            }

        })
    }

    fun viewVisa(visa: Visa) {
        val intent = Intent(this, PostContentActivity::class.java).apply {
            putExtra(Constants.POST_TITLE, visa.title?.rendered)
            putExtra(Constants.POST_CONTENT, visa.content?.rendered)
            putExtra(Constants.IMAGE_URL, visa.jetPackFeaturedMediaUrl)
        }
        startActivity(intent)
    }


}