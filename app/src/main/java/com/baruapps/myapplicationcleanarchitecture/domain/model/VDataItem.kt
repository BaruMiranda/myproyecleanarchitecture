package com.baruapps.myapplicationcleanarchitecture.domain.model

data class VDataItem(
    val code : String,
    val description : String,
    val list: MutableList<VehiculoItem>
)
