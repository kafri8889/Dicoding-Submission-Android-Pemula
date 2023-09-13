package com.anafthdev.dicodingsubmission.foundation.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anafthdev.dicodingsubmission.R
import com.anafthdev.dicodingsubmission.databinding.ListItemDogBinding
import com.anafthdev.dicodingsubmission.data.model.DogItem
import com.anafthdev.dicodingsubmission.ui.DetailActivity
import com.anafthdev.dicodingsubmission.foundation.util.TransitionUtil.makeSceneTransitionAnimation
import com.bumptech.glide.Glide

class DogAdapter(
	private val dogs: List<DogItem>
): RecyclerView.Adapter<DogAdapter.ViewHolder>() {
	
	private lateinit var context: Context

	private var listener: OnDogClickListener? = null
	
	inner class ViewHolder(private val binding: ListItemDogBinding): RecyclerView.ViewHolder(binding.root) {
		fun bind(dog: DogItem) = with(binding) {
			
			Glide.with(context)
				.load(dog.image)
				.placeholder(ColorDrawable(Color.GRAY))
				.into(imageDogListItemDog)
			
			tvDogBreedNameListItemDog.text = dog.breedName
			tvDogBreedDescriptionListItemDog.text = dog.description
			
			root.setOnClickListener {
				listener?.onDogClicked(
					dog = dog,
					views = listOf(
						imageDogListItemDog,
						tvDogBreedNameListItemDog,
						tvDogBreedDescriptionListItemDog
					),
					viewIds = listOf(
						"imageDog",
						"dogBreedName",
						"tvDogBreedNameDescription"
					)
				)
			}
			
		}
	}

	fun setOnDogClickListener(listener: OnDogClickListener) {
		this.listener = listener
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

	fun interface OnDogClickListener {
		/**
		 * @param dog dog yang di klik
		 * @param views View yang akan di transisikan
		 * @param viewIds Id view yang akan di transisikan
		 */
		fun onDogClicked(dog: DogItem, views: List<View>, viewIds: List<String>)
	}
}