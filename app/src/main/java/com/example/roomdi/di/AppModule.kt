package com.example.roomdi.di

import com.example.roomdi.Database.CarDatabase
import com.example.roomdi.repository.CarRepository
import com.example.roomdi.viewmodel.CarViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel { CarViewModel(get()) }
}

val repositoryModule = module {
    single { CarRepository(get()) }
}

val daoModule = module {
    single { CarDatabase.getDatabase(androidContext()).getCarDao() }
}