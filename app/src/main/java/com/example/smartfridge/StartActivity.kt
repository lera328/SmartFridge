package com.example.smartfridge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
        val fridgeApi = RetrofitHelper.getInstance().create(ApiService::class.java)
        // launching a new coroutine
            GlobalScope.launch {
            val result = fridgeApi.getProducts()
            if (result != null)
            // Checking the results
                Log.d("ayush: ", result.body().toString())
        }**/

    }

    fun btEnterOnClick(view: View) {
        var intent = Intent(this, EnterActivity::class.java)
        startActivity(intent)
    }

    fun btRegisterOnClick(view: View) {
        var intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}