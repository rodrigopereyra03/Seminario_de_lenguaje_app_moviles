package com.example.primeraentrega

import android.os.Parcel
import android.os.Parcelable


data class Personajes(
    val idImagen: Int,
    val personaje: String?,
    val descripcion: String?,

    ):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(idImagen)
        parcel.writeString(personaje)
        parcel.writeString(descripcion)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Personajes> {
        override fun createFromParcel(parcel: Parcel): Personajes {
            return Personajes(parcel)
        }

        override fun newArray(size: Int): Array<Personajes?> {
            return arrayOfNulls(size)
        }
    }
}