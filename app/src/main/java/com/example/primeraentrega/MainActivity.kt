package com.example.primeraentrega

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {
    lateinit var video : VideoView
    lateinit var uri : Uri
    lateinit var mediaController: MediaController
    lateinit var toolbar: Toolbar
    lateinit var irAApi : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        saludarUsuario()

        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            supportActionBar?.hide()
        }else{
            supportActionBar?.show()
        }

        video = findViewById(R.id.videoView)
        uri = Uri.parse("android.resource://$packageName/raw/vikings_intro")
        video.setVideoURI(uri)


        mediaController = MediaController(this)
        video.setMediaController(mediaController)
        mediaController.setAnchorView(video)



        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = resources.getString(R.string.titulo)

        irAApi = findViewById(R.id.btApi)

        irAApi.setOnClickListener{
            val intentElementList = Intent(this, LlamadoApiActivity::class.java)
            startActivity(intentElementList)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.item_listado){
            val intentListado = Intent(this, ListadoActivity::class.java)
            startActivity(intentListado)
        }
        return super.onOptionsItemSelected(item)
    }

    private fun saludarUsuario(){
        var bundle: Bundle? = intent.extras
        if(bundle != null){
            var usuario = bundle?.getString(resources.getString(R.string.nombre_usuario))
            Toast.makeText(this,"Bienvenido/a $usuario", Toast.LENGTH_SHORT).show()
        }
    }
}