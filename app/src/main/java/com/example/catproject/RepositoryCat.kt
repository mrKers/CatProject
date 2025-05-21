package com.example.catproject


import com.example.catproject.retrofit.BreedNetworkEntity
import com.example.catproject.retrofit.BreedRetroFit
import com.example.catproject.retrofit.CatNetworkEntity
import com.example.catproject.retrofit.CatRetroFit
import javax.inject.Inject

class RepositoryCat @Inject constructor(
    private val apiService: CatRetroFit,
    private val breedApiService: BreedRetroFit

) {
    suspend fun getList(): List<BreedNetworkEntity> {
        return breedApiService.get()
    }


}
