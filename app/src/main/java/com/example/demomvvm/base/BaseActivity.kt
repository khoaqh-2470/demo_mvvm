package com.example.demomvvm.base

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        onInit()
        onEvent()
    }

    abstract fun getLayoutId(): Int

    abstract fun onInit()

    abstract fun onEvent()
}
