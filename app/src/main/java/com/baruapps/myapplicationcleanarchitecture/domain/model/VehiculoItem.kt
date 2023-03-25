package com.baruapps.myapplicationcleanarchitecture.domain.model

import com.baruapps.myapplicationcleanarchitecture.data.remote.model.VehiculoModel

data class VehiculoItem(

    val TYPE: String,
    val ID: String,
    val NUMBER: String,
    val LOG_NO: String,
    val LOG_MSG_NO: String,
    val MESSAGE: String,
    val MESSAGE_V1: String,
    val MESSAGE_V2: String,
    val MESSAGE_V3: String,
    val MESSAGE_V4: String,
    val PARAMETER: String,
    val ROW: String,
    val FIELD: String,
    val SYSTEM: String

)

fun VehiculoModel.toDomain() = VehiculoItem(
    TYPE = TYPE,
    ID = ID,
    NUMBER = NUMBER,
    LOG_NO = LOG_NO,
    LOG_MSG_NO = LOG_MSG_NO,
    MESSAGE = MESSAGE,
    MESSAGE_V1 = MESSAGE_V1,
    MESSAGE_V2 = MESSAGE_V2,
    MESSAGE_V3 = MESSAGE_V3,
    MESSAGE_V4 = MESSAGE_V4,
    PARAMETER = PARAMETER,
    ROW = ROW,
    FIELD = FIELD,
    SYSTEM = SYSTEM
)