package com.anafthdev.dicodingsubmission.data.datasource.local

import com.anafthdev.dicodingsubmission.data.model.DogItem

object LocalDogItemDataProvider {

    val empty = DogItem("", "", LocalDogInfoDataProvider.empty, "", "")

    val dog1 = DogItem(
        id = "5eaff43af96b5978ca726ccc",
        breedName = "Afador",
        description = "The Afador is a mixed breed dog–a cross between the Afghan Hound and Labrador Retriever dog breeds. Loyal, energetic, and affectionate, these pups inherited some of the best qualities from both of their parents.",
        image = "https://dogtime.com/wp-content/uploads/sites/12/2019/08/Screenshot-2023-07-01-at-10.23.34-PM-e1688264735488.png?w=1024",
        dogInfo = LocalDogInfoDataProvider.values[0],
    )

    val dog2 = DogItem(
        id = "5eaff43af96b5978ca726cd4",
        breedName = "Akita chow",
        description = "The Akita Chow is a mixed breed dog–a cross between the Akita and Chow Chow dog breeds. Large, independent, and loyal, these pups inherited some of the best traits from both of their parents.",
        image = "https://www.hepper.com/wp-content/uploads/2021/11/Akita-Chow-dog-breed.jpg",
        dogInfo = LocalDogInfoDataProvider.values[1],
    )

    val dog3 = DogItem(
        id = "5eaff43af96b5978ca726cfb",
        breedName = "Bedlington terrier",
        description = "The Bedlington Terrier dog breed originated as a killer of vermin and poacher’s sidekick. Today Bedlingtons excel as companions and in the show ring. Although they still have excellent hunting instincts, a keen sense of smell, and the will to go to ground, they are rarely used in the field.",
        image = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcT_wxqG86swzUgop0GX02XbNuCe12glnPL6Q7Gq2KmGGZM5R56t4xI8jYGSYy7M",
        dogInfo = LocalDogInfoDataProvider.values[2],
    )

    val dog4 = DogItem(
        id = "5eaff43af96b5978ca726d21",
        breedName = "Brittany",
        description = "Brittanys were bred as gundogs, and they definitely have birds on the brain. Although they’re often called Brittany Spaniels, the American Kennel Club dropped the word “spaniel” from this pointing breed’s name in 1982.",
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/American_Brittany_standing.jpg/220px-American_Brittany_standing.jpg",
        dogInfo = LocalDogInfoDataProvider.values[3],
    )

    val dog5 = DogItem(
        id = "5eaff43af96b5978ca726d3b",
        breedName = "Chesapeake bay retriever",
        description = "The Chesapeake Bay Retriever dog breed originated as a water dog used to hunt and retrieve ducks in the chilly chop of Maryland’s Chesapeake Bay. The dog’s sturdy build, dense coat, stamina, and strength made them ideal for this purpose.",
        image = "https://www.thesprucepets.com/thmb/EI3tGuGJOOt25FO-29dyxUfyC9g=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/GettyImages-531551412-fa1000021b9d44f298a08b5cc676c495.jpg",
        dogInfo = LocalDogInfoDataProvider.values[4],
    )

    val dog6 = DogItem(
        id = "5eaff43af96b5978ca726d41",
        breedName = "Chilier",
        description = "The Chilier is a mixed breed dog–a cross between the Chihuahua and Cavalier King Charles Spaniel dog breeds. Friendly, sociable, and affectionate, these pups inherited some of the best traits from both of their parents.",
        image = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTC48Fzvsv1JzJj-eUV1VzGmfE3zucLvVCgNSaMhDnF-TANwZSaTeYbqEf4bcTH",
        dogInfo = LocalDogInfoDataProvider.values[5],
    )

