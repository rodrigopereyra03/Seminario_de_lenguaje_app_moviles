package com.example.primeraentrega


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.primeraentrega.adapter.PersonajeAdapter


class ListadoActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var personajesLista : ArrayList<Personajes>
    private lateinit var personajeAdapter : PersonajeAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado)




        recyclerView = findViewById(R.id.recyclerPersonajes)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        personajesLista = ArrayList()

        personajesLista.add(Personajes(R.drawable.bjorn,"Bjorn","Hijo de Ragnar y lider vikingo."))
        personajesLista.add(Personajes(R.drawable.lagertha,"Lagherta","Escudera y reina mas famosa del mundo."))
        personajesLista.add(Personajes(R.drawable.ragnar7,"Ragnar","Rey legendario y protagonista de la serie."))
        personajesLista.add(Personajes(R.drawable.floki5,"Floki","Arquitecto de barcos, construyo los barcos que llevaron a la gloria a Ragnar y sus hijos."))
        personajesLista.add(Personajes(R.drawable.rollo7,"Rollo","Rey de Francia y hermano de Ragnar"))


        personajeAdapter = PersonajeAdapter(personajesLista)
        recyclerView.adapter = personajeAdapter

        personajeAdapter.onItemClick = {
            val intent = Intent(this, ElementosActivity::class.java)
            intent.putExtra("personaje",it)
            startActivity(intent)

        }


    }





}