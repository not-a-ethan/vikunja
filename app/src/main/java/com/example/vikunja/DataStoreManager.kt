package com.example.vikunja

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore

val Context.user: DataStore<Preferences> by preferencesDataStore(name = "userInfo")

object DataStoreManager {
    val apiURL = stringPreferencesKey("apiURL")
    val apiToken = stringPreferencesKey("apiToken")
}