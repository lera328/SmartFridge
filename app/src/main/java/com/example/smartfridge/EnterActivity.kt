package com.example.smartfridge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EnterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter)
    }

    fun btEnterOnClick(view: View) {
        var intent = Intent(this, WithFragmentsActivity::class.java)
        startActivity(intent)
    }
    fun btRegisterOnClick(view: View) {
        var intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}