package com.example.androiddevchallenge.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.PetModel
import com.example.androiddevchallenge.repository.MainRepository
import com.example.androiddevchallenge.ui.components.DisplayPets

@Composable
fun PetListScreen(onPetItemClicked:(PetModel) ->Unit) {
    Column {
        HeaderText()
        DisplayPets(MainRepository.allPets) {
            onPetItemClicked(it)
        }
    }
}

@Composable
fun HeaderText() {
    Text(
        text = "Adopt A Pet",
        style = MaterialTheme.typography.h2,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize(),
        textAlign = TextAlign.Center
    )
}