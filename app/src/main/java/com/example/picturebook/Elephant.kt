package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Elephant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elephant)


        var btnprevious1=findViewById<Button>(R.id.btnprevious1)
        var btnNext2=findViewById<Button>(R.id.btnnext2)

        btnprevious1.setOnClickListener {
            var intent=Intent(baseContext,Lion::class.java)
            startActivity(intent)
        }
        btnNext2.setOnClickListener {
            var intent=Intent(baseContext,Giraffee::class.java)
            startActivity(intent)
        }
    }
}