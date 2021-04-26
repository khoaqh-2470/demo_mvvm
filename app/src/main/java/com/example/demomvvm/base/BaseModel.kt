package com.example.demomvvm.base

import com.example.demomvvm.models.Food

data class BaseModel(
    val error: Int,
    val status: Int,
    val data: MutableList<Food>,
    val message: String
)