package com.example.bank

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.util.TypedValue

object AccessibilityManager {
    private const val PREF_NAME = "accessibility_prefs"
    private const val KEY_LARGE_TEXT = "large_text"

    fun setLargeTextMode(context: Context, enabled: Boolean) {
        val sharedPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        sharedPref.edit().putBoolean(KEY_LARGE_TEXT, enabled).apply()
    }

    fun isLargeTextMode(context: Context): Boolean {
        val sharedPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        return sharedPref.getBoolean(KEY_LARGE_TEXT, false)
    }
}