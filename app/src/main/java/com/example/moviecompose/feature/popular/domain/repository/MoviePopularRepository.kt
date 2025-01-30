package com.example.moviecompose.feature.popular.domain.repository

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.moviecompose.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MoviePopularRepository {

    fun getPopularmovies(pagingConfig: PagingConfig): Flow<PagingData<Movie>>
}