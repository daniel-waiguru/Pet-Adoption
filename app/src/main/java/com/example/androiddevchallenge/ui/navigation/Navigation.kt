package com.example.androiddevchallenge.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.example.androiddevchallenge.ui.PetDetailsScreen
import com.example.androiddevchallenge.ui.PetListScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "pets") {
        composable("pets") {
            PetListScreen { pet ->
                initPetDetailsScreen(navController, pet.id)
            }
        }
        composable(
            "petDetail/{petId}",
            arguments = listOf(
                navArgument("petId") {
                    type = NavType.IntType
                })
        ) {
            val petId = it.arguments?.getInt("petId")
            petId?.let { id ->
                PetDetailsScreen(navController, id)
            }
        }
    }
}
fun initPetDetailsScreen(navController: NavController, petId: Int) {
    navController.navigate("petDetail/$petId")
}
