package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnButton1=findViewById<Button>(R.id.btnbutton1)

        btnButton1.setOnClickListener{

            var intent=Intent(baseContext,Lion::class.java)
            startActivity(intent)
        }
    }
}