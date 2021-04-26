package com.example.demomvvm.data.reponsitory

import com.example.demomvvm.data.source.remote.services.ApiService

class FoodRepository(private val apiService: ApiService) {
    suspend fun getAllFoods() = apiService.getFoods()
}
