package com.example.bank

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
class MainFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_compact1)
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/MwcqY0PnT5/aaa2o17r_expires_30_days.png").into(findViewById(R.id.r2stmndlc4ss))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/MwcqY0PnT5/sjb99tma_expires_30_days.png").into(findViewById(R.id.rv1wfzsbdzji))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/MwcqY0PnT5/ptmq0ctj_expires_30_days.png").into(findViewById(R.id.ro9gvy4m6rw))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/MwcqY0PnT5/80s3f0pq_expires_30_days.png").into(findViewById(R.id.rqmwhiamkop))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/MwcqY0PnT5/72ul9rky_expires_30_days.png").into(findViewById(R.id.rpholdb7qy7))
        val button1: View = findViewById(R.id.r49w6jta2oxn)
        button1.setOnClickListener {
            println("Pressed")
        }
        val button2: View = findViewById(R.id.rlo34rnplh2)
        button2.setOnClickListener {
            println("Pressed")
        }
        val button3: View = findViewById(R.id.rw5w57psn0y)
        button3.setOnClickListener {
            println("Pressed")
        }
        val button4: View = findViewById(R.id.r548u7uv4bfs)
        button4.setOnClickListener {
            println("Pressed")
        }
    }
}