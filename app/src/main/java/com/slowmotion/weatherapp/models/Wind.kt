package com.slowmotion.weatherapp.models

import com.google.gson.annotations.SerializedName
import java.text.SimpleDateFormat

data class Wind (
    @field:SerializedName("speed")
    val speed: Double,

    @field:SerializedName("deg")
    val deg: Int,

    @field:SerializedName("gust")
    val gust: Double,
        )
