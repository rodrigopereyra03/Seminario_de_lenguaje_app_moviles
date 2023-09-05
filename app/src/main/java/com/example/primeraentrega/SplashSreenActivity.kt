package com.example.primeraentrega

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashSreenActivity : AppCompatActivity() {
    private val demora : Long = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_sreen)

        val r = Runnable {
            intent = Intent(this, PantallaPrincipalActivity::class.java)
            startActivity(intent)
            finish()
        }
    Handler(Looper.getMainLooper()).postDelayed(r,demora)
    }
}