package com.anafthdev.dicodingsubmission.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class DogItem(
    val breedName: String,
    val description: String,
    val dogInfo: @RawValue DogInfo,
    val id: String,
    val image: String
): Parcelable