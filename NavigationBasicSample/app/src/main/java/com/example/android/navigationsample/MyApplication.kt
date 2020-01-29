package com.example.android.navigationsample

import android.app.Application
import io.branch.referral.Branch

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Branch.enableLogging()
        Branch.getAutoInstance(this)
    }

}