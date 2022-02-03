package com.anafthdev.dicodingsubmission.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.anafthdev.dicodingsubmission.R

class AboutActivity : AppCompatActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_about)
	}
	
	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		
		when(item.itemId) {
			android.R.id.home -> onBackPressed()
		}
		
		return true
	}
}