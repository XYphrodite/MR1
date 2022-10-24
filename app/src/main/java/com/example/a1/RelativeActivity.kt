package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RelativeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)

        val actionBar = supportActionBar
        actionBar!!.title = "LinearLayout"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}