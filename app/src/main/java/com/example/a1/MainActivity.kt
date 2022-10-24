package com.example.a1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.title = "Start screen"

        val secondActivityBtn: Button = findViewById(R.id.LinearActivityBtn)
        secondActivityBtn.setOnClickListener{
            val intent = Intent(this,LinearActivity::class.java)
            startActivity(intent)
        }

        val TableActivityBtn: Button = findViewById(R.id.TableActivityBtn)
        TableActivityBtn.setOnClickListener{
            val intent = Intent(this,TableActivity::class.java)
            startActivity(intent)
        }

        val GridActivityBtn: Button = findViewById(R.id.GridActivityBtn)
        GridActivityBtn.setOnClickListener{
            val intent = Intent(this,GridActivity::class.java)
            startActivity(intent)
        }

        val RelativeActivityBtn: Button = findViewById(R.id.RelativeActivityBtn)
        RelativeActivityBtn.setOnClickListener{
            val intent = Intent(this,RelativeActivity::class.java)
            startActivity(intent)
        }



    }


}