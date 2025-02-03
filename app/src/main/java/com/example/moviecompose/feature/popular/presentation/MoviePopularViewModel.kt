package com.example.moviecompose.feature.popular.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.moviecompose.core.domain.model.Movie
import com.example.moviecompose.feature.popular.domain.usecase.GetPopularMoviesUseCase
import com.example.moviecompose.feature.popular.presentation.state.MoviePopularState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class MoviePopularViewModel @Inject constructor(
    getPopularMoviesUseCase: GetPopularMoviesUseCase
): ViewModel() {

    var uiState by mutableStateOf(MoviePopularState())
        private set

    init {
        val movies: Flow<PagingData<Movie>> = getPopularMoviesUseCase.invoke()
            .cachedIn(viewModelScope) //permite armazenar o resultado de um flow, melhora desempenho pois quando a gente precisar dos dados, náo sera feito uma nova chamada de dados e sim usar o cache
        uiState = uiState.copy(movies = movies)
    }
}