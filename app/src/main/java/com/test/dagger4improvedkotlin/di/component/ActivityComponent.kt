package com.test.dagger4improvedkotlin.di.component

import com.test.dagger4improvedkotlin.di.module.ActivityModule
import com.test.dagger4improvedkotlin.scope.ActivityScope
import com.test.dagger4improvedkotlin.ui.MainActivity
import dagger.Component

@ActivityScope
@Component(modules = [ActivityModule::class], dependencies = [ApplicationComponent::class])
interface ActivityComponent {
    fun trigger(activity: MainActivity)
}