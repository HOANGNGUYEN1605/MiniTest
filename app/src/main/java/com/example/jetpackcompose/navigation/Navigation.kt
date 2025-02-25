package com.example.jetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackcompose.screens.ProductDetailScreen
import com.example.jetpackcompose.screens.ProductListScreen

@Composable
fun AppNavigation() {
    val navController = androidx.navigation.compose.rememberNavController()
    NavHost(navController, startDestination = "list") {
        composable("list") { ProductListScreen(navController) }
        composable("details/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId")?.toIntOrNull()
            productId?.let { ProductDetailScreen(it, navController) }
        }
    }
}
