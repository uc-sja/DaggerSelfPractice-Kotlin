package com.test.dagger4improvedkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.dagger4improvedkotlin.MyApp
import com.test.dagger4improvedkotlin.R
import com.test.dagger4improvedkotlin.data.local.DatabaseService
import com.test.dagger4improvedkotlin.di.component.DaggerActivityComponent
import com.test.dagger4improvedkotlin.di.module.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    @Inject
    lateinit var databaseService: DatabaseService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getDependencies()

    }

    private fun getDependencies() {
        DaggerActivityComponent
            .builder()
            .applicationComponent((applicationContext as MyApp).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .trigger(this)
    }
}