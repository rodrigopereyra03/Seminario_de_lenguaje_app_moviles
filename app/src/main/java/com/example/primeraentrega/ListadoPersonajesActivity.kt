package com.example.primeraentrega

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class ListadoPersonajesActivity : AppCompatActivity() {
    lateinit var btnBjorn: Button
    lateinit var btnLagertha: Button
    lateinit var btnRagnar: Button
    lateinit var btnFloki : Button
    lateinit var btnRollo : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado_personajes)

        btnBjorn = findViewById(R.id.botonBjorn)
        btnLagertha = findViewById(R.id.botonLagertha)
        btnRagnar = findViewById(R.id.botonRagnar)
        btnFloki = findViewById(R.id.botonFloki)
        btnRollo = findViewById(R.id.botonRollo)

        btnBjorn.setOnClickListener {
            abrirElementosActivity("Bjorn Iron Side", "Hijo de Ragnar y lider vikingo.")
        }

        btnLagertha.setOnClickListener {
            abrirElementosActivity("Lagertha", "Escudera y reina mas famosa del mundo.")
        }

        btnRagnar.setOnClickListener {
            abrirElementosActivity("Ragnar Lothbrok", "Rey legendario y protagonista de la serie.")
        }

        btnFloki.setOnClickListener{
            abrirElementosActivity("Floki","Arquitecto de barcos, construyo los barcos que llevaron a la gloria a Ragnar y sus hijos. Fue un gran creyente durante casi toda su vida de los dioses nordicos.")
        }

        btnRollo.setOnClickListener{
            abrirElementosActivity("Rollo Lothbrok","Cansado de estar a la sombra de todos los logros de su hermano Ragnar, decide traicionarlo y luchar por los franceces y llevar una vida cristiana. Luego se convertiria en Rey de Francia por sus grandes triunfos contra los Vikingos.")
        }

    }

    private fun abrirElementosActivity(nombrePersonaje: String, descripcionPersonaje: String) {
        val intent = Intent(this, ElementosActivity::class.java)
        intent.putExtra("nombrePersonaje", nombrePersonaje)
        intent.putExtra("descripcionPersonaje", descripcionPersonaje)
        startActivity(intent)
    }
}