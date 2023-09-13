package com.anafthdev.dicodingsubmission.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.IntentCompat
import com.anafthdev.dicodingsubmission.R
import com.anafthdev.dicodingsubmission.data.datasource.local.LocalDogItemDataProvider
import com.anafthdev.dicodingsubmission.data.model.DogItem
import com.anafthdev.dicodingsubmission.databinding.ActivityDetailBinding
import com.anafthdev.dicodingsubmission.foundation.util.TransitionUtil.applySceneTransitionAnimation
import com.anafthdev.dicodingsubmission.foundation.util.TransitionUtil.setSharedElementEnterTransition
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
	
	private lateinit var binding: ActivityDetailBinding
	private var dog: DogItem = LocalDogItemDataProvider.empty
	
	@SuppressLint("SetTextI18n")
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(ActivityDetailBinding.inflate(layoutInflater).also { binding = it }.root)

		updateDog()

		with(binding) {
			setSupportActionBar(toolbarDetailActivity)
			supportActionBar!!.apply {
				title = "Dog Detail"
				setDisplayShowHomeEnabled(true)
				setDisplayHomeAsUpEnabled(true)
			}

			setSharedElementEnterTransition(R.transition.shared_element_transition)
            applySceneTransitionAnimation(
                listOf(
                    imageDogDetailActivity,
                    tvDogBreedNameDetailActivity,
                    tvDogBreedDescriptionDetailActivity
                ),
				listOf(
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

	private fun updateDog() {
		if (intent == null) return
		val mDog = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) IntentCompat.getParcelableExtra(intent, "dog", DogItem::class.java)
		else intent.getParcelableExtra("dog")
		mDog?.let { dog = it }
	}

	override fun onNewIntent(intent: Intent?) {
		super.onNewIntent(intent)
		updateDog()
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		when(item.itemId) {
			android.R.id.home -> onBackPressed()
		}

		return true
	}
}