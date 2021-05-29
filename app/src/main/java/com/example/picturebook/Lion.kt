package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Lion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lion)
        var btnButton2=findViewById<Button>(R.id.btnbutton2)
        var btnButtonnex=findViewById<Button>(R.id.btnbuttonnex)

        btnButton2.setOnClickListener{

            var intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
        btnButtonnex.setOnClickListener{

            var intent= Intent(baseContext,Elephant::class.java)
           startActivity(intent)

               }
    }
}