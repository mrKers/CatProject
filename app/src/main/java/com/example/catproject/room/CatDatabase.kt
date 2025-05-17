package com.example.catproject.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.uca.michiapp.room.BreedDao
import com.uca.michiapp.room.CatCacheEntity
import com.uca.michiapp.room.CatDao

@Database(entities = [CatCacheEntity::class, BreedCacheEntity::class], version = 1)
@TypeConverters(Converters::class)
abstract class CatDatabase: RoomDatabase() {
    companion object{
        val DATABASE_NAME = "MichisDB"
    }

    abstract fun catDao(): CatDao
    abstract fun breedDao(): BreedDao
}