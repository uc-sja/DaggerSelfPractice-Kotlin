package com.test.dagger4improvedkotlin.ui

import com.test.dagger4improvedkotlin.data.local.DatabaseService
import com.test.dagger4improvedkotlin.data.remote.NetworkService
import javax.inject.Inject

class MainViewModel @Inject constructor(private val databaseService: DatabaseService, private val networkService: NetworkService) {
    fun getSomeData() = databaseService.getDummyData()+networkService.getDummyData()
}