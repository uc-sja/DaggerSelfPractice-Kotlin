package com.test.dagger4improvedkotlin.di.module

import com.test.dagger4improvedkotlin.MyApp
import com.test.dagger4improvedkotlin.data.local.DatabaseService
import com.test.dagger4improvedkotlin.data.remote.NetworkService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: MyApp) {

    @Singleton
    @Provides
    fun databaseService() : DatabaseService{
        return DatabaseService(application, "SampleDatabase", 1)
    }

    @Singleton
    @Provides
    fun networkService(): NetworkService {
        return NetworkService(application, "SampleNetworkServiceKey")
    }

}