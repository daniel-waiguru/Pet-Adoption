package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.PetModel

@Composable
fun displayPets(pets: List<PetModel>, onPetClicked:() -> Unit) {
    LazyColumn(contentPadding = PaddingValues(16.dp, 16.dp, 16.dp)) {
        pets.forEach {
            //PetCardItem(it) { onPetClicked() }
        }
    }
}
