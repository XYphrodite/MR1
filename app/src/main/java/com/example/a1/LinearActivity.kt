package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class LinearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        val actionBar = supportActionBar

        /*if(actionBar!=null){
            actionBar.title = "LinearLayout"
        }*/
        //the same, but more clear
        actionBar!!.title = "LinearLayout"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}