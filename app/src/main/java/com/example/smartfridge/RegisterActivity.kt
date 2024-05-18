package com.example.smartfridge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun btRegisterOnClick(view: View) {}
    fun btEnterOnClick(view: View) {
        var intent = Intent(this, EnterActivity::class.java)
        startActivity(intent)
    }
}