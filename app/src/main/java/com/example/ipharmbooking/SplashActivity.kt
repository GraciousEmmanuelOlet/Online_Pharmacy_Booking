package com.example.ipharmbooking

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val splash_screen = 3000L
        Handler().postDelayed({
            val i = Intent(this@SplashActivity,RegistrationActivity::class.java)
            startActivity(i)
            finish()
        },splash_screen)
    }
}
