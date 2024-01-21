package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val ml = findViewById<TextView>(R.id.ml)

        ml.setOnClickListener {
            val i = Intent(applicationContext, MainActivity3ml::class.java)
            startActivity(i)
        }


        val app = findViewById<TextView>(R.id.app)

        app.setOnClickListener {
            val i = Intent(applicationContext, MainActivity4app::class.java)
            startActivity(
                i
            )
        }

        val cloud = findViewById<TextView>(R.id.cloud)

        app.setOnClickListener {
            val i = Intent(applicationContext, MainActivity5cloud::class.java)
            startActivity(i)
        }
        val dsa = findViewById<TextView>(R.id.dsa)
        dsa.setOnClickListener {
            val i = Intent(applicationContext, MainActivity6dsa::class.java)
            startActivity(i)
        }
        val hash = findViewById<TextView>(R.id.hash)
        hash.setOnClickListener {
            val i = Intent(applicationContext,MainActivity7hash::class.java)
            startActivity(i)
        }
        val webdev = findViewById<TextView>(R.id.webdev)
        hash.setOnClickListener {
            val i = Intent(applicationContext,MainActivity8webdev::class.java)
            startActivity(i)
        }

        val ct = findViewById<TextView>(R.id.ct)
        hash.setOnClickListener {
            val i = Intent(applicationContext,MainActivity9contactus::class.java)
            startActivity(i)
        }
    }}


