package com.example.androiddevchallenge.ui

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
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
        Log.d("Pets", MainRepository.allPets.toString())
        DisplayPets(MainRepository.allPets) {
            onPetItemClicked(it)
        }
    }
}

@Composable
fun HeaderText() {
    Text(
        text = "Adopt A Pet",
        style = MaterialTheme.typography.h4,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}