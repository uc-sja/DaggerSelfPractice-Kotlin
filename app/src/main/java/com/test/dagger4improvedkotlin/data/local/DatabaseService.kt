package com.test.dagger4improvedkotlin.data.local

import android.content.Context
import com.test.dagger4improvedkotlin.di.qualifier.ApplicationContext
import com.test.dagger4improvedkotlin.di.qualifier.DatabaseInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseService @Inject constructor(@ApplicationContext private val context: Context, @DatabaseInfo private val databaseName: String, @DatabaseInfo private val databaseVersion: Int) {
    fun getDummyData() = "DATABSASE DUMMY DATA"
}