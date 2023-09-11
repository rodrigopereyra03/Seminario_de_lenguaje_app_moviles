package com.example.primeraentrega

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Usuario::class], version = 1)
abstract class AppDataBase : RoomDatabase(){
    abstract fun usuarioDao():UsuarioDao
    companion object{
        private var INSTANCIA : AppDataBase?=null
        fun getDatabase(contexto: Context) : AppDataBase {
            if (INSTANCIA == null) {
                synchronized(this) {
                    INSTANCIA = Room.databaseBuilder(
                        contexto, AppDataBase::class.java, "usuarios_table"
                    )
                        .allowMainThreadQueries()
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCIA!!
        }
    }
}