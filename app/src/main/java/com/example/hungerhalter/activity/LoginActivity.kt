package com.example.hungerhalter.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.hungerhalter.R

class LoginActivity : AppCompatActivity() {

    lateinit var etMobileNumber: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    val number = "9988776655"
    val password = "12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val inputNumber = etMobileNumber.text.toString()
            val inputPassword = etPassword.text.toString()
            
            if(inputNumber == number && inputPassword == password){
                val intent = Intent(this@LoginActivity,MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this@LoginActivity, "Invalid Credentials", Toast.LENGTH_LONG).show()
            }
        }
    }
}