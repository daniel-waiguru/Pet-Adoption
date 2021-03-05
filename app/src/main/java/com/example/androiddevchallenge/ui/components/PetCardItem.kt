/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
fun PetCardItem(petModel: PetModel, onClickCallback: (PetModel) -> Unit) {
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .shadow(4.dp)
            .clickable(onClick = { onClickCallback(petModel) }),
        shape = MaterialTheme.shapes.small,
        elevation = 16.dp

    ) {
        Column {
            Row {
                Image(
                    painter = painterResource(petModel.imageRes),
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
