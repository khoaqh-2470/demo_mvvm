package com.example.demomvvm.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demomvvm.extensions.loadFromUrl

@BindingAdapter("bind:onLoadImage")
fun ImageView.loadImage(url: String) {
    loadFromUrl(Constants.BASE_URL_IMAGE + url)
}

@BindingAdapter(value = ["bind:adapter"])
fun RecyclerView.setAdapter(adapter: RecyclerView.Adapter<*>) {
    this.adapter = adapter
}

@BindingAdapter(value = ["bind:isLoading", "bind:onLoadMore"])
fun RecyclerView.onScrollListener(
    isLoading: Boolean,
    loadMoreListener: LoadMoreRecyclerViewListener
) {
    clearOnScrollListeners()
    addOnScrollListener(object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)
            (recyclerView.layoutManager as LinearLayoutManager).run {
                if (dy > 0) {
                    if (!isLoading && findLastCompletelyVisibleItemPosition() == itemCount - 1) {
                        loadMoreListener.onLoadData()
                    }
                }
            }
        }
    })
}
