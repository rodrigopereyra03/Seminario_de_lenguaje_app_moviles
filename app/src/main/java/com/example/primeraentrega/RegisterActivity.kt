package com.example.primeraentrega

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    lateinit var etName : EditText
    lateinit var etEmail : EditText
    lateinit var etPass : EditText
    lateinit var etPass2 : EditText
    lateinit var cbTerminos : CheckBox
    lateinit var btnCrear : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etPass = findViewById(R.id.etPass)
        etPass2 = findViewById(R.id.etPass2)
        cbTerminos = findViewById(R.id.cbCondiciones)
        btnCrear = findViewById(R.id.btnCrear)

        var usuarioCreado = false

        btnCrear.setOnClickListener{
            var mensaje = "Cuenta Creada"
            var nombre = etName.text.toString()
            var correo = etEmail.text.toString()
            var contraseña = etPass.text.toString()
            var confirmacion = etPass2.text.toString()



            if (nombre.isEmpty() || correo.isEmpty() || contraseña.isEmpty()){
                Toast.makeText(this,"- Para continuar llene todos los campos -", Toast.LENGTH_SHORT).show()
            }else{
                if(contraseña.length < 6){
                    Toast.makeText(this,"- Contraseña corta -", Toast.LENGTH_SHORT).show()
                }else{
                    if (contraseña.equals(confirmacion) && cbTerminos.isChecked){
                        Toast.makeText(this,"- Usuario creado correctamente -", Toast.LENGTH_SHORT).show()
                        usuarioCreado = true
                    }else{
                        Toast.makeText(this,"- No acepto las condiciones o las contraseñas no coinciden -",Toast.LENGTH_SHORT).show()
                    }
                    if(usuarioCreado == true) {
                        //Una vez registrado, pasa a la pantalla de Listado de personajes
                        val intentElementList = Intent(this, ListadoActivity::class.java)
                        startActivity(intentElementList)

                        finish()
                    }
                }
            }
        }
    }
    // Sobrescribir onBackPressed para redireccionar a la actividad PantallaPrincipalActivity
    override fun onBackPressed() {
        val intentElementList = Intent(this, PantallaPrincipalActivity::class.java)
        startActivity(intentElementList)
        finish()
    }

}