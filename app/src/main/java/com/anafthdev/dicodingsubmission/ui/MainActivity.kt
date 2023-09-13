package com.anafthdev.dicodingsubmission.ui

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.LinearLayoutManager
import com.anafthdev.dicodingsubmission.R
import com.anafthdev.dicodingsubmission.foundation.adapter.DogAdapter
import com.anafthdev.dicodingsubmission.data.datasource.local.LocalDogItemDataProvider
import com.anafthdev.dicodingsubmission.databinding.ActivityMainBinding
import com.anafthdev.dicodingsubmission.data.model.DogItem
import com.anafthdev.dicodingsubmission.foundation.util.TransitionUtil.makeSceneTransitionAnimation
import com.google.android.material.color.DynamicColors

class MainActivity: AppCompatActivity() {
	
	private lateinit var binding: ActivityMainBinding
	
	@SuppressLint("IntentWithNullActionLaunch")
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		// Gunakan splash screen API, supaya nggak bikin splash screen manual
		installSplashScreen() // Splash screen

		// Set content view & bind
		setContentView(ActivityMainBinding.inflate(layoutInflater).also { binding = it }.root)
		
		with(binding) {
			setSupportActionBar(toolbar)
			supportActionBar!!.title = "Dogs"
		
			rvDog.apply {
				layoutManager = LinearLayoutManager(this@MainActivity)
				adapter = DogAdapter(LocalDogItemDataProvider.values).apply {
					setOnDogClickListener { dog, views, ids ->
						startActivity(
							Intent(context, DetailActivity::class.java).apply { putExtra("dog", dog) },
							makeSceneTransitionAnimation(views, ids)
						)
					}
				}
			}
		}
	}
	
	override fun onCreateOptionsMenu(menu: Menu?): Boolean {
		menuInflater.inflate(R.menu.menu_main_activity, menu)
		
		return true
	}
	
	@SuppressLint("IntentWithNullActionLaunch")
	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		when(item.itemId) {
			R.id.about_MenuMainActivity -> startActivity(Intent(this, AboutActivity::class.java))
		}
		
		return true
	}
}