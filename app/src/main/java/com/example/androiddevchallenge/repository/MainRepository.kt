package com.example.androiddevchallenge.repository

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.PetModel

object MainRepository {
    val allPets = listOf(
        PetModel(0, "Teddy", "Male", "German Shepherd",
            20.4, 1, R.drawable.pet1),
        PetModel(1, "Ollie", "Female", "Shepherd",
            18.7, 1, R.drawable.pet2),
        PetModel(2, "Butterfingers", "Male", "Shepherd",
            6.7, 4, R.drawable.pet3),
        PetModel(3, "Snugglekins", "Female", "Shepherd",
            9.9, 2, R.drawable.pe4),
        PetModel(4, "Beau", "Female", "Shepherd",
            11.9, 1, R.drawable.pet5),
        PetModel(5, "Ollie", "Female", "Shepherd",
            13.1, 3, R.drawable.pet6),
    )
    fun getPetById(id: Int): PetModel = allPets[id]
}