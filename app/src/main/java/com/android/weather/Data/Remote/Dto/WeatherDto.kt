package com.android.weather.Data.Remote.Dto

import com.android.weather.Domain.Model.WeatherModel
import kotlin.String

data class WeatherDto(
    val result: List<Result>,
    val success: Boolean
)

fun WeatherDto.TOWeather(): List<WeatherModel> {
    return result.map {
        WeatherModel(
            date = it.date,
            day = it.day,
            degree = it.degree,
            description = it.description,
            humidity = it.humidity,
            icon = it.icon,
            max = it.max,
            min = it.min,
            night = it.night,
            status = it.status
        )
    }
}