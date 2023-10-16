package com.example.primeraentrega.endpoints

import com.example.primeraentrega.dtos.DogsResponse


import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url


interface MyApi {
      @GET
     suspend fun getDogsByBreeds(@Url url: String):Response<DogsResponse>
}