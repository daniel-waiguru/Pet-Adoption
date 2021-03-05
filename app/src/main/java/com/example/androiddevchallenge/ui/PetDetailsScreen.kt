package com.example.androiddevchallenge.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.repository.MainRepository

@Composable
fun PetDetailsScreen(petId: Int) {
    val pet = MainRepository.getPetById(petId)
    val description = """
        Hello human,
        I'm ${pet.name} a ${pet.gender}pet of ${pet.breed} species and ${pet.age}
        years old. I weigh around ${pet.weight}, I probably wont make you tired.
    """.trimIndent()
    Column {
        Image(painter = painterResource(pet.imageRes),
            contentDescription = "Pet image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
    Column(
        Modifier.shadow(8.dp, shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp)),
    ) {
        Text(text = pet.name, style = MaterialTheme.typography.h2 )
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = description)
    }
    Row(modifier = Modifier.padding(16.dp)) {
        Button(onClick = { 
            /*SnackBar {
                Text(text = "Thank you!")
            }*/
        }) {
            Text(
                text = "Adopt Me",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}
@Composable
fun SnackBar(
    text: @Composable ()-> Unit,
) {
}