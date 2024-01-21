package com.example.knowledgehub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity4app : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity4app)
        val  WebView = findViewById<WebView>(R.id.app)

        WebViewsetup(WebView)

    }
    private fun WebViewsetup(webView: WebView){
       webView.webViewClient= WebViewClient()
        webView.apply { loadUrl("https://developer.android.com") }
    }

}