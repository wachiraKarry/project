package com.karry.tour.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.karry.tour.ui.theme.screens.home.HomeScreen
import com.karry.tour.ui.theme.screens.login.LoginScreen
import com.karry.tour.ui.theme.screens.register.RegisterScreen
import com.karry.tour.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier =Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH) {
    NavHost(navController = navController, modifier= modifier, startDestination = startDestination)
    {
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
//        composable(ROUTE_ASSET){
//            AssetList(navController)
//        }
//        composable(ROUTE_ADD_PRODUCT) {
//            AddProductsScreen(navController)
//        }
//        composable(ROUTE_VIEW_PRODUCT){
//            ViewProductsScreen(navController)
//        }
//        composable("$ROUTE_UPDATE_PRODUCT/{id}"){ passedData ->
//            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
//        }
//        composable(ROUTE_VIEW_UPLOAD){
//            ViewUploadsScreen(navController)
//        }
    }

}