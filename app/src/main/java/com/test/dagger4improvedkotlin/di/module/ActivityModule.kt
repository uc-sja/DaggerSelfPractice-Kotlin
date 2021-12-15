package com.test.dagger4improvedkotlin.di.module

import android.content.Context
import com.test.dagger4improvedkotlin.data.local.DatabaseService
import com.test.dagger4improvedkotlin.data.remote.NetworkService
import com.test.dagger4improvedkotlin.di.qualifier.ActivityContext
import com.test.dagger4improvedkotlin.scope.ActivityScope
import com.test.dagger4improvedkotlin.ui.MainActivity
import com.test.dagger4improvedkotlin.ui.MainViewModel
import dagger.Module
import dagger.Provides

@Module
class ActivityModule (private val activity: MainActivity) {

    @ActivityContext
    @Provides
    fun provideActivityContext(): Context {
        return activity
    }
}