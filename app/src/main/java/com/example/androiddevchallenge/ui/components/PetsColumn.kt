package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.PetModel

@Composable
fun DisplayPets(pets: List<PetModel>, onPetClicked:(PetModel) -> Unit) {
    LazyColumn(contentPadding = PaddingValues(16.dp, 16.dp, 16.dp)) {
        items(pets) {
            PetCardItem(it) { onPetClicked(it) }
        }
    }
}
