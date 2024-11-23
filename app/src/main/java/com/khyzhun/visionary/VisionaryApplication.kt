package com.khyzhun.visionary

import android.app.Application
import timber.log.Timber
import timber.log.Timber.Forest.plant


class VisionaryApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initDebugTimber()
    }

    private fun initDebugTimber() {
        plant(Timber.DebugTree())
    }
}