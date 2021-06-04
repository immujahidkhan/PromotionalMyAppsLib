package com.justclack.promoapps

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.*

class SessionControllers(private val context: Context) {
    companion object {
        val gson = Gson()
        private val PREF_NAME = "AdsListPrefs"
        private val AdsList = "AdsList"
    }

    var poJoList: PoJo
        get() {
            val json: String = sharedPrefs.getString(AdsList, PoJo().toString()).toString()
            val type = object : TypeToken<PoJo>() {}.type
            return gson.fromJson(json, type)
        }
        set(value) = sharedPrefs.edit {
            putString(AdsList, gson.toJson(value))
        }

    private val sharedPrefs: SharedPreferences =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
}