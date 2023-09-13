package com.anafthdev.dicodingsubmission

import android.app.Application
import com.google.android.material.color.DynamicColors

class DSApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this) // Apply warna dinamis jika tersedia
    }
}