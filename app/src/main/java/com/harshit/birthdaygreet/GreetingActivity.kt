package com.harshit.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreetingActivity : AppCompatActivity() {

    lateinit var txtGreeting: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        txtGreeting = findViewById(R.id.txtGreeting)

        val name = intent.getStringExtra("name")
        txtGreeting.text = "Happy Birthday $name!!!"

    }
}