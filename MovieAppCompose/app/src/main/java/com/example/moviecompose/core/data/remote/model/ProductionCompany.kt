package com.example.moviecompose.core.data.remote.model

import com.google.gson.annotations.SerializedName

data class ProductionCompany(
    @SerializedName("id")
    val id: Int,
    @SerializedName("logoPath")
    val logoPath: Any,
    @SerializedName("name")
    val name: String,
    @SerializedName("originCountry")
    val originCountry: String
)