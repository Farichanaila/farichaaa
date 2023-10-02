package com.example.farichaaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.farichaaa.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 = findViewById<Button>(R.id.button)
        button1.setOnClickListener {
            val Intent = Intent(this, MainActivity2::class.java)
            startActivity(Intent)
        }
        var button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val intent1 = Intent(this, MainActivity3::class.java)
            startActivity(intent1)
        }
    }
}