package com.mondero.david.block1.p1.quiz

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ClickActivity : AppCompatActivity() {

    private lateinit var back: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click)

        back = findViewById(R.id.bt_back)
        back.setOnClickListener{
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }
    }
}