package com.test.dagger4improvedkotlin.di.module

import android.content.Context
import com.test.dagger4improvedkotlin.MyApp
import com.test.dagger4improvedkotlin.di.qualifier.NetworkInfo
import com.test.dagger4improvedkotlin.di.qualifier.ApplicationContext
import com.test.dagger4improvedkotlin.di.qualifier.DatabaseInfo
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val application: MyApp) {

    @ApplicationContext
    @Provides
    fun contextProvider(): Context{
        return application
    }

    @DatabaseInfo
    @Provides
    fun databaseNameProvider(): String {
        return "SampleDatabase"
    }

    @NetworkInfo
    @Provides
    fun apiKeyProvider(): String {
        return "SampleNetworkKey"
    }

    @DatabaseInfo
    @Provides
    fun databaseVersionProvider(): Int {
        return 1
    }

}