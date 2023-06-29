package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Education : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)


        var buttonHome = findViewById<Button>(R.id.gotoHome)


        buttonHome.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}