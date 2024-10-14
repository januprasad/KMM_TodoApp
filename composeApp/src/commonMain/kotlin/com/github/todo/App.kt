package com.github.todo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.github.todo.data.MongoDB
import com.github.todo.presentation.screen.home.HomeScreen
import com.github.todo.presentation.screen.home.HomeViewModel
import com.github.todo.presentation.screen.task.TaskViewModel
import com.github.todo.theme.AppTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.core.context.startKoin
import org.koin.dsl.module
import org.koin.mp.KoinPlatform.startKoin

import todoapp.composeapp.generated.resources.Res
import todoapp.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    initializeKoin()
    AppTheme(darkTheme = true) {
        Navigator(HomeScreen()){
            SlideTransition(it)
        }
    }
}
val mongoModule = module {
    single { MongoDB() }
    factory { HomeViewModel(get()) }
    factory { TaskViewModel(get()) }
}

fun initializeKoin() {
    startKoin {
        modules(mongoModule)
    }
}