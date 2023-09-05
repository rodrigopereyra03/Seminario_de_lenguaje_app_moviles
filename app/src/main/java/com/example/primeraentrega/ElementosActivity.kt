package com.example.primeraentrega

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ElementosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elementos)

        val personaje = intent.getParcelableExtra<Personajes>("personaje")
        if (personaje != null){
            val textView : TextView = findViewById(R.id.textViewNombre)
            val textView2 : TextView = findViewById(R.id.textViewDescripcion)

            textView.text = personaje.personaje
            textView2.text = personaje.descripcion
        }

    }
}
