package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonSkills = findViewById<Button>(R.id.btnSkills)

        buttonSkills.setOnClickListener {
            intent = Intent(this, skillsActivity::class.java)
            startActivity(intent)



        }

        var buttonEdu = findViewById<Button>(R.id.btnEdu)

        buttonEdu.setOnClickListener {

            intent = Intent(this, Education::class.java)
            startActivity(intent)
        }
    }
}