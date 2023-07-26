package com.example.firstproject

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var num : EditText
    private lateinit var submit : Button
    fun click()
    {
        val n = Random.nextInt(from = 0, until = 100)
        submit.setOnClickListener {
            val g = num.text.toString()
            val guess = g.toInt()
            if(guess==n)
            {
                Toast.makeText(applicationContext, "Congratulations", Toast.LENGTH_SHORT).show()
            }

            else if(guess>n)
            {
                Toast.makeText(applicationContext, "Decrease your guess number", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(applicationContext, "Increase your guess number", Toast.LENGTH_SHORT).show()
            }
        }
    }
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            num = findViewById(R.id.guess)
            submit = findViewById(R.id.submit)
            click()



    }
}