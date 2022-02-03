package com.anafthdev.dicodingsubmission.adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anafthdev.dicodingsubmission.R
import com.anafthdev.dicodingsubmission.databinding.ListItemDogBinding
import com.anafthdev.dicodingsubmission.model.DogItem
import com.anafthdev.dicodingsubmission.ui.DetailActivity
import com.anafthdev.dicodingsubmission.utils.TransitionUtils.makeSceneTransitionAnimation
import com.bumptech.glide.Glide

class DogAdapter(
	private val dogs: List<DogItem>
): RecyclerView.Adapter<DogAdapter.ViewHolder>() {
	
	private lateinit var context: Context
	
	inner class ViewHolder(private val binding: ListItemDogBinding): RecyclerView.ViewHolder(binding.root) {
	
		fun bind(dog: DogItem) = with(binding) {
			
			Glide.with(context)
				.load(dog.image)
				.placeholder(ColorDrawable(Color.GRAY))
				.into(imageDogListItemDog)
			
			tvDogBreedNameListItemDog.text = dog.breedName
			tvDogBreedDescriptionListItemDog.text = dog.description
			
			root.setOnClickListener {
				context.startActivity(
					Intent(context, DetailActivity::class.java).apply {
						putExtra("dog", dog)
					},
					(context as Activity).makeSceneTransitionAnimation(
						listOf(
							imageDogListItemDog,
							tvDogBreedNameListItemDog,
							tvDogBreedDescriptionListItemDog
						),
						listOf(
							"imageDog",
							"dogBreedName",
							"tvDogBreedNameDescription"
						)
					)
				)
			}
			
		}
	}
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		context = parent.context
		
		return ViewHolder(
			ListItemDogBinding.bind(
				LayoutInflater.from(context).inflate(R.layout.list_item_dog, parent, false)
			)
		)
	}
	
	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		holder.bind(dogs[position])
	}
	
	override fun getItemCount(): Int = dogs.size
}