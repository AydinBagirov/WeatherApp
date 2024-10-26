package com.android.weather.Data.Remote.Dto

data class Result(
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