package com.example.androiddevchallenge.model

data class PetModel(
    val id: Int,
    val name: String,
    val gender: String,
    val breed: String,
    val weight: Double,
    val age: Int,
    val imageRes: Int,
    val location: String
)
