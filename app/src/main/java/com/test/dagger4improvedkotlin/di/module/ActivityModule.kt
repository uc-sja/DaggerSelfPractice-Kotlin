package com.test.dagger4improvedkotlin.di.module

import com.test.dagger4improvedkotlin.data.local.DatabaseService
import com.test.dagger4improvedkotlin.data.remote.NetworkService
import com.test.dagger4improvedkotlin.ui.MainActivity
import com.test.dagger4improvedkotlin.ui.MainViewModel
import dagger.Module
import dagger.Provides

@Module
class ActivityModule (private val activity: MainActivity) {

    @Provides
    fun viewModel(databaseService: DatabaseService, networkService: NetworkService): MainViewModel{
        return MainViewModel(databaseService, networkService)
    }
}