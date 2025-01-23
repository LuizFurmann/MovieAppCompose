package com.example.moviecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviecompose.ui.theme.MovieComposeTheme
import com.google.gson.internal.GsonBuildConfig

class MainActivity : ComponentActivity() {

//    curl --request GET \
//    --url 'https://api.themoviedb.org/3/movie/popular?language=pt-BR&page=1' \

    //https://api.themoviedb.org/3/movie/2?language=pt-BR
//    --header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI0Mjk0NmZlZjZkMThhMzBiM2YxYmJhNTcyNGM3M2Y4ZiIsIm5iZiI6MTYzMjQxNTMxMC44NTIsInN1YiI6IjYxNGNhZTRlYzI4MjNhMDA2NDQ0NTUyNiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.Kio8pHO8fbCtxnVhmNKwGEy1yV3mM9fB50UF3HC8KN8' \
//    --header 'accept: application/json'

    override fun onCreate(savedInstanceState: Bundle?) {

        val teste = BuildConfig.API_KEY
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Eng. $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MovieComposeTheme {
        Greeting("Luiz Furmann")
    }
}