package com.example.myrecipeapp.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myrecipeapp.srceens.Dish1
import com.example.myrecipeapp.srceens.Home
import com.example.myrecipeapp.srceens.Login
import com.example.myrecipeapp.srceens.Onboarding

@Composable
fun AppNavigator(navHostController: NavHostController) {
    NavHost(navController=navHostController,
    startDestination="Onboarding"
    ){
        composable("Onboarding"){
            Onboarding{
                navHostController.navigate("Home")
            }
        }

        composable("Home"){
            Home{
                navHostController.navigate("Dish1")
            }
        }
        composable("Dish1"){
            Dish1()
        }
    }


}