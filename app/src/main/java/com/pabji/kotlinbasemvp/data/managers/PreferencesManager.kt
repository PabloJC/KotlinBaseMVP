package com.pabji.kotlinbasemvp.data.managers

import android.content.Context
import android.content.SharedPreferences

class PreferencesManager(context: Context) {
    val PREFS_FILENAME = "com.pabji.kotlinbasemvp.prefs"

    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0)

}