package com.example.moviecompose.feature.popular.data.source

import com.example.moviecompose.core.data.remote.MovieService
import com.example.moviecompose.core.data.remote.response.MovieResponse
import com.example.moviecompose.core.paging.MoviePagingSource
import com.example.moviecompose.feature.popular.domain.source.MoviePopularRemoteDataSource
import javax.inject.Inject

class MoviePopularRemoteDataSourceImpl @Inject constructor(
    private val service: MovieService
) : MoviePopularRemoteDataSource{

    override suspend fun getPopularMovies(page: Int): MovieResponse {
        return service.getPopularMovies(page = page)
    }

    override fun getPopularMoviesPagingSource(): MoviePagingSource {
        return MoviePagingSource(this)
    }

}