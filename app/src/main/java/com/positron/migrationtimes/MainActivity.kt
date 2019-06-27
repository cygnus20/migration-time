package com.positron.migrationtimes

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.positron.migrationtimes.adapters.PostsRecyclerViewAdapter
import com.positron.migrationtimes.models.Post
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


class MainActivity : BaseActivity() {

    lateinit var recyclerView: RecyclerView
    private lateinit var viewManager: LinearLayoutManager
    private lateinit var posts: MutableList<Post>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val contentFrameLayout = content_frame

        val emptyList: List<Post> = listOf()

        layoutInflater.inflate(R.layout.activity_main, contentFrameLayout)

        handleIntent()

        viewManager = LinearLayoutManager(this)

        recyclerView = recycler_view.apply {
            layoutManager = viewManager

        }

        recyclerView.addOnScrollListener(object : EndlessRecyclerOnScrollListener(viewManager) {
            override fun onLoadMore(current_page: Int) {
                getMorePosts(current_page)
            }

        })

        retry_btn.setOnClickListener {
            getPosts(this)
        }

        recyclerView.adapter = PostsRecyclerViewAdapter(this, emptyList, {})

        if (savedInstanceState != null && !savedInstanceState.containsKey(Constants.PARCELIZED_POSTS)) {
            getPosts(this)
        }


        else if (savedInstanceState != null && savedInstanceState.containsKey(Constants.PARCELIZED_POSTS)) {
            UtilityMethods.hideErrorMessage(network_error_view, recyclerView)
            UtilityMethods.hideView(loading_view)
            this.posts = savedInstanceState.getParcelableArrayList(Constants.PARCELIZED_POSTS)!!
            recyclerView.adapter = PostsRecyclerViewAdapter(this, this.posts) {
                    p: Post -> viewPost(p)
            }
        }

        else
            getPosts(this)



        //recyclerView.adapter = LatestTipsRecyclerViewAdapter(this, TipsRepository.getAllTips())

    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        setIntent(intent)

        handleIntent()

    }



    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        if (::posts.isInitialized)
            outState?.putParcelableArrayList(Constants.PARCELIZED_POSTS, posts as ArrayList<out Parcelable>)
    }

    private fun getPosts(context: Context) {
        UtilityMethods.hideErrorMessage(network_error_view, recyclerView)
        UtilityMethods.showView(loading_view)

        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val api = retrofit.create(MigrationTimeAPI::class.java)

        val call = api.getPosts()

        call.enqueue(object: Callback<List<Post>> {

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                UtilityMethods.hideView(loading_view)

                val res = response.body()
                posts = res!!.filter{ i -> i.title != null }.toMutableList()

                recyclerView.adapter = PostsRecyclerViewAdapter(context, posts) {
                        post: Post -> viewPost(post)
                }

                (recyclerView.adapter as PostsRecyclerViewAdapter).notifyDataSetChanged()
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                Log.v("Error", t.toString())

                if (t is IOException) {
                    UtilityMethods.showErrorMessage(network_error_view, recyclerView)
                    UtilityMethods.hideView(loading_view)
                }
            }

        })

    }

    private fun getMorePosts(page: Int) {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val api = retrofit.create(MigrationTimeAPI::class.java)

        val call = api.getPosts(page)

        call.enqueue(object: Callback<List<Post>> {

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                val header = response.headers()
                val res = response.body()

                val totalPages = header["X-WP-TotalPages"]?.toInt()

                if (totalPages != null) {
                    val newPosts = res!!.filter{ i -> i.title != null }

                    posts.addAll(newPosts)

                    (recyclerView.adapter as PostsRecyclerViewAdapter).notifyDataSetChanged()
                }

            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                Log.v("Error", t.toString())

            }

        })
    }

    private fun viewPost(post: Post) {
        val intent = Intent(this, PostContentActivity::class.java).apply {
            putExtra(Constants.POST_TITLE, post.title?.rendered)
            putExtra(Constants.POST_CONTENT, post.content?.rendered)
            putExtra(Constants.IMAGE_URL, post.jetPackFeaturedMediaUrl)
        }
        startActivity(intent)
    }

    private fun handleIntent() {
        val data = this.intent.data

        if (data != null && data.isHierarchical) {
            val uri = this.intent.dataString
            val paths = parseUri(uri)

            when (paths) {
                "/section/visa/" -> {
                    val newIntent = Intent(this, VisasActivity::class.java)
                    Log.i("MyAppVisa", "Deep link clicked $uri $paths")
                    startActivity(newIntent)
                }
                "/section/work/" -> {
                    val newIntent = Intent(this, WorksActivity::class.java)
                    Log.i("MyAppVisa", "Deep link clicked $uri $paths")
                    startActivity(newIntent)
                }
                "/section/study/" -> {
                    val newIntent = Intent(this, StudiesActivity::class.java)
                    Log.i("MyAppVisa", "Deep link clicked $uri $paths")
                    startActivity(newIntent)
                }
                "/jobs/" -> {
                    val newIntent = Intent(this, JobsActivity::class.java)
                    Log.i("MyAppVisa", "Deep link clicked $uri $paths")
                    startActivity(newIntent)
                }
                getPatternSlug().toRegex().find(paths)?.value -> {
                    val slug = paths.removeSurrounding("/")

                    val newIntent = Intent(this, PostContentActivity::class.java).apply {
                        putExtra("slug", slug)
                    }
                    Log.i("MyAppVisa", "Deep link clicked $uri $paths")
                    startActivity(newIntent)

                }

                getPatternJob().toRegex().find(paths)?.value -> {
                    val slug = paths.replace("/job", "").removeSurrounding("/")

                    val newIntent = Intent(this, JobContentActivity::class.java).apply {
                        putExtra("slug", slug)
                    }
                    Log.i("MyAppVisa", "Deep link clicked $uri $slug")
                    startActivity(newIntent)
                }

                getPatternID().toRegex().find(paths)?.value -> {
                    val slug = paths.replace("/", "")

                    val newIntent = Intent(this, PostContentActivity::class.java).apply {
                        putExtra("ID", slug)
                    }
                    Log.i("MyAppVisa", "Deep link clicked $uri $slug")
                    startActivity(newIntent)
                }
            }

            Log.i("MyApp", "Deep link clicked $uri \n$paths")
        }
    }

    private fun parseUri(uri: String?) : String {
        var pathList = uri?.substringAfter("://")?.split("/")
        pathList = pathList?.subList(1, pathList.size)

        var path = ""

        for (i in pathList!!) path += "/$i"

        return path

    }

    private fun getPatternSlug() = "\\/[a-zA-Z0-9]*-[-a-zA-Z0-9]*\\/"

    private fun getPatternID() = "\\/[0-9]+\\/*"

    private fun getPatternSlugDig() = "\\/[0-9]*-[0-9]*\\/"

    private fun getPatternJob() = "\\/job\\/[a-zA-Z0-9]*-[-a-zA-Z0-9]*\\/"



}
