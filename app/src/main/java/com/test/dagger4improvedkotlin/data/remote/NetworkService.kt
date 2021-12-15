package com.test.dagger4improvedkotlin.data.remote

import android.content.Context
import com.test.dagger4improvedkotlin.di.qualifier.NetworkInfo
import com.test.dagger4improvedkotlin.di.qualifier.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkService @Inject constructor(@ApplicationContext private val context: Context, @NetworkInfo private val apiKey: String) {
    fun getDummyData() = "NETWORK DUMMY DATA"
}