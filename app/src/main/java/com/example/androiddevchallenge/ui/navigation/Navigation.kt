package com.example.androiddevchallenge.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.example.androiddevchallenge.ui.PetListScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "pets") {
        composable("pets") {
            PetListScreen { pet ->
                initPetDetailsScreen(navController, pet.id)
            }
        }
        composable(
            "pet_details",
            arguments = listOf(
                navArgument("pet_id") {
                    type = NavType.IntType
                })
        ) {
            val petId = it.arguments?.getInt("pet_id")
            petId?.let {
                initPetDetailsScreen(navController, it)
            }
        }
    }
}
fun initPetDetailsScreen(navController: NavController, petId: Int) {
    navController.currentBackStackEntry?.arguments?.putInt("pet_id", petId)
    navController.navigate("pet_details")
}