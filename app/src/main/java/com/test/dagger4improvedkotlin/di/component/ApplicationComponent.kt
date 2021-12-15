package com.test.dagger4improvedkotlin.di.component

import com.test.dagger4improvedkotlin.MyApp
import com.test.dagger4improvedkotlin.data.local.DatabaseService
import com.test.dagger4improvedkotlin.data.remote.NetworkService
import com.test.dagger4improvedkotlin.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun trigger(myApp: MyApp)

    fun netWorkServiceProvider():NetworkService
    fun databaseProvider(): DatabaseService

}