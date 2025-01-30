package com.example.moviecompose.feature.popular.data.mapper

import com.example.moviecompose.core.data.remote.model.MovieResult
import com.example.moviecompose.core.domain.model.Movie
import com.example.moviecompose.core.utils.toPostUrl

fun List<MovieResult>.toMovie() = map { movieResult ->
    Movie(
        id = movieResult.id,
        title = movieResult.title,
        voteAverage = movieResult.voteAverage,
        imageUrl = movieResult.posterPath?.toPostUrl() ?: ""
    )
}