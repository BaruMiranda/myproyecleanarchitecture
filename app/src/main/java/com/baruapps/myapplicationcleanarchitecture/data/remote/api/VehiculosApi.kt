package com.baruapps.myapplicationcleanarchitecture.data.remote.api

import com.baruapps.myapplicationcleanarchitecture.data.remote.model.VDataModel
import retrofit2.Response
import retrofit2.http.GET

interface VehiculosApi {
    @GET("api/vehicle")
    suspend fun getVehiculos(): Response<VDataModel>
}