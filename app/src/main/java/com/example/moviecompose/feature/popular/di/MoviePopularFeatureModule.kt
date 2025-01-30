package com.example.moviecompose.feature.popular.di

import com.example.moviecompose.core.data.remote.MovieService
import com.example.moviecompose.feature.popular.data.repository.MoviePopularRepositoryImpl
import com.example.moviecompose.feature.popular.data.source.MoviePopularRemoteDataSourceImpl
import com.example.moviecompose.feature.popular.domain.repository.MoviePopularRepository
import com.example.moviecompose.feature.popular.domain.source.MoviePopularRemoteDataSource
import com.example.moviecompose.feature.popular.domain.usecase.GetPopularMoviesUseCase
import com.example.moviecompose.feature.popular.domain.usecase.GetPopularMoviesUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MoviePopularFeatureModule {

    @Provides
    @Singleton
    fun provideMovieDataSource(service: MovieService): MoviePopularRemoteDataSource {
        return MoviePopularRemoteDataSourceImpl(service = service)
    }

    @Provides
    @Singleton
    fun provideMovieRepository(remoteDataSource: MoviePopularRemoteDataSource): MoviePopularRepository {
        return MoviePopularRepositoryImpl(remoteDataSource = remoteDataSource)
    }

    @Provides
    @Singleton
    fun provideGetMoviesPopularUseCase(moviePopularRepository: MoviePopularRepository): GetPopularMoviesUseCase {
        return GetPopularMoviesUseCaseImpl(repository = moviePopularRepository)
    }
}