package com.example.knowledgehub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity9contactus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity9contactus)
        val webView
                = findViewById<WebView>(R.id.ct)

        WebViewsetup(webView)
    }
    private fun WebViewsetup(webView: WebView){
        webView.webViewClient= WebViewClient()
        webView.apply { loadUrl("https://www.linkedin.com/in/sarthak-bansal-11aa83201/") }
    }
}