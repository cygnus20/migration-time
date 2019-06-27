package com.positron.migrationtimes

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Html
import android.view.View
import android.widget.Toast
import com.positron.migrationtimes.models.Job
import com.positron.migrationtimes.util.Constants
import com.positron.migrationtimes.util.UtilityMethods
import com.positron.migrationtimes.util.isEmailValid
import kotlinx.android.synthetic.main.activity_job_content.*
import kotlinx.android.synthetic.main.content_job_content.*
import kotlinx.android.synthetic.main.content_job_content.network_error_msg
import kotlinx.android.synthetic.main.network_error_view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException

class JobContentActivity : AppCompatActivity() {
    private lateinit var post: Job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_content)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        toolbar.setNavigationOnClickListener {
            this@JobContentActivity.onBackPressed()
        }

        val slug = intent.getStringExtra("slug")

        if (slug != null) {
            retry_btn.setOnClickListener {
                handleIntent(slug, savedInstanceState)
            }

            handleIntent(slug, savedInstanceState)
        }

        else {
            UtilityMethods.hideView(network_error_msg)
            UtilityMethods.hideView(loading_view)

            val title = intent.getStringExtra(Constants.POST_TITLE)
            val content = intent.getStringExtra(Constants.POST_CONTENT)
            val companyName = intent.getStringExtra(Constants.COMPANY_NAME)
            val jobLocation = intent.getStringExtra(Constants.JOB_LOCATION)
            val companyWebsite = intent.getStringExtra(Constants.COMPANY_WEBSITE)
            var companyApplication = intent.getStringExtra(Constants.COMPANY_APPLICATION_EMAIL)



            title_txtView.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                Html.fromHtml(title, Html.FROM_HTML_MODE_COMPACT).toString()
            else
                Html.fromHtml(title).toString()

            company_name_txtView.text = companyName
            job_location_txtView.text = jobLocation

            content_webView.loadData(content, "text/html", "UTF-8")

            apply_btn.setOnClickListener {
                if (companyApplication.isEmailValid()) {
                    val recipients = arrayOf(companyApplication)
                    val intent = Intent(Intent.ACTION_SENDTO).apply {
                        data = Uri.parse("mailto:") // only email apps should handle this
                        putExtra(Intent.EXTRA_EMAIL, recipients)
                        putExtra(Intent.EXTRA_SUBJECT, "Application for $title")
                    }
                    if (intent.resolveActivity(packageManager) != null) {
                        startActivity(intent)
                    }
                }

                else {
                    if (!companyApplication.startsWith("https://") && !companyApplication.startsWith("http://")){
                        companyApplication = "http://$companyApplication"
                    }
                    val intent = Intent(Intent.ACTION_VIEW).apply {
                        data = Uri.parse(companyApplication)
                    }

                    startActivity(intent)
                }

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
            UtilityMethods.hideView(loading_view)
            UtilityMethods.hideView(network_error_msg)

            post = savedInstanceState.getParcelable(Constants.PARCELIZED_POST)!!
            val title = post.title?.rendered
            val content = post.content?.rendered
            val companyName = post.fields?.companyName
            val jobLocation = post.fields?.jobLocation
            val companyWebsite = post.fields?.companyWebsite
            var companyApplication = post.fields?.application

            title_txtView.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                Html.fromHtml(title, Html.FROM_HTML_MODE_COMPACT).toString()
            else
                Html.fromHtml(title).toString()

            company_name_txtView.text = companyName
            job_location_txtView.text = jobLocation

            content_webView.loadData(content, "text/html", "UTF-8")

            apply_btn.setOnClickListener {
                if (companyApplication!!.isEmailValid()) {
                    val recipients = arrayOf(companyApplication)
                    val intent = Intent(Intent.ACTION_SENDTO).apply {
                        data = Uri.parse("mailto:") // only email apps should handle this
                        putExtra(Intent.EXTRA_EMAIL, recipients)
                    }
                    if (intent.resolveActivity(packageManager) != null) {
                        startActivity(intent)
                    }
                } else {
                    if (!companyApplication!!.startsWith("https://") && !companyApplication!!.startsWith("http://")) {
                        companyApplication = "http://$companyApplication"
                    }
                    val intent = Intent(Intent.ACTION_VIEW).apply {
                        data = Uri.parse(companyApplication)
                    }

                    startActivity(intent)
                }

            }

        }

        else {

            if (!::post.isInitialized) {
                UtilityMethods.hideView(loading_view)
                UtilityMethods.hideView(network_error_msg)

                title_txtView.text = "This listing has expired"
                company_name_txtView.visibility = View.GONE
                job_location_txtView.visibility = View.GONE
                content_webView.visibility = View.GONE
                job_location_icon.visibility = View.GONE
                apply_btn.visibility = View.GONE
            }

            else {
                UtilityMethods.showView(loading_view)
                UtilityMethods.hideView(network_error_msg)

                job_location_icon.visibility = View.GONE
                apply_btn.visibility = View.GONE

                try {
                    val res = withContext(Dispatchers.IO) {
                        service.getJobBySlug(slug)
                    }

                    //Do something with response e.g show to the UI.
                    val post = res.body()?.firstOrNull()

                    UtilityMethods.hideView(loading_view)

                    if (post == null) {
                        title_txtView.text = "This listing has expired"
                        company_name_txtView.visibility = View.GONE
                        job_location_txtView.visibility = View.GONE
                        content_webView.visibility = View.GONE
                        job_location_icon.visibility = View.GONE
                        apply_btn.visibility = View.GONE
                    } else {
                        job_location_icon.visibility = View.VISIBLE
                        apply_btn.visibility = View.VISIBLE

                        val title = post.title?.rendered
                        val content = post.content?.rendered
                        val companyName = post.fields?.companyName
                        val jobLocation = post.fields?.jobLocation
                        val companyWebsite = post.fields?.companyWebsite
                        var companyApplication = post.fields?.application

                        title_txtView.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                            Html.fromHtml(title, Html.FROM_HTML_MODE_COMPACT).toString()
                        else
                            Html.fromHtml(title).toString()

                        company_name_txtView.text = companyName
                        job_location_txtView.text = jobLocation

                        content_webView.loadData(content, "text/html", "UTF-8")

                        apply_btn.setOnClickListener {
                            if (companyApplication!!.isEmailValid()) {
                                val recipients = arrayOf(companyApplication)
                                val intent = Intent(Intent.ACTION_SENDTO).apply {
                                    data = Uri.parse("mailto:") // only email apps should handle this
                                    putExtra(Intent.EXTRA_EMAIL, recipients)
                                }
                                if (intent.resolveActivity(packageManager) != null) {
                                    startActivity(intent)
                                }
                            } else {
                                if (!companyApplication!!.startsWith("https://") && !companyApplication!!.startsWith("http://")) {
                                    companyApplication = "http://$companyApplication"
                                }
                                val intent = Intent(Intent.ACTION_VIEW).apply {
                                    data = Uri.parse(companyApplication)
                                }

                                startActivity(intent)
                            }

                        }
                    }
                }
                catch (e: HttpException) {
                    Toast.makeText(this@JobContentActivity, "Exception ${e.message}", Toast.LENGTH_LONG).show()
                }catch (e: IOException) {
                    UtilityMethods.hideView(loading_view)
                    UtilityMethods.showView(network_error_msg)
                } catch (e: Throwable) {
                    Toast.makeText(this@JobContentActivity, "Ooops: Something else went wrong ${e.message}", Toast.LENGTH_LONG).show()
                }
            }

        }

    }

}
