package com.baruapps.myapplicationcleanarchitecture.core.di

import com.baruapps.myapplicationcleanarchitecture.data.remote.api.VehiculosApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(
                GsonConverterFactory.create()
            )
            .build()
    }
    @Singleton
    @Provides
    fun provideVehiculosApiClient(retrofit: Retrofit): VehiculosApi {
        return retrofit.create(VehiculosApi::class.java)
    }
}