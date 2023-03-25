package com.baruapps.myapplicationcleanarchitecture.data.repository

import com.baruapps.myapplicationcleanarchitecture.data.source.VehiculosDataSource
import com.baruapps.myapplicationcleanarchitecture.domain.model.VehiculoItem
import com.baruapps.myapplicationcleanarchitecture.domain.model.toDomain
import javax.inject.Inject

class VehiculosRepository @Inject constructor(
    private val dataSource: VehiculosDataSource
) {
    suspend fun vehiculosRepository():MutableList<VehiculoItem>{
        return dataSource.createApi().map {it.toDomain()} as MutableList<VehiculoItem>
    }
}