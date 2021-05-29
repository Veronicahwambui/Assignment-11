package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Giraffee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giraffee)


        var btnPrevious2=findViewById<Button>(R.id.btnprevious2)
        var btnNext3=findViewById<Button>(R.id.btnnext3)

        btnPrevious2.setOnClickListener {
            var intent= Intent(baseContext,Elephant::class.java)
            startActivity(intent)
        }
        btnNext3.setOnClickListener {
            var intent= Intent(baseContext,Bear::class.java)
            startActivity(intent)
        }
    }
}