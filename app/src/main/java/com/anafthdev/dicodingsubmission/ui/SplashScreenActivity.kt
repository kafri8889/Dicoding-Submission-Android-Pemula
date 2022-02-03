package com.anafthdev.dicodingsubmission.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.anafthdev.dicodingsubmission.R
import com.google.android.material.color.DynamicColors

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setTheme(R.style.Theme_DicodingSubmission_SplashScreen)
		DynamicColors.applyIfAvailable(this)
		setContentView(R.layout.activity_splash_screen)
		
		Handler(Looper.getMainLooper()).postDelayed({
			startActivity(Intent(this, MainActivity::class.java))
			finish()
		}, 1800)
		
	}
}