package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener{
            Toast.makeText(applicationContext,"You are Redirecting to knoledge heaven ",Toast.LENGTH_SHORT).show()
            val i = Intent(applicationContext, MainActivity2::class.java)
            startActivity(i)

        }











    }
}