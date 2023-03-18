package com.example.roomdi.repository

import androidx.annotation.WorkerThread
import com.example.roomdi.Database.CarDao
import com.example.roomdi.Model.Car
import kotlinx.coroutines.flow.Flow

class CarRepository(private val carDao: CarDao) {

    val allCars: Flow<List<Car>> = carDao.getAllCars()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert (car: Car) {
        carDao.insertCar(car)
    }

}