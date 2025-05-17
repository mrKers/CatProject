package com.example.catproject.retrofit

import com.example.catproject.retrofit.CatNetworkEntity
import retrofit2.http.GET

interface CatRetroFit {
    @GET("search")
    suspend fun get(): List<CatNetworkEntity>
}