package com.android.weather.DI

import com.android.weather.Data.Remote.WeatherAPI
import com.android.weather.Data.Repository.WeatherRepositoryImpl
import com.android.weather.Domain.Repository.WeatherRepository
import com.android.weather.Util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton
    fun provideApi(): WeatherAPI{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(weatherApi: WeatherAPI) : WeatherRepository{
        return WeatherRepositoryImpl(weatherApi)
    }
}