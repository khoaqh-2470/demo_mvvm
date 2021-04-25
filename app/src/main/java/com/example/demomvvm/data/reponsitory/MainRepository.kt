package com.example.demomvvm.data.reponsitory

import com.example.demomvvm.data.source.remote.services.ApiService

class MainRepository(private val apiService: ApiService) {
    fun getAllFoods() = apiService.getFoods()
}
