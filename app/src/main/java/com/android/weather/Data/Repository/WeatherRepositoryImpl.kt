package com.android.weather.Data.Repository

import com.android.weather.Data.Remote.Dto.WeatherDto
import com.android.weather.Data.Remote.WeatherAPI
import com.android.weather.Domain.Repository.WeatherRepository
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val weatherapi: WeatherAPI,
) : WeatherRepository {
    override suspend fun getWeatherREPO(): WeatherDto {
        return weatherapi.getWeatherAPI()
    }
}