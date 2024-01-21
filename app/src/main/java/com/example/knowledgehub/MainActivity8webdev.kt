package com.example.knowledgehub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity8webdev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity8webdev)

        val webView
                = findViewById<WebView>(R.id.webdev)

        WebViewsetup(webView)
    }
    private fun WebViewsetup(webView: WebView){
        webView.webViewClient= WebViewClient()
        webView.apply { loadUrl("https://web.dev/learn") }
    }
}

