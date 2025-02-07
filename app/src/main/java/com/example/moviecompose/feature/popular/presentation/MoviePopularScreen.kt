package com.example.moviecompose.feature.popular.presentation

import android.icu.text.CaseMap.Title
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.moviecompose.R
import com.example.moviecompose.core.domain.model.Movie
import com.example.moviecompose.core.utils.UtilFunctions
import com.example.moviecompose.feature.popular.presentation.components.MovieContent
import com.example.moviecompose.feature.popular.presentation.state.MoviePopularState
import com.example.moviecompose.ui.theme.black
import com.example.moviecompose.ui.theme.white

@Composable
fun MoviePopularScreen(
    uiState: MoviePopularState,
    navigateToDetailMovie: (Int) -> Unit
) {
    val movies: LazyPagingItems<Movie> = uiState.movies.collectAsLazyPagingItems()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.popupar_movies),
                        color = white
                    )
                },
                backgroundColor = black
            )
        },
        content = { paddingValues ->
            MovieContent(
                pagingMovies = movies,
                paddingValues = paddingValues,
                onClick = { movieId ->
                    UtilFunctions.logInfo("movie_id", movieId.toString())
                    navigateToDetailMovie(movieId)
                }
            )
        }
    )
}