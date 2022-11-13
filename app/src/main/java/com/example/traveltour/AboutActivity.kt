package com.example.traveltour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        var moveMainPageActivity : Button = findViewById(R.id.button_main)

        moveMainPageActivity.setOnClickListener{
            val moveMainPage = Intent(this@AboutActivity, MainActivity::class.java)
            startActivity(moveMainPage)
        }
    }
}