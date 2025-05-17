package com.example.catproject.retrofit

import com.example.catproject.retrofit.BreedNetworkEntity
import retrofit2.http.GET

interface BreedRetroFit {
    @GET("https://api.thecatapi.com/v1/breeds")
    suspend fun get(): List<BreedNetworkEntity>
}