package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)

        val actionBar = supportActionBar

        actionBar!!.title = "Table Layout"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}