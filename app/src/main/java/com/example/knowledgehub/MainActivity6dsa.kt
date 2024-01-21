package com.example.knowledgehub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity6dsa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity6dsa)
        val webView = findViewById<WebView>(R.id.dsa)

        WebViewsetup(webView)
    }
    private fun WebViewsetup(webView: WebView){
        webView.webViewClient= WebViewClient()
        webView.apply { loadUrl("https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/") }
    }
}