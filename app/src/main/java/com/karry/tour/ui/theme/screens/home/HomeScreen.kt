package com.karry.tour.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.karry.tour.navigation.ROUTE_ADD_PRODUCT
import com.karry.tour.navigation.ROUTE_LOGIN
import com.karry.tour.navigation.ROUTE_REGISTER
import com.karry.tour.navigation.ROUTE_VIEW_PRODUCT
import com.karry.tour.navigation.ROUTE_VIEW_UPLOAD

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context= LocalContext.current
//        var productdata=productviewmodel(navController,context)

        Text(text = "Welcome to Home page",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = {
            navController.navigate(ROUTE_ADD_PRODUCT)
        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "Add destination")
        }

        Text(text = "Welcome to an app that turns your dream into a reality at the most affordable prices and the best experience given by experts",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(100.dp))

//        Spacer(modifier = Modifier.height(50.dp))
//
//        Button(onClick = {
//            navController.navigate(ROUTE_VIEW_PRODUCT)
//        },modifier = Modifier.fillMaxWidth()) {
//            Text(text = "View Asset")
//        }
//        Spacer(modifier = Modifier.height(50.dp))
//        Button(onClick = {
//            navController.navigate(ROUTE_VIEW_UPLOAD)
//        },modifier = Modifier.fillMaxWidth()) {
//            Text(text = "View Uploaded Asset")
//        }
//        Spacer(modifier = Modifier.height(50.dp))
//        Button(onClick = {
//            navController.navigate(ROUTE_ASSET)
//        },modifier = Modifier.fillMaxWidth()) {
//            Text(text = "View Assets available")
//        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.navigate(ROUTE_LOGIN)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Have an Account? Click to Login")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.navigate(ROUTE_REGISTER)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Don't have account? Click to Register")
        }
    }
}

@Preview
@Composable
fun Homepreview() {
    HomeScreen(rememberNavController())
}