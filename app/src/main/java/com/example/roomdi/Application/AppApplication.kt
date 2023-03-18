package com.example.roomdi.Application

import android.app.Application
import com.example.roomdi.di.daoModule
import com.example.roomdi.di.repositoryModule
import com.example.roomdi.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppApplication  : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AppApplication)
            modules(viewModelModule)
            modules(repositoryModule)
            modules(daoModule)
        }
    }
}