    val dog7 = DogItem(
        id = "5eaff43af96b5978ca726ce6",
        breedName = "Aussiepom",
        description = "The Aussiepom is a mixed breed dog–a cross between the Australian Shepherd and Pomeranian dog breeds. Affectionate, fun-loving, and nothing short of adorable, these pups inherited some of the best traits from their parents.",
        image = "https://www.k9web.com/wp-content/uploads/2021/01/blue-eyed-aussie-pom-sitting-780x780.jpg",
        dogInfo = LocalDogInfoDataProvider.values[6],
    )

    val dog8 = DogItem(
        id = "5eaff43af96b5978ca726ce1",
        breedName = "Anatolian shepherd dog",
        description = "The Anatolian Shepherd Dog is a native of Turkey, where they were bred as a shepherd’s companion and livestock guardian. They were created with specific traits to resemble the size and color of livestock they defended so predators wouldn’t detect them among the flock. Sometimes called the Anatolian Karabash Dog or Kangal, they’re a fiercely loyal guard dog and a large, impressive dog breed, frequently weighing 120 to 150 pounds at maturity.",
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Kangal_front_on.jpg/220px-Kangal_front_on.jpg",
        dogInfo = LocalDogInfoDataProvider.values[7],
    )

    val dog9 = DogItem(
        id = "5eaff43af96b5978ca726cf4",
        breedName = "Beabull",
        description = "The Beabull is a mixed breed dog–a cross between the Beagle and the English Bulldog breeds. Loyal, curious, and loving, these pups inherited some of the best qualities from both of their parents.",
        image = "https://www.dogbreedinfo.com/images26/BeabullBeagleBulldogHybridDogsBigBoy4YearsOld1.jpg",
        dogInfo = LocalDogInfoDataProvider.values[8],
    )

    val dog10 = DogItem(
        id = "5eaff43af96b5978ca726d03",
        breedName = "Black and tan coonhound",
        description = "Born in the USA, the outgoing and friendly black and tan coonhound is a versatile companion who shines in the show ring and field. At home, he’s a superb playmate, jogging or walking companion, and bed warmer.",
        image = "https://web5q.lifelearn.com/animalhealthclinic/wp-content/uploads/2011/02/BlackandTan1of1-268x300.jpg",
        dogInfo = LocalDogInfoDataProvider.values[9],
    )

    val dog11 = DogItem(
        id = "5eaff43af96b5978ca726d04",
        breedName = "Black mouth cur",
        description = "Energetic, fearless, and strong, the Black Mouth Cur is valued as an all-around working dog bred to help farmers and hunters in the rugged terrain of the southeastern United States.",
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Black_mouth_cur-10.jpg/220px-Black_mouth_cur-10.jpg",
        dogInfo = LocalDogInfoDataProvider.values[10],
    )

    val dog12 = DogItem(
        id = "5eaff43af96b5978ca726d04",
        breedName = "Bloodhound",
        description = "The Bloodhound’s ancestors were created in medieval France to trail deer and boar. Today, he’s a highly active and intelligent dog breed whose keen sense of smell has found him a special place in law enforcement and search and rescue. His fans love him for his sweet nature and unique appearance.",
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Bloodhound_Erland22.jpg/220px-Bloodhound_Erland22.jpg",
        dogInfo = LocalDogInfoDataProvider.values[11],
    )

    val dog13 = DogItem(
        id = "5eaff43af96b5978ca726d16",
        breedName = "Boshih",
        description = "The Bo Shih is a mixed breed dog–a cross between the Shih Tzu and Boston Terrier breeds. Small, inquisitive and affectionate, these pups inherited some of the best qualities from both of their parents.",
        image = "https://www.dogbreedinfo.com/images21/BoShihBailey2YearsOld.jpg",
        dogInfo = LocalDogInfoDataProvider.values[12],
    )

    val values = listOf(
        dog1,
        dog2,
        dog3,
        dog4,
        dog5,
        dog6,
        dog7,
        dog8,
        dog9,
        dog10,
        dog11,
        dog12,
        dog13,
    )

}