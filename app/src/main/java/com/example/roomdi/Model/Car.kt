package com.example.roomdi.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Car (
    @PrimaryKey(autoGenerate = true) var id: Int?,
    val name: String,
    val price: String,
    )