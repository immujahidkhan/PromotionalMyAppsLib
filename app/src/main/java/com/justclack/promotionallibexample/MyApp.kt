package com.justclack.promotionallibexample

import android.app.Application

class MyApp : Application() {

    companion object {
        private const val TAG = "MyApp"
        lateinit var instance: MyApp
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}