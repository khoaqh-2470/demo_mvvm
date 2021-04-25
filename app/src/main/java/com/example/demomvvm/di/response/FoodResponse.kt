package com.example.demomvvm.di.response

import com.example.demomvvm.data.models.Food
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class FoodResponse(

    @SerializedName("error")
    @Expose
    val error: String,

    @SerializedName("status")
    @Expose
    val status: Int,

    @SerializedName("message")
    @Expose
    val message: String,

    @SerializedName("data")
    @Expose
    val foods: List<Food>?
)
