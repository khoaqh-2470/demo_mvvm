package com.example.demomvvm.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demomvvm.R
import com.example.demomvvm.data.models.Food

class MainAdapter(
    context: Context,
    private var foods: MutableList<Food>,
    private val listener: (Int) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == VIEW_TYPE_LOADING) {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_load_more, parent, false)
            return LoadItemViewHolder(view)
        } else {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_foods, parent, false)
            return ItemViewHolder(view, listener)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ItemViewHolder) {
//            foods[position].let { holder.(it) }
        } else if (holder is LoadItemViewHolder) {
            holder.showLoadingView()
        }
    }

    override fun getItemCount() = foods.size

    class LoadItemViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        fun showLoadingView() {
//            itemView.progressBarLoadMore.isEnabled = true
        }
    }

    class ItemViewHolder(itemView: View, val listener: (Int) -> Unit) : RecyclerView.ViewHolder(itemView) {
        fun populateItemRow(food: Food) {
            itemView.apply {
                setOnClickListener {
                    listener(food.id)
                }
            }
        }
    }

    companion object {
        const val VIEW_TYPE_LOADING = 0
        const val VIEW_TYPE_ITEM = 1
    }
}

