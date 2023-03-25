package com.baruapps.myapplicationcleanarchitecture.domain.usecase

import com.baruapps.myapplicationcleanarchitecture.data.repository.VehiculosRepository
import javax.inject.Inject

class GetAllVehiculoUseCase @Inject constructor(
    private val getVehiculoCase: VehiculosRepository
) {
    suspend operator fun invoke() = getVehiculoCase.vehiculosRepository()
}