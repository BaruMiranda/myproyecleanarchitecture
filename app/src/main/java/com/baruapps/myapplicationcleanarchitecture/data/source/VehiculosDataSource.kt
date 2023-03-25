package com.baruapps.myapplicationcleanarchitecture.data.source

import com.baruapps.myapplicationcleanarchitecture.data.remote.api.VehiculosApi
import com.baruapps.myapplicationcleanarchitecture.data.remote.model.VehiculoModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class VehiculosDataSource @Inject constructor(
    private val api : VehiculosApi
){
    suspend fun createApi():MutableList<VehiculoModel>{
        return withContext(Dispatchers.IO){
            api.getVehiculos().body()!!.list
        }
    }
}