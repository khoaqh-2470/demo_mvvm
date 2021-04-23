package com.example.demomvvm.ui.main

import android.content.Context
import com.example.demomvvm.models.Food

class MainAdapter(
    context: Context,
    private var data: MutableList<Food>,
    val listener : (Int)
) {
}
