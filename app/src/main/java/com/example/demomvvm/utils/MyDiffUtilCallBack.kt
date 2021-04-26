package com.example.demomvvm.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.demomvvm.data.models.Food

class MyDiffUtilCallBack :
    DiffUtil.ItemCallback<Food?>() {

    override fun areItemsTheSame(oldItem: Food, newItem: Food): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Food, newItem: Food): Boolean {
        return oldItem == newItem
    }
}
