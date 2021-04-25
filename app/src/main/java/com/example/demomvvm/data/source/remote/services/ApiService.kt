package com.example.demomvvm.data.source.remote.services

import com.example.demomvvm.di.response.FoodResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("food/all")
    fun getFoods(): Call<FoodResponse>
}