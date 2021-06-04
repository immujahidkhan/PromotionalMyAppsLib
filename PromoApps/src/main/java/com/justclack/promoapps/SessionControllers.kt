package com.justclack.promoapps

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class SessionControllers(private val context: Context) {
    companion object {
        val gson = Gson()
        private val PREF_NAME = "AdsListPrefs"
        private val AdsList = "AdsList"
    }

    var poJoList: PoJo
        get() {
            val jsonString = sharedPrefs.getString(
                AdsList, PoJo().toString()
            )
            return gson.fromJson(jsonString, object : TypeToken<PoJoItem>() {}.type)
        }
        set(value) = sharedPrefs.edit {
            putString(AdsList, gson.toJson(value))
        }

    private val sharedPrefs: SharedPreferences =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
}