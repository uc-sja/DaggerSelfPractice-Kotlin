package com.test.dagger4improvedkotlin.data.remote

import android.content.Context
import javax.inject.Inject

class NetworkService(private val context: Context, private val apiKey: String) {
    fun getDummyData() = "NETWORK DUMMY DATA"
}