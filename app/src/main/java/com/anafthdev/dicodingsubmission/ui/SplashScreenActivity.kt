package com.anafthdev.dicodingsubmission.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.anafthdev.dicodingsubmission.R
import com.google.android.material.color.DynamicColors

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setTheme(R.style.Theme_DicodingSubmission_SplashScreen)
		DynamicColors.applyIfAvailable(this)
		installSplashScreen()
		setContentView(R.layout.activity_splash_screen)
		
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
			splashScreen.setSplashScreenTheme(R.style.Theme_DicodingSubmission_SplashScreen)
			splashScreen.setOnExitAnimationListener {
				it.remove()
				startActivity(Intent(this, MainActivity::class.java))
				finish()
			}
		} else {
			Handler(Looper.getMainLooper()).postDelayed({
				startActivity(Intent(this, MainActivity::class.java))
				finish()
			}, 1800)
		}
		
	}
}