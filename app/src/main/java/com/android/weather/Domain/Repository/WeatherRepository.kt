package com.android.weather.Domain.Repository

import com.android.weather.Data.Remote.Dto.WeatherDto

interface WeatherRepository {
    suspend fun getWeatherREPO(): WeatherDto
}