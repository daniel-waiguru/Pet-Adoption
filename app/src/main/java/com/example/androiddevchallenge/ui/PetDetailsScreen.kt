package com.example.androiddevchallenge.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.repository.DataStore


@Composable
fun PetDetailsScreen(navController: NavController, petId: Int) {
    val pet = DataStore.getPetById(petId)
    val description = """
        Hello human,
        I'm ${pet.name} a ${pet.gender} pet of ${pet.breed} species and ${pet.age} years old. 
        I weigh around ${pet.weight} kgs, I probably wont make you tired.
    """.trimIndent()
    Box {
        Column {
            Image(painter = painterResource(pet.imageRes),
                contentDescription = "Pet image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = pet.name,
                    style = MaterialTheme.typography.h2,
                )
                Row {
                    Icon(
                        imageVector = Icons.Rounded.LocationOn,
                        contentDescription = "Location"
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(text = pet.location)
                }
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = description,
                )
                Spacer(modifier = Modifier.size(16.dp))
                Row {
                    Icon(
                        imageVector = Icons.Rounded.Favorite,
                        contentDescription = "Like Button",
                        modifier = Modifier
                            .width(35.dp)
                            .height(34.dp)
                            .clickable(
                                onClick = {
                                    // TODO do something
                                }
                            ),
                        tint = Color.Gray
                    )
                    Spacer(modifier = Modifier.size(16.dp))
                    Button(
                        modifier = Modifier
                            .shadow(shape = MaterialTheme.shapes.large, elevation = 2.dp)
                            .height(45.dp)
                            .fillMaxWidth()
                        ,
                        onClick = {
                            // TODO do something
                        }) {
                        Text(
                            text = "Adopt Me"
                        )
                    }
                }

            }
        }
    }
    Icon(
        imageVector = Icons.Filled.Circle,
        contentDescription = "navigate back icon",
        modifier = Modifier
            .padding(8.dp)
            .width(32.dp)
            .height(32.dp)
            ,
        tint = MaterialTheme.colors.surface
    )
    Icon(
        imageVector = Icons.Filled.ArrowBack,
        contentDescription = "navigate back icon",
        modifier = Modifier
            .padding(12.dp)
            .width(24.dp)
            .height(24.dp)
            .clickable {
                navController.navigate("pets")
            },
        tint = MaterialTheme.colors.onSurface
    )
}