package com.example.moviecompose.feature.popular.presentation.state

import androidx.paging.PagingData
import com.example.moviecompose.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class MoviePopularState(
    val movies: Flow<PagingData<Movie>> = emptyFlow()
)
