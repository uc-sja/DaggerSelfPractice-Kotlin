package com.test.dagger4improvedkotlin.ui

import com.test.dagger4improvedkotlin.data.local.DatabaseService
import com.test.dagger4improvedkotlin.data.remote.NetworkService

class MainViewModel(private val databaseService: DatabaseService, private val networkService: NetworkService) {
    fun getSomeData() = databaseService.getDummyData()+networkService.getDummyData()
}