package com.example.primeraentrega

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UsuarioDao {
    @Query("SELECT * FROM usuarios_table WHERE username = :username")
    fun getUserByUsername(username: String): Usuario?

    @Insert
    fun insertUser(user: Usuario): Long // Devolver el ID insertado
}