package com.justclack.promoapps

import android.os.Handler
import android.os.Looper
import android.view.View

class Constants {
    companion object {
        var list: PoJo = PoJo()
        lateinit var packageName: String
        fun preventDoubleClick(view: View) {
            view.isEnabled = false
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                view.isEnabled = true
            }, 500)
        }

        var URL: String =
            "https://gist.githubusercontent.com/immujahidkhan/cb5e22659ba353336072b50fb68705c0/raw/"
    }
}