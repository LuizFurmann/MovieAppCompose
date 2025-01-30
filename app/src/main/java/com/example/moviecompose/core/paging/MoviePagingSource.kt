package com.example.moviecompose.core.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.moviecompose.core.domain.model.Movie
import com.example.moviecompose.feature.popular.domain.source.MoviePopularRemoteDataSource

class MoviePagingSource constructor(
    private val remoteDataSource: MoviePopularRemoteDataSource
) : PagingSource<Int, Movie>() {

    override fun getRefreshKey(state: PagingState<Int, Movie>): Int? {
        TODO("Not yet implemented")
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
        TODO("Not yet implemented")
    }
}