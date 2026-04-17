package com.example.bank

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class HistoryFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_history)
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/MwcqY0PnT5/mjhv21km_expires_30_days.png").into(findViewById(R.id.r6nq3phk6k4u))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/MwcqY0PnT5/4oi0eitd_expires_30_days.png").into(findViewById(R.id.r7ea8p2855ls))
    }
}