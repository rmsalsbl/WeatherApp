package com.slowmotion.weatherapp.models

import com.google.gson.annotations.SerializedName

data class Clouds(
    @field:SerializedName("all")
    val all: Int,
)
