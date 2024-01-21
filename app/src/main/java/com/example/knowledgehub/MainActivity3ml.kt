package com.example.knowledgehub

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity3ml : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity3ml)

        val WebView = findViewById<WebView>(R.id.wb)
        WebViewsetup(WebView)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun WebViewsetup(webView: WebView){
        webView.webViewClient= WebViewClient()
        webView.apply { settings.javaScriptEnabled= true

        settings.safeBrowsingEnabled=false
       loadUrl("http://faculty.washington.edu/otoomet/machinelearning-py/web-scraping.html")}


    }
}