package com.example.primeraentrega

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ElementosActivity : AppCompatActivity() {
    lateinit var textViewNombre: TextView
    lateinit var textViewDescripcion: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elementos)

        textViewNombre = findViewById(R.id.textViewNombre)
        textViewDescripcion = findViewById(R.id.textViewDescripcion)

        val nombrePersonaje = intent.getStringExtra("nombrePersonaje")
        val descripcionPersonaje = intent.getStringExtra("descripcionPersonaje")

        textViewNombre.text = nombrePersonaje
        textViewDescripcion.text = descripcionPersonaje
    }
}
