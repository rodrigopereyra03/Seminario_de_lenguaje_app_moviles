package com.example.primeraentrega.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView


import com.example.primeraentrega.Personajes
import com.example.primeraentrega.R


class PersonajeAdapter(private val listaDePersonajes: ArrayList<Personajes>): RecyclerView.Adapter<PersonajeAdapter.PersonajeViewHolder>(){

    var onItemClick : ((Personajes) -> Unit)? = null
    class PersonajeViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imagenesPersonajes)
        val textView : TextView = itemView.findViewById(R.id.idPersonajeNombre)
    }
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_personjes,parent,false)
         return PersonajeViewHolder(view)
     }

     override fun getItemCount(): Int {
         return listaDePersonajes.size
     }

     override fun onBindViewHolder(holder: PersonajeViewHolder, position: Int) {
         val item = listaDePersonajes[position]
         holder.imageView.setImageResource(item.idImagen)
         holder.textView.text = item.personaje


         holder.itemView.setOnClickListener {
             onItemClick?.invoke(item)
         }



     }

 }