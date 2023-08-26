package com.example.primeraentrega

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class PantallaPrincipalActivity : AppCompatActivity() {
    //variables para vincular la vista
    lateinit var etUsuario : EditText
    lateinit var etPass : EditText
    lateinit var cbRecordar : CheckBox
    lateinit var btnRegistrar : Button
    lateinit var btnIniciar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        //Vinculamos las variables con los IDs correspondientes
        etUsuario = findViewById(R.id.etUsuario)
        etPass = findViewById(R.id.etPass)
        cbRecordar = findViewById(R.id.cbRecordar)
        btnRegistrar = findViewById(R.id.botonRegistrar)
        btnIniciar = findViewById(R.id.botonIniciar)

        //agregamos la funcionalidad

        btnIniciar.setOnClickListener{
            var mensaje = "Iniciar Sesion"
            //obtengo el valor ingresado en nombre del usuario
            var nombreUsuario = etUsuario.text.toString()
            var contraseñaUsuario = etPass.text.toString()

            if(nombreUsuario.isEmpty() || contraseñaUsuario.isEmpty()){
                Toast.makeText(this, "Usuario o contraseña incompletos", Toast.LENGTH_SHORT).show()
            }else {
                mensaje += " - Datos Ok "

                //Verifico si el checkBox esta tildado
                if (cbRecordar.isChecked)
                    mensaje += "- Recordar Usuario -"

                Toast.makeText(this,mensaje, Toast.LENGTH_SHORT).show()
                //Indico a que pantalla quiero pasar
                // val intentMain = Intent(this, RegisterActivity::class.java)

                //Le mando un valor
                //intentMain.putExtra("nombre", nombreUsuario)

                //startActivity(intentMain)

                //finish()
            }

        }
        btnRegistrar.setOnClickListener{

                Toast.makeText(this,"Registrar usuario", Toast.LENGTH_SHORT).show()
                //Indico a que pantalla quiero pasar
                val intentMain = Intent(this, RegisterActivity::class.java)

                startActivity(intentMain)

                finish()

        }

    }
}