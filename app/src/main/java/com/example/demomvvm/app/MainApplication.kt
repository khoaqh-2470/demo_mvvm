package com.example.demomvvm.app

import android.app.Application
import com.example.demomvvm.di.module.apiModule
import com.example.demomvvm.di.module.mainModuleViewModel
import com.example.demomvvm.di.module.repositoryModule
import com.example.demomvvm.di.module.retrofitModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MainApplication)
            modules(listOf(repositoryModule, mainModuleViewModel, retrofitModule, apiModule))
        }
    }
}
