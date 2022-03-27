package com.example.welcome_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val subBtn : Button = findViewById(R.id.enterButton)
    }
    fun welcomeMsg(v: View): Unit {
        var firstName: EditText = findViewById(R.id.firstNameText)
        var lastName: EditText = findViewById(R.id.lastNameText)
        var outputMsg: TextView =  findViewById(R.id.finalOutput)

        outputMsg.text = "Welcome "+firstName.text+" "+lastName.text+"!"

    }
}