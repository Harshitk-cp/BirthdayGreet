package com.harshit.birthdaygreet

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

    lateinit var etInputName: EditText
    private lateinit var btnSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit = findViewById(R.id.btnSubmit)
        etInputName = findViewById(R.id.etInputName)

    }

        fun createBirthdayCard(view: View){

            val name = etInputName.editableText.toString()

            Toast.makeText(this@MainActivity, "HAPPY BIRTHDAY $name", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, GreetingActivity::class.java)
            intent.putExtra("name", name)
            startActivity(intent)




        }





}


