package com.example.catproject.room

import androidx.room.TypeConverter
import com.example.catproject.model.Image
import com.example.catproject.model.Weight
import com.google.gson.Gson


class Converters {

    @TypeConverter
    fun StringtoImage(value: Image?): String = Gson().toJson(value)

    @TypeConverter
    fun ImagetoString(value: String): Image? = Gson().fromJson(value, Image::class.java)

    @TypeConverter
    fun StringtoWeight(value: Weight?): String = Gson().toJson(value)

    @TypeConverter
    fun WeighttoString(value: String): Weight? = Gson().fromJson(value, Weight::class.java)

}