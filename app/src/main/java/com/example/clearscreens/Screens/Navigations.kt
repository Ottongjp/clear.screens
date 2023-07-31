package com.example.clearscreens.Screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController= rememberNavController()


    NavHost(navController = navController, startDestination = "SplashScreen") {
        composable("SplashScreen") {
            SplashScreen(navController)
        }
        composable("HomeScreen") {
            HomeScreen(navController)
        }
        composable("NameScreen"){
            NameScreen(navController)
        }
        composable("SchoolScreen"){
            SchoolScreen(navController)
        }
        composable("DisplayScreen"){
            val firstname = remember {
                mutableStateOf("")
            }
            val lastname = remember {
                mutableStateOf("")
            }
            val username = remember {
                mutableStateOf("")
            }
            val email = remember {
                mutableStateOf("")
            }
            val phoneNo = remember {
                mutableStateOf("")
            }
            val school = remember {
                mutableStateOf("")
            }
            val level = remember {
                mutableStateOf("")
            }
            val bestCourse = remember {
                mutableStateOf("")
            }
            val hopeful = remember {
                mutableStateOf("")
            }
            DisplayScreen(navController = navController, email = email)
        }
    }
}