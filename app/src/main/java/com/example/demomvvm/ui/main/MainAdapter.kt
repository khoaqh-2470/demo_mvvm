package com.example.demomvvm.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.demomvvm.data.models.Food
import com.example.demomvvm.databinding.ItemFoodsBinding
import com.example.demomvvm.databinding.ItemLoadMoreBinding
import com.example.demomvvm.utils.MyDiffUtilCallBack

class MainAdapter(private val onItemCLick: (Int, Int) -> Unit) :
    ListAdapter<Food, RecyclerView.ViewHolder>(MyDiffUtilCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_TYPE_LOADING) {
            val binding =
                ItemLoadMoreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            LoadItemViewHolder(binding)
        } else {
            val binding =
                ItemFoodsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            ItemViewHolder(binding, onItemCLick)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ItemViewHolder) {
            holder.onBind(getItem(position))
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (getItem(position) == null) VIEW_TYPE_LOADING else VIEW_TYPE_ITEM
    }

    class ItemViewHolder(
        private val binding: ItemFoodsBinding,
        private val onItemCLick: (Int, Int) -> Unit
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(food: Food) {
            binding.imageView.setOnClickListener {
                onItemCLick(adapterPosition, food.id)
            }
            binding.food = food
            binding.executePendingBindings()
        }
    }

    class LoadItemViewHolder(binding: ItemLoadMoreBinding) :
        RecyclerView.ViewHolder(binding.root)

    companion object {
        const val VIEW_TYPE_LOADING = 0
        const val VIEW_TYPE_ITEM = 1
    }
}
