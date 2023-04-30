package com.example.learningbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.connecting_interface_with_logic)

        val txtUsername: TextView = findViewById(R.id.txt_username)
        val txtEmail: TextView = findViewById(R.id.txt_email)

        txtUsername.text = "Hello World"
        txtEmail.setText(R.string.txt_username_value)
    }
}