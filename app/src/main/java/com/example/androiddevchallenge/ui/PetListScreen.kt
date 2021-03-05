package com.example.androiddevchallenge.ui

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.model.PetModel
import com.example.androiddevchallenge.repository.DataStore
import com.example.androiddevchallenge.ui.components.DisplayPets

@Composable
fun PetListScreen(onPetItemClicked:(PetModel) ->Unit) {
    Column {
        androidx.compose.material.TopAppBar(title = {
            Text(text = "Pet Adopter")
        })
        Log.d("Pets", DataStore.allPets.toString())
        DisplayPets(DataStore.allPets) {
            onPetItemClicked(it)
        }
    }
}
