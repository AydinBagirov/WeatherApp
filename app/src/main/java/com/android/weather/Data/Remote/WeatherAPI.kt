package com.android.weather.Data.Remote

import com.android.weather.Data.Remote.Dto.WeatherDto
import com.android.weather.Util.Constants.API_KEY
import com.android.weather.Util.Constants.CONTENT_TYPE
import retrofit2.http.GET
import retrofit2.http.Header

interface WeatherAPI {
    @GET("weather/getWeather?data.lang=tr&data.city=ankara")
    suspend fun getWeatherAPI(
        @Header("content-type") type: String = CONTENT_TYPE,
        @Header("authorization") auth: String = API_KEY,
    ): WeatherDto
}