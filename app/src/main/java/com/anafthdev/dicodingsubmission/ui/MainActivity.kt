package com.anafthdev.dicodingsubmission.ui

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewTreeObserver
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.LinearLayoutManager
import com.anafthdev.dicodingsubmission.R
import com.anafthdev.dicodingsubmission.adapter.DogAdapter
import com.anafthdev.dicodingsubmission.databinding.ActivityMainBinding
import com.anafthdev.dicodingsubmission.model.DogItem
import com.google.android.material.color.DynamicColors

class MainActivity : AppCompatActivity() {
	
	private lateinit var binding: ActivityMainBinding
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		DynamicColors.applyIfAvailable(this)
		setContentView(
			ActivityMainBinding.inflate(layoutInflater).also {
				binding = it
			}.root
		)
		
		with(binding) {
			
			setSupportActionBar(includeToolbarMainActivity.toolbar)
			supportActionBar!!.title = "Dogs"
		
			rvDogMainActivity.apply {
				layoutManager = LinearLayoutManager(this@MainActivity)
				adapter = DogAdapter(DogItem.Data.dogs)
			}
		}
	}
	
	override fun onCreateOptionsMenu(menu: Menu?): Boolean {
		menuInflater.inflate(R.menu.menu_main_activity, menu)
		
		return true
	}
	
	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		
		when(item.itemId) {
			R.id.about_MenuMainActivity -> startActivity(
				Intent(this, AboutActivity::class.java)
			)
		}
		
		return true
	}
}