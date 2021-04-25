package com.example.demomvvm.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.demomvvm.data.models.Food
import com.example.demomvvm.data.reponsitory.MainRepository
import com.example.demomvvm.di.response.FoodResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel(private val mainRepository: MainRepository) : ViewModel(),
    Callback<FoodResponse> {

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean>
        get() = _isLoading

    private val _foods = MutableLiveData<List<Food>>()
    val foods: LiveData<List<Food>>
        get() = _foods

    init {
        getAllFoods()
    }

    private fun getAllFoods() {
        _isLoading.value = true
        mainRepository.getAllFoods().enqueue(this)
    }

    override fun onResponse(call: Call<FoodResponse>, response: Response<FoodResponse>) {
        if (response.isSuccessful) {
            _foods.value = response.body()?.foods
        }
    }

    override fun onFailure(call: Call<FoodResponse>, t: Throwable) {
        _isLoading.value = false
        Log.d("nnn", "onFailure: ${t.message}")
    }
}
