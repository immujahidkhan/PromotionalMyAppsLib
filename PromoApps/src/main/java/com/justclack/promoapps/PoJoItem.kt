package com.justclack.promoapps


import com.google.gson.annotations.SerializedName

data class PoJoItem(
    @SerializedName("name")
    val name: String,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("packageName")
    val packageName: String
)