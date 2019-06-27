package com.positron.migrationtimes

import android.os.Bundle
import android.support.v4.app.NavUtils
import android.webkit.WebView
import com.positron.migrationtimes.util.Constants
import kotlinx.android.synthetic.main.activity_base.*
import kotlinx.android.synthetic.main.scholarship_activity.*

class ScholarshipsActivity : BaseActivity() {

    private lateinit var contentWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val contentFrameLayout = content_frame
        layoutInflater.inflate(R.layout.scholarship_activity, contentFrameLayout)

        contentWebView = content_webView
        contentWebView.webViewClient = MyWebViewClient(this)
        contentWebView.settings.javaScriptEnabled = true
        contentWebView.loadUrl(Constants.SCHOLARSHIP_URL)


    }

    override fun onBackPressed() {
        if (contentWebView.canGoBack())
            contentWebView.goBack()

        else {
            super.onBackPressed()
            NavUtils.navigateUpFromSameTask(this)
        }

    }
}
