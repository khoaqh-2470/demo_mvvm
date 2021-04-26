package com.example.demomvvm.di.module

import com.example.demomvvm.data.reponsitory.FoodRepository
import com.example.demomvvm.data.source.remote.services.ApiService
import com.example.demomvvm.ui.main.MainViewModel
import com.example.demomvvm.utils.Constants
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val mainModuleViewModel = module {
    viewModel { MainViewModel(get()) }
}

val repositoryModule = module {
    single { FoodRepository(get()) }
}

val apiModule = module {
    fun provideFoodApi(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    single { provideFoodApi(get()) }
}

val retrofitModule = module {
    fun provideGson() = GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create()

    fun provideHttpClient() = OkHttpClient.Builder().apply {
        connectTimeout(Constants.CONNECT_TIME, TimeUnit.SECONDS)
        readTimeout(Constants.CONNECT_TIME, TimeUnit.SECONDS)
    }.build()

    fun provideRetrofit(gson: Gson, client: OkHttpClient) = Retrofit.Builder().apply {
        baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(client)
        .build()
    }

    single { provideGson() }
    single { provideHttpClient() }
    single { provideRetrofit(get(), get()) }
}
