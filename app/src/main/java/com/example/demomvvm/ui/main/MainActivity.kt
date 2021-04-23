package com.example.demomvvm.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demomvvm.R
import com.example.demomvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
