package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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


@Composable
fun PetCardItem(petModel: PetModel, onClickCallback:(PetModel) -> Unit) {
    Card(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        .shadow(4.dp)
        .clickable(onClick = { onClickCallback(petModel) }), shape = MaterialTheme.shapes.small,
        elevation = 16.dp

    ) {
        Column {
            Row {
                Image(painter = painterResource(petModel.imageRes),
                    contentDescription = "Pet image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                        .height(150.dp)
                )
            }
            Row {
                Column(modifier = Modifier.padding(10.dp)) {
                    Text(text = petModel.name, style = MaterialTheme.typography.h5)
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(text = "${petModel.age} years old")
                }
            }
        }
    }
}
