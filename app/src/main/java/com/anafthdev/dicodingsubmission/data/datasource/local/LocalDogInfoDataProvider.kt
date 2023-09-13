package com.anafthdev.dicodingsubmission.data.datasource.local

import com.anafthdev.dicodingsubmission.data.model.DogInfo

object LocalDogInfoDataProvider {

    val empty = DogInfo("", "", "", "")

    val dogInfo1 = DogInfo(
        weight = "50 to 75 pounds",
        height = "20 to 29 inches",
        life = "10 to 12 years",
        breedGroup = "mixed breed dogs"
    )

    val dogInfo2 = DogInfo(
        weight = "88 to 145 pounds",
        height = "23 to 25 inches",
        life = "10 to 12 years",
        breedGroup = "mixed breed dogs"
    )

    val dogInfo3 = DogInfo(
        weight = "17 to 23 pounds",
        height = "1 foot, 3 inches to 1 foot, 4 inches tall at the shoulder",
        life = "14 to 16 years",
        breedGroup = "terrier dogs"
    )

    val dogInfo4 = DogInfo(
        weight = "30 to 40 pounds",
        height = "1 foot, 5 inches to 1 foot, 8 inches tall at the shoulder",
        life = "10 to 13 years",
        breedGroup = "sporting dogs"
    )

    val dogInfo5 = DogInfo(
        weight = "55 to 80 pounds",
        height = "1 foot, 9 inches to 2 feet, 2 inches tall at the shoulder",
        life = "10 to 12 years",
        breedGroup = "sporting dogs"
    )

    val dogInfo6 = DogInfo(
        weight = "6 to 12 pounds",
        height = "8 to 12 inches",
        life = "12 to 16 years",
        breedGroup = "mixed breed dogs"
    )

    val dogInfo7 = DogInfo(
        weight = "10 to 30 pounds",
        height = "11 to 17 inches",
        life = "12 to 15 years",
        breedGroup = "mixed breed dogs"
    )

    val dogInfo8 = DogInfo(
        weight = "80 to 150 pounds",
        height = "2 feet, 3 inches to 2 feet, 5 inches tall at the shoulder",
        life = "11 to 13 years",
        breedGroup = "working dogs"
    )

    val dogInfo9 = DogInfo(
        weight = "30 to 60 pounds",
        height = "12 to 16 inches",
        life = "10 to 13 years",
        breedGroup = "mixed breed dogs"
    )

    val dogInfo10 = DogInfo(
        weight = "75 to 100 pounds",
        height = "1 foot, 11 inches to 2 feet, 3 inches tall at the shoulder",
        life = "10 to 12 years",
        breedGroup = "hound dogs"
    )

    val dogInfo11 = DogInfo(
        weight = "40 to 95 pounds",
        height = "16 to 25 inches",
        life = "12 to 18 years",
        breedGroup = "working dogs"
    )

    val dogInfo12 = DogInfo(
        weight = "80 to 110 pounds",
        height = "1 foot, 11 inches to 2 feet, 3 inches tall at the shoulder",
        life = "11 to 15 years",
        breedGroup = "hound dogs"
    )

    val dogInfo13 = DogInfo(
        weight = "10 to 20 pounds",
        height = "12 to 15 inches",
        life = "12 to 15 years",
        breedGroup = "mixed breed dogs"
    )


    val values = listOf(
        dogInfo1,
        dogInfo2,
        dogInfo3,
        dogInfo4,
        dogInfo5,
        dogInfo6,
        dogInfo7,
        dogInfo8,
        dogInfo9,
        dogInfo10,
        dogInfo11,
        dogInfo12,
        dogInfo13,
    )
}