package com.example.primeraentrega

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuarios_table")
data class Usuario( val userName: String, val password: String) {
    @PrimaryKey(autoGenerate = true) var id: Int=0
}