package com.example.catproject.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CatNetworkEntity (
    @SerializedName("id")
    @Expose
    var id: String,

    @SerializedName("url")
    @Expose
    var url: String,

    @SerializedName("width")
    @Expose
    var width: Int,

    @SerializedName("height")
    @Expose
    var height: Int,
)