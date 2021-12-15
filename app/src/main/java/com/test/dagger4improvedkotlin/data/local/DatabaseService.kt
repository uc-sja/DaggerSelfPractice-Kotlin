package com.test.dagger4improvedkotlin.data.local

import android.content.Context

class DatabaseService(private val context: Context, private val databaseName: String, private val databaseVersion: Int) {
    fun getDummyData() = "DATABSASE DUMMY DATA"
}