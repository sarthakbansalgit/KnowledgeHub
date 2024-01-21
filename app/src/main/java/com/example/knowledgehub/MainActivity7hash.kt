package com.example.knowledgehub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity7hash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity7hash)
        val webView = findViewById<WebView>(R.id.hash)

        WebViewsetup(webView)
    }
    private fun WebViewsetup(webView: WebView){
        webView.webViewClient= WebViewClient()
        webView.apply { loadUrl("https://rejolut.com/blog/hashing-in-blockchain/#:~:text=Hashing%20is%20a%20fundamental%20process,characters%20known%20as%20a%20hash.")}
    }
}

