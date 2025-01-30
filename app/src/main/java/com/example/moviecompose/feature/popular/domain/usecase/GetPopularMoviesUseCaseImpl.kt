package com.example.moviecompose.feature.popular.domain.usecase

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.moviecompose.core.domain.model.Movie
import com.example.moviecompose.feature.popular.domain.repository.MoviePopularRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface GetPopularMoviesUseCase {
    operator fun invoke() : Flow<PagingData<Movie>>
}

class GetPopularMoviesUseCaseImpl @Inject constructor(
    private val repository: MoviePopularRepository
) : GetPopularMoviesUseCase {

    override fun invoke(): Flow<PagingData<Movie>> {
        return repository.getPopularmovies(
            pagingConfig = PagingConfig(
                pageSize = 20,
                initialLoadSize = 20
            )
        )
    }
}