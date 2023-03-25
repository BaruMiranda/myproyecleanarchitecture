package com.baruapps.myapplicationcleanarchitecture.data.remote.model

import com.baruapps.myapplicationcleanarchitecture.domain.model.VehiculoItem
import com.google.gson.annotations.SerializedName

data class VDataModel(
    @SerializedName("Code")
    val code : String,
    @SerializedName("Description")
    val description : String,
    @SerializedName("Data")
    val list: MutableList<VehiculoModel>
)
