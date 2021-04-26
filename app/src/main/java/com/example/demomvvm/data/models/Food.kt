package com.example.demomvvm.data.models

data class Food(
    val id: Int? = null,
    val categoryId: Int = 0,
    val specialtiesId: Int,
    val title: String = "No data",
    val thumbnail: String,
    val description: String
)
