package com.anafthdev.dicodingsubmission.model

import android.os.Parcel
import android.os.Parcelable

data class DogInfo(
    val breedGroup: String,
    val height: String,
    val life: String,
    val weight: String
): Parcelable {
    
    constructor(parcel: Parcel): this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
    )
    
    override fun describeContents(): Int {
        return 0
    }
    
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(breedGroup)
        parcel.writeString(height)
        parcel.writeString(life)
        parcel.writeString(weight)
    }
    
    companion object CREATOR : Parcelable.Creator<DogInfo> {
        override fun createFromParcel(parcel: Parcel): DogInfo {
            return DogInfo(parcel)
        }
        
        override fun newArray(size: Int): Array<DogInfo?> {
            return arrayOfNulls(size)
        }
    }
    
    object Data {
        
        val default = DogInfo(
            weight = "",
            height = "",
            life = "",
            breedGroup = ""
        )
        
        val dogInfoList = listOf(
            DogInfo(
                weight = "50 to 75 pounds",
                height = "20 to 29 inches",
                life = "10 to 12 years",
                breedGroup = "mixed breed dogs"
            ),
            DogInfo(
                weight = "88 to 145 pounds",
                height = "23 to 25 inches",
                life = "10 to 12 years",
                breedGroup = "mixed breed dogs"
            ),
            DogInfo(
                weight = "17 to 23 pounds",
                height = "1 foot, 3 inches to 1 foot, 4 inches tall at the shoulder",
                life = "14 to 16 years",
                breedGroup = "terrier dogs"
            ),
            DogInfo(
                weight = "30 to 40 pounds",
                height = "1 foot, 5 inches to 1 foot, 8 inches tall at the shoulder",
                life = "10 to 13 years",
                breedGroup = "sporting dogs"
            ),
            DogInfo(
                weight = "55 to 80 pounds",
                height = "1 foot, 9 inches to 2 feet, 2 inches tall at the shoulder",
                life = "10 to 12 years",
                breedGroup = "sporting dogs"
            ),
            DogInfo(
                weight = "6 to 12 pounds",
                height = "8 to 12 inches",
                life = "12 to 16 years",
                breedGroup = "mixed breed dogs"
            ),
            DogInfo(
                weight = "10 to 30 pounds",
                height = "11 to 17 inches",
                life = "12 to 15 years",
                breedGroup = "mixed breed dogs"
            ),
            DogInfo(
                weight = "80 to 150 pounds",
                height = "2 feet, 3 inches to 2 feet, 5 inches tall at the shoulder",
                life = "11 to 13 years",
                breedGroup = "working dogs"
            ),
            DogInfo(
                weight = "30 to 60 pounds",
                height = "12 to 16 inches",
                life = "10 to 13 years",
                breedGroup = "mixed breed dogs"
            ),
            DogInfo(
                weight = "75 to 100 pounds",
                height = "1 foot, 11 inches to 2 feet, 3 inches tall at the shoulder",
                life = "10 to 12 years",
                breedGroup = "hound dogs"
            ),
            DogInfo(
                weight = "40 to 95 pounds",
                height = "16 to 25 inches",
                life = "12 to 18 years",
                breedGroup = "working dogs"
            ),
            DogInfo(
                weight = "80 to 110 pounds",
                height = "1 foot, 11 inches to 2 feet, 3 inches tall at the shoulder",
                life = "11 to 15 years",
                breedGroup = "hound dogs"
            ),
            DogInfo(
                weight = "10 to 20 pounds",
                height = "12 to 15 inches",
                life = "12 to 15 years",
                breedGroup = "mixed breed dogs"
            )
        )
    }
}