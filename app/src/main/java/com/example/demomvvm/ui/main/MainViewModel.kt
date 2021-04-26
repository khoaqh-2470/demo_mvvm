package com.example.demomvvm.ui.main

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.*
import com.example.demomvvm.data.models.Food
import com.example.demomvvm.data.reponsitory.FoodRepository
import com.example.demomvvm.utils.Constants
import com.example.demomvvm.utils.LoadMoreRecyclerViewListener
import com.example.demomvvm.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel(private val foodRepository: FoodRepository) : ViewModel(),
    LoadMoreRecyclerViewListener {

    private var foodAll = mutableListOf<Food>()
    private var countItem = Constants.LIMIT_ITEM

    private val _foods = MutableLiveData<MutableList<Food?>>()
    val foods: LiveData<MutableList<Food?>>
        get() = _foods

    private val _isLoading = MutableLiveData<Boolean>(false)
    val isLoading: LiveData<Boolean>
        get() = _isLoading

    init {
        viewModelScope.launch(Dispatchers.IO) {
            loadAllFoods()
        }
    }

    fun loadAllFoods() = liveData {
        emit(Resource.loading(data = null))
        foodAll.clear()
        countItem = Constants.LIMIT_ITEM
        foodAll = foodRepository.getAllFoods().foods
        _foods.value = foodAll.take(countItem).toMutableList()
        _foods.value!!.add(null)
        try {
            emit(Resource.success(data = foods))
        } catch (ex: Exception) {
            emit(Resource.error(data = null, message = ex.message.toString()))
        }
    }

    override fun onLoadData() {
        if (countItem >= foodAll.size) {
            return
        }
        _isLoading.value = true
        Handler(Looper.getMainLooper()).postDelayed({
            _isLoading.value = false
            countItem += Constants.LIMIT_ITEM
            _foods.value = foodAll.take(countItem).toMutableList()
            if (countItem <= foodAll.size) {
                _foods.value?.add(null)
            }
        }, 2000)
    }
}
