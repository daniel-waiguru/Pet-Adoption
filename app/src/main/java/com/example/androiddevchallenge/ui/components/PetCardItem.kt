package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.PetModel
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Spacer


@Composable
fun PetCardItem(petModel: PetModel, onClickCallback:() -> Unit) {
    Card(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        .shadow(4.dp)
        .clickable(onClick = onClickCallback), shape = MaterialTheme.shapes.small,
        elevation = 10.dp

    ) {
        Image(painter = painterResource(petModel.imageRes),
            contentDescription = "Pet image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
                .padding(16.dp)
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = petModel.name, style = MaterialTheme.typography.subtitle1)
            Spacer(modifier = Modifier.size(18.dp))
            Text(text = "${petModel.age} years old")
        }
    }
}
