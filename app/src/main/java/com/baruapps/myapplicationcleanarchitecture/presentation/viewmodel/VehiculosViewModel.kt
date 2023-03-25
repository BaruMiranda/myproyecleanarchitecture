package com.baruapps.myapplicationcleanarchitecture.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.baruapps.myapplicationcleanarchitecture.domain.model.VehiculoItem
import com.baruapps.myapplicationcleanarchitecture.domain.usecase.GetAllVehiculoUseCase
import com.baruapps.myapplicationcleanarchitecture.domain.usecase.GetVehiculoByPlacaUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VehiculosViewModel @Inject constructor(
    private val getVehiculoUseCase: GetAllVehiculoUseCase,
    private val getVehiculobyPlacaUseCase: GetVehiculoByPlacaUseCase
) : ViewModel() {
    private val _listVehiculos = MutableLiveData<MutableList<VehiculoItem>>()
    val listVehiculos = _listVehiculos
    private val _vehiculos = MutableLiveData<VehiculoItem>()
    val vehiculos = _vehiculos
    fun vehiculoViewModel() {
        viewModelScope.launch {
           listVehiculos.postValue(getVehiculoUseCase.invoke())
        }
    }
    fun vehiculoByPlacaViewModel() {
        viewModelScope.launch {
            vehiculos.postValue(getVehiculobyPlacaUseCase.invoke())
        }
    }
}