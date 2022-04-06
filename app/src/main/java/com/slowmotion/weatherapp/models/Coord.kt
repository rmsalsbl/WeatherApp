package com.slowmotion.weatherapp.models

import com.google.gson.annotations.SerializedName

data class Coord(

    @field:SerializedName("lon")
    val lon: Double,

    @field:SerializedName("lan")
    val lan: Double,
)
