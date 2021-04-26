package com.example.demomvvm.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.demomvvm.R
import com.example.demomvvm.data.models.Food
import com.example.demomvvm.databinding.ActivityMainBinding
import com.example.demomvvm.extensions.toGone
import com.example.demomvvm.extensions.toVisible
import com.example.demomvvm.utils.Status
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel by viewModel<MainViewModel>()
    private val mainAdapter by lazy { MainAdapter(::onItemClick) }
    private var foods = mutableListOf<Food?>()
    private fun onItemClick(position: Int, id: Int) {
        foods.removeAt(position)
        mainAdapter.notifyItemRemoved(position)
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
            .apply {
                lifecycleOwner = this@MainActivity
                viewModel = mainViewModel
            }
        binding.mainAdapter = mainAdapter
        onLoadData()
        onEvent()
    }

    private fun onEvent() {
        binding.swipeRefresh.setOnRefreshListener {
            binding.swipeRefresh.isRefreshing = false
            onLoadData()

        }
        mainViewModel.foods.observe(this, Observer {
            foods = it
            mainAdapter.submitList(it)
        })
    }

    private fun onLoadData() {
        mainViewModel.loadAllFoods().observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    binding.recyclerViewFoods.toVisible()
                    binding.progressBar.toGone()
                    binding.textError.toGone()
                }
                Status.ERROR -> {
                    binding.recyclerViewFoods.toGone()
                    binding.progressBar.toGone()
                    binding.textError.toVisible()
                    binding.textError.text = it.message
                }
                Status.LOADING -> {
                    binding.recyclerViewFoods.toGone()
                    binding.progressBar.toVisible()
                    binding.textError.toGone()
                }
            }
        })
    }
}
