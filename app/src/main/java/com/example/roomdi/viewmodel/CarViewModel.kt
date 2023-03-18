package com.example.roomdi.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.roomdi.Model.Car
import com.example.roomdi.repository.CarRepository
import kotlinx.coroutines.launch

class CarViewModel (private val repository: CarRepository) : ViewModel(){

    val allCars: LiveData<List<Car>> = repository.allCars.asLiveData()

    fun insert (car: Car) = viewModelScope.launch {
        repository.insert(car)
    }

}