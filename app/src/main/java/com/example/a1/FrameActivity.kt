package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FrameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame)

        val actionBar = supportActionBar
        actionBar!!.title = "LinearLayout"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}