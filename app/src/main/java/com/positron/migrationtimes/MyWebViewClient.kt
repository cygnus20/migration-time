package com.positron.migrationtimes

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.webkit.WebView
import android.webkit.WebViewClient

class MyWebViewClient(context: Context) : WebViewClient() {
    private var cont: Context = context

    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
        if (Uri.parse(url).host == "https://migrationtime.com" && Uri.parse(url)?.path!!.contains("scholarship")) {
            // This is my web site, so do not override; let my WebView load the page
            return false
        }
        // Otherwise, the link is not for a page on my site, so launch another Activity that handles URLs
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).apply {
            cont.startActivity(this)
        }
        return true
    }
}