package com.example.catproject.retrofit

import com.example.catproject.retrofit.CatNetworkEntity
import retrofit2.http.GET

interface CatRetroFit {
    @GET("https://api.thecatapi.com/v1/images/search?limit=100")
    suspend fun get(): List<CatNetworkEntity>
}