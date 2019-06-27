package com.positron.migrationtimes

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Html
import android.widget.Toast
import com.positron.migrationtimes.models.Post
import com.positron.migrationtimes.util.Constants
import com.positron.migrationtimes.util.UtilityMethods
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_post_content.*
import kotlinx.android.synthetic.main.content_post_content.*
import kotlinx.android.synthetic.main.content_post_content.network_error_msg
import kotlinx.android.synthetic.main.network_error_view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException

class PostContentActivity : AppCompatActivity() {
    private lateinit var post: Post

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_content)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        toolbar.setNavigationOnClickListener {
            this@PostContentActivity.onBackPressed()
        }


        val slug = intent.getStringExtra("slug")
        val id = intent.getStringExtra("ID")

        when {
            slug != null -> {
                retry_btn.setOnClickListener {
                    handleIntent(slug, savedInstanceState)
                }

                handleIntent(slug, savedInstanceState)
            }
            id != null -> {
                retry_btn.setOnClickListener {
                    handleIntent(id.toInt(), savedInstanceState)
                }

                handleIntent(id.toInt(), savedInstanceState)
            }
            else -> {
                UtilityMethods.hideView(network_error_msg)
                UtilityMethods.hideView(loading_view)

                val title = intent.getStringExtra(Constants.POST_TITLE)
                val content = intent.getStringExtra(Constants.POST_CONTENT)
                val imageUrl = intent.getStringExtra(Constants.IMAGE_URL)

                title_txtView.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                    Html.fromHtml(title, Html.FROM_HTML_MODE_COMPACT).toString()
                else
                    Html.fromHtml(title).toString()

                content_txtView.loadData(content.toString(), "text/html","UTF-8")

                Picasso.get().load(imageUrl).fit().centerCrop().into(thumbnail_imgview)
            }
        }

    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        if (::post.isInitialized)
            outState?.putParcelable(Constants.PARCELIZED_POST, post)
    }

    private fun handleIntent(slug: String, savedInstanceState: Bundle?) = GlobalScope.launch(Dispatchers.Main) {
        val service = UtilityMethods.migrationTimeService()


        if (savedInstanceState != null && savedInstanceState.containsKey(Constants.PARCELIZED_POST)) {
            post = savedInstanceState.getParcelable(Constants.PARCELIZED_POST)!!

            title_txtView.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                Html.fromHtml(post.title?.rendered, Html.FROM_HTML_MODE_COMPACT).toString()
            else
                Html.fromHtml(post.title?.rendered).toString()

            content_txtView.loadData(post.content.toString(), "text/html", "UTF-8")

            Picasso.get().load(post.jetPackFeaturedMediaUrl).fit().centerCrop().into(thumbnail_imgview)
        }

        else {
            UtilityMethods.showView(loading_view)
            UtilityMethods.hideView(network_error_msg)

            try {
                val res = withContext(Dispatchers.IO) {
                    service.getPostBySlug(slug)
                }

                //Do something with response e.g show to the UI.
                post = res.body()!!.first()

                UtilityMethods.hideView(loading_view)

                val title = post.title?.rendered
                val content = post.content?.rendered
                val imageUrl = post.jetPackFeaturedMediaUrl

                title_txtView.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                    Html.fromHtml(title, Html.FROM_HTML_MODE_COMPACT).toString()
                else
                    Html.fromHtml(title).toString()

                content_txtView.loadData(content.toString(), "text/html", "UTF-8")

                Picasso.get().load(imageUrl).fit().centerCrop().into(thumbnail_imgview)
            }
            catch (e: HttpException) {
                Toast.makeText(this@PostContentActivity, "Exception ${e.message}", Toast.LENGTH_LONG).show()
            }catch (e: IOException) {
                UtilityMethods.hideView(loading_view)
                UtilityMethods.showView(network_error_msg)
            } catch (e: Throwable) {
                Toast.makeText(this@PostContentActivity, "Ooops: Something else went wrong ${e.message}", Toast.LENGTH_LONG).show()
            }
        }


    }

    private fun handleIntent(Id: Int, savedInstanceState: Bundle?) = GlobalScope.launch(Dispatchers.Main) {
        val service = UtilityMethods.migrationTimeService()

        if (savedInstanceState != null && savedInstanceState.containsKey(Constants.PARCELIZED_POST)) {
            UtilityMethods.hideView(loading_view)
            UtilityMethods.hideView(network_error_msg)

            post = savedInstanceState.getParcelable(Constants.PARCELIZED_POST)!!

            title_txtView.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                Html.fromHtml(post.title?.rendered, Html.FROM_HTML_MODE_COMPACT).toString()
            else
                Html.fromHtml(post.title?.rendered).toString()

            content_txtView.loadData(post.content.toString(), "text/html", "UTF-8")

            Picasso.get().load(post.jetPackFeaturedMediaUrl).fit().centerCrop().into(thumbnail_imgview)
        }

        else {
            UtilityMethods.showView(loading_view)
            UtilityMethods.hideView(network_error_msg)

            try {
                val res = withContext(Dispatchers.IO) {
                    service.getPostById(Id.toString())
                }

                //Do something with response e.g show to the UI.
                post = res.body()!!

                UtilityMethods.hideView(loading_view)

                val title = post.title?.rendered
                val content = post.content?.rendered
                val imageUrl = post.jetPackFeaturedMediaUrl

                title_txtView.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                    Html.fromHtml(title, Html.FROM_HTML_MODE_COMPACT).toString()
                else
                    Html.fromHtml(title).toString()

                content_txtView.loadData(content.toString(), "text/html", "UTF-8")

                Picasso.get().load(imageUrl).fit().centerCrop().into(thumbnail_imgview)
            }
            catch (e: HttpException) {
                Toast.makeText(this@PostContentActivity, "Exception ${e.message}", Toast.LENGTH_LONG).show()
            }catch (e: IOException) {
                UtilityMethods.hideView(loading_view)
                UtilityMethods.showView(network_error_msg)
            } catch (e: Throwable) {
                Toast.makeText(this@PostContentActivity, "Ooops: Something else went wrong ${e.message}", Toast.LENGTH_LONG).show()
            }
        }

    }

}
