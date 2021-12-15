package com.test.dagger4improvedkotlin

import android.app.Application
import com.test.dagger4improvedkotlin.data.local.DatabaseService
import com.test.dagger4improvedkotlin.data.remote.NetworkService
import com.test.dagger4improvedkotlin.di.component.ApplicationComponent
import com.test.dagger4improvedkotlin.di.component.DaggerApplicationComponent
import com.test.dagger4improvedkotlin.di.module.ApplicationModule
import javax.inject.Inject

class MyApp: Application() {

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var databaseService2: DatabaseService

    lateinit var applicationComponent: ApplicationComponent

    companion object{
         lateinit var myApp: MyApp
    }

    override fun onCreate() {
        super.onCreate()
        myApp = this

        getDependencies()
    }

    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent.builder().
        applicationModule(ApplicationModule(applicationContext as MyApp))
            .build()


        applicationComponent.trigger(myApp)

    }

}