package com.example.u_kutochku.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.u_kutochku.screens.MainScreen
import com.example.u_kutochku.screens.SplashScreen
import com.example.u_kutochku.utils.Constant

sealed class Screens(val route:String){
    object Splash:Screens(route = Constant.Screens.SPLASH_SCREEN)
    object Main:Screens(route = Constant.Screens.MAIN_SCREEN)
    object Details:Screens(route = Constant.Screens.DETAILS_SCREEN)
}

@Composable
fun SetupNavHost(navController: NavHostController) {
    NavHost(navController = navController,
        startDestination = Screens.Splash.route
    ){
        composable(route = Screens.Splash.route ){
            SplashScreen(navController)
        }
        composable(route = Screens.Main.route){
            MainScreen()
        }
        composable(route = Screens.Details.route){}

    }

}