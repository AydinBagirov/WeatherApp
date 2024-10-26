package com.android.weather.Domain.UseCase

import com.android.weather.Data.Remote.Dto.TOWeather
import com.android.weather.Domain.Model.WeatherModel
import com.android.weather.Domain.Repository.WeatherRepository
import com.android.weather.Util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class WeatherUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository,
) {
    fun weatherUSECASE(): Flow<Resource<List<WeatherModel>>> = flow {
        try {
            emit(Resource.Loading())
            val weather = weatherRepository.getWeatherREPO()
            if (weather.success)
                emit(Resource.Success(weather.TOWeather()))
            else
                emit(Resource.Error("NO DATA"))
        } catch (e: HttpException) {
            emit(Resource.Error("${e.localizedMessage}"))
        } catch (e: IOException) {
            emit(Resource.Error("${e.localizedMessage}"))
        }
    }
}