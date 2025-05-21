package com.example.catproject.di

import com.example.catproject.RepositoryCat
import com.example.catproject.retrofit.BreedRetroFit
import com.example.catproject.retrofit.CatRetroFit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideRepositoryCat(catApi: CatRetroFit, breedApi: BreedRetroFit): RepositoryCat {
        return RepositoryCat(catApi,breedApi)
    }
}