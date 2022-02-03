package com.anafthdev.dicodingsubmission.ui

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.anafthdev.dicodingsubmission.R
import com.anafthdev.dicodingsubmission.databinding.ActivityDetailBinding
import com.anafthdev.dicodingsubmission.model.DogItem
import com.anafthdev.dicodingsubmission.utils.TransitionUtils.applySceneTransitionAnimation
import com.anafthdev.dicodingsubmission.utils.TransitionUtils.setSharedElementEnterTransition
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
	
	private lateinit var binding: ActivityDetailBinding
	
	private lateinit var dog: DogItem
	
	@SuppressLint("SetTextI18n")
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(
			ActivityDetailBinding.inflate(layoutInflater).also {
				binding = it
			}.root
		)
		
		dog = intent.getParcelableExtra("dog") ?: DogItem.Data.default
		
		with(binding) {
			
			setSupportActionBar(includeToolbarDetailActivity.toolbar)
			supportActionBar!!.title = "Dog Detail"
			supportActionBar!!.setDisplayShowHomeEnabled(true)
			supportActionBar!!.setDisplayHomeAsUpEnabled(true)
			
			setSharedElementEnterTransition(R.transition.shared_element_transition)
			applySceneTransitionAnimation(
				listOf(
					imageDogDetailActivity,
					tvDogBreedNameDetailActivity,
					tvDogBreedDescriptionDetailActivity
				), listOf(
					"imageDog",
					"dogBreedName",
					"tvDogBreedNameDescription"
				)
			)
			
			Glide.with(this@DetailActivity)
				.load(dog.image)
				.placeholder(ColorDrawable(Color.GRAY))
				.into(imageDogDetailActivity)
			
			tvDogBreedNameDetailActivity.text = dog.breedName
			tvDogBreedDescriptionDetailActivity.text = dog.description
			
			tvDogLifeDetailActivity.text = "${getString(R.string.dog_info_life)} ${dog.dogInfo.life}"
			tvDogHeightDetailActivity.text = "${getString(R.string.dog_info_height)} ${dog.dogInfo.height}"
			tvDogWeightDetailActivity.text = "${getString(R.string.dog_info_weight)} ${dog.dogInfo.weight}"
			tvDogBreedGroupDetailActivity.text = "${getString(R.string.dog_info_breed_group)} ${dog.dogInfo.breedGroup}"
		}
	}
	
	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		
		when(item.itemId) {
			android.R.id.home -> onBackPressed()
		}
		
		return true
	}
}