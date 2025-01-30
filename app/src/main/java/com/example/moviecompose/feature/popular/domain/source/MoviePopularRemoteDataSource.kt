package com.example.moviecompose.feature.popular.domain.source

import com.example.moviecompose.core.data.remote.response.MovieResponse
import com.example.moviecompose.core.paging.MoviePagingSource

interface MoviePopularRemoteDataSource {

    fun getPopularMoviesPagingSource(): MoviePagingSource

    suspend fun getPopularMovies(page: Int): MovieResponse
}