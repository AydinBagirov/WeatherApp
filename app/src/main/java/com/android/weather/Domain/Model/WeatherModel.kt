package com.android.weather.Domain.Model

data class WeatherModel(
    val date: String,
    val day: String,
    val degree: String,
    val description: String,
    val humidity: String,
    val icon: String,
    val max: String,
    val min: String,
    val night: String,
    val status: String
)