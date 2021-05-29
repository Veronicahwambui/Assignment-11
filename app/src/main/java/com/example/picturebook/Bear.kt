package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bear)

        var btnPrevious4=findViewById<Button>(R.id.btnprevious4)


        btnPrevious4.setOnClickListener {
            var intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }




    }
}