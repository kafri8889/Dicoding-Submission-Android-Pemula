package com.anafthdev.dicodingsubmission.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DogInfo(
    val breedGroup: String,
    val height: String,
    val life: String,
    val weight: String
): Parcelable