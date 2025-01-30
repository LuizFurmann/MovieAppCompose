package com.example.moviecompose.feature.popular.data.source

import com.example.moviecompose.core.data.remote.MovieService
import com.example.moviecompose.core.data.remote.response.MovieResponse
import com.example.moviecompose.feature.popular.domain.source.MoviePopularRemoteDataSource

class MoviePopularRemoteDataSourceImpl constructor(
    private val service: MovieService
) : MoviePopularRemoteDataSource{

    override suspend fun getPupularMovies(page: Int): MovieResponse {
        return service.getPopularMovies(page = page)
    }

}