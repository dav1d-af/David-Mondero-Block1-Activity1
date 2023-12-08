package com.mondero.david.block1.p1.quiz

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var clickMe: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickMe = findViewById(R.id.bt_clickable)
        clickMe.setOnClickListener{
            val intent = Intent(this, ClickActivity :: class.java)
            startActivity(intent)
        }
    }
}