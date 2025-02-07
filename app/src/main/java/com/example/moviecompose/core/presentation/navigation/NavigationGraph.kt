package com.example.moviecompose.core.presentation.navigation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.moviecompose.feature.popular.presentation.MoviePopularScreen
import com.example.moviecompose.feature.popular.presentation.MoviePopularViewModel

@Composable
fun NavigationGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = BottomNavItem.MoviePopular.route
    ) {
        composable(BottomNavItem.MoviePopular.route){

            val viewModel: MoviePopularViewModel = hiltViewModel()
            val uiState = viewModel.uiState

            MoviePopularScreen(
                uiState = uiState,
                navigateToDetailMovie = {

                }
            )
        }
        composable(BottomNavItem.MovieSearch.route){

        }
        composable(BottomNavItem.MovieFavorite.route){

        }
    }

}