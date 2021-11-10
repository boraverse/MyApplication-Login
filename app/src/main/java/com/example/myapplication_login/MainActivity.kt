package com.example.myapplication_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button as Button1

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn_intent)

        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_intent ->{
                val intentBiasa = Intent(this@MainActivity, RegisterActivity2::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}