package com.example.moviecompose.core.data.remote.response

import com.example.moviecompose.core.data.remote.model.MovieResult
import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val movieResults: List<MovieResult>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults : Int
)