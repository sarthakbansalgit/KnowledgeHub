package com.example.knowledgehub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity5cloud : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity5cloud)
        val webView = findViewById<WebView>(R.id.cloud)
        WebViewsetup(webView)


    }
    private fun WebViewsetup(webView: WebView){
        webView.webViewClient= WebViewClient()
        webView.apply { loadUrl("https://www.koombea.com/blog/what-is-cloud-application-development/") }

    }
}