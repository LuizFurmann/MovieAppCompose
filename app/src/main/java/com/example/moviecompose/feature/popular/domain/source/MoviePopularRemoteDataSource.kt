package com.example.moviecompose.feature.popular.domain.source

import com.example.moviecompose.core.data.remote.response.MovieResponse

interface MoviePopularRemoteDataSource {

    suspend fun getPupularMovies(page: Int): MovieResponse
}