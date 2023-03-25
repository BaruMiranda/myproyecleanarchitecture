package com.baruapps.myapplicationcleanarchitecture.data.remote.model

import com.google.gson.annotations.SerializedName

data class VehiculoModel(
    @SerializedName("TYPE")
    val TYPE: String,
    @SerializedName("ID")
    val ID: String,
    @SerializedName("NUMBER")
    val NUMBER: String,
    @SerializedName("LOG_NO")
    val LOG_NO: String,
    @SerializedName("LOG_MSG_NO")
    val LOG_MSG_NO: String,
    @SerializedName("MESSAGE")
    val MESSAGE: String,
    @SerializedName("MESSAGE_V1")
    val MESSAGE_V1: String,
    @SerializedName("MESSAGE_V2")
    val MESSAGE_V2: String,
    @SerializedName("MESSAGE_V3")
    val MESSAGE_V3: String,
    @SerializedName("MESSAGE_V4")
    val MESSAGE_V4: String,
    @SerializedName("PARAMETER")
    val PARAMETER: String,
    @SerializedName("ROW")
    val ROW: String,
    @SerializedName("FIELD")
    val FIELD: String,
    @SerializedName("SYSTEM")
    val SYSTEM: String,

)