package com.justclack.promoapps

import android.app.Application
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.interceptors.HttpLoggingInterceptor
import okhttp3.OkHttpClient

class App : Application() {

    companion object {
        private const val TAG = "App"
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        val okHttpClient = OkHttpClient().newBuilder()
            .addNetworkInterceptor(HttpLoggingInterceptor())
            .build()
        AndroidNetworking.initialize(applicationContext, okHttpClient)
    }
}