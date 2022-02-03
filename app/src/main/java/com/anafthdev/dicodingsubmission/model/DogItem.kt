package com.anafthdev.dicodingsubmission.model

import android.os.Parcel
import android.os.Parcelable

data class DogItem(
    val breedName: String,
    val description: String,
    val dogInfo: DogInfo,
    val id: String,
    val image: String
): Parcelable {
    
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readParcelable(DogInfo::class.java.classLoader) ?: DogInfo.Data.default,
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )
    
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(breedName)
        parcel.writeString(description)
        parcel.writeParcelable(dogInfo, flags)
        parcel.writeString(id)
        parcel.writeString(image)
    }
    
    override fun describeContents(): Int {
        return 0
    }
    
    companion object CREATOR : Parcelable.Creator<DogItem> {
        override fun createFromParcel(parcel: Parcel): DogItem {
            return DogItem(parcel)
        }
        
        override fun newArray(size: Int): Array<DogItem?> {
            return arrayOfNulls(size)
        }
    }
    
    object Data {
        
        val default = DogItem(
            id = "",
            breedName = "",
            description = "",
            image = "",
            dogInfo = DogInfo.Data.default,
        )
        
        val dogs = listOf(
            DogItem(
                id = "5eaff43af96b5978ca726ccc",
                breedName = "afador",
                description = "The Afador is a mixed breed dog–a cross between the Afghan Hound and Labrador Retriever dog breeds. Loyal, energetic, and affectionate, these pups inherited some of the best qualities from both of their parents.",
                image = "https://cdn2-www.dogtime.com/assets/uploads/2019/08/afador-mixed-dog-breed-pictures-cover-650x368.jpg",
                dogInfo = DogInfo.Data.dogInfoList[0],
            ),
            DogItem(
                id = "5eaff43af96b5978ca726cd4",
                breedName = "akita chow",
                description = "The Akita Chow is a mixed breed dog–a cross between the Akita and Chow Chow dog breeds. Large, independent, and loyal, these pups inherited some of the best traits from both of their parents.",
                image = "https://cdn3-www.dogtime.com/assets/uploads/2020/04/akita-chow-mixed-dog-breed-pictures-cover-650x368.jpg",
                dogInfo = DogInfo.Data.dogInfoList[1],
            ),
            DogItem(
                id = "5eaff43af96b5978ca726cfb",
                breedName = "bedlington terrier",
                description = "The Bedlington Terrier dog breed originated as a killer of vermin and poacher’s sidekick. Today Bedlingtons excel as companions and in the show ring. Although they still have excellent hunting instincts, a keen sense of smell, and the will to go to ground, they are rarely used in the field.",
                image = "https://cdn1-www.dogtime.com/assets/uploads/2011/01/file_23056_bedlington-terrier-300x189.jpg",
                dogInfo = DogInfo.Data.dogInfoList[2],
            ),
            DogItem(
                id = "5eaff43af96b5978ca726d21",
                breedName = "brittany",
                description = "Brittanys were bred as gundogs, and they definitely have birds on the brain. Although they’re often called Brittany Spaniels, the American Kennel Club dropped the word “spaniel” from this pointing breed’s name in 1982.",
                image = "https://cdn1-www.dogtime.com/assets/uploads/2011/01/file_22956_brittany-300x189.jpg",
                dogInfo = DogInfo.Data.dogInfoList[3],
            ),
            DogItem(
                id = "5eaff43af96b5978ca726d3b",
                breedName = "chesapeake bay retriever",
                description = "The Chesapeake Bay Retriever dog breed originated as a water dog used to hunt and retrieve ducks in the chilly chop of Maryland’s Chesapeake Bay. The dog’s sturdy build, dense coat, stamina, and strength made them ideal for this purpose.",
                image = "https://cdn1-www.dogtime.com/assets/uploads/2011/01/file_22958_chesapeake-bay-retriever-300x189.jpg",
                dogInfo = DogInfo.Data.dogInfoList[4],
            ),
            DogItem(
                id = "5eaff43af96b5978ca726d41",
                breedName = "chilier",
                description = "The Chilier is a mixed breed dog–a cross between the Chihuahua and Cavalier King Charles Spaniel dog breeds. Friendly, sociable, and affectionate, these pups inherited some of the best traits from both of their parents.",
                image = "https://cdn1-www.dogtime.com/assets/uploads/2019/10/chilier-mixed-dog-breed-pictures-cover-650x368.jpg",
                dogInfo = DogInfo.Data.dogInfoList[5],
            ),
            DogItem(
                id = "5eaff43af96b5978ca726ce6",
                breedName = "aussiepom",
                description = "The Aussiepom is a mixed breed dog–a cross between the Australian Shepherd and Pomeranian dog breeds. Affectionate, fun-loving, and nothing short of adorable, these pups inherited some of the best traits from their parents.",
                image = "https://cdn1-www.dogtime.com/assets/uploads/2019/07/aussiepom-mixed-dog-breed-pictures-cover-650x368.jpg",
                dogInfo = DogInfo.Data.dogInfoList[6],
            ),
            DogItem(
                id = "5eaff43af96b5978ca726ce1",
                breedName = "anatolian shepherd dog",
                description = "The Anatolian Shepherd Dog is a native of Turkey, where they were bred as a shepherd’s companion and livestock guardian. They were created with specific traits to resemble the size and color of livestock they defended so predators wouldn’t detect them among the flock. Sometimes called the Anatolian Karabash Dog or Kangal, they’re a fiercely loyal guard dog and a large, impressive dog breed, frequently weighing 120 to 150 pounds at maturity.",
                image = "https://cdn3-www.dogtime.com/assets/uploads/2011/01/file_22910_anatolian-shepherd-dog-300x189.jpg",
                dogInfo = DogInfo.Data.dogInfoList[7],
            ),
            DogItem(
                id = "5eaff43af96b5978ca726cf4",
                breedName = "beabull",
                description = "The Beabull is a mixed breed dog–a cross between the Beagle and the English Bulldog breeds. Loyal, curious, and loving, these pups inherited some of the best qualities from both of their parents.",
                image = "https://cdn1-www.dogtime.com/assets/uploads/2019/12/beabull-mixed-dog-breed-pictures-cover-650x368.jpg",
                dogInfo = DogInfo.Data.dogInfoList[8],
            ),
            DogItem(
                id = "5eaff43af96b5978ca726d03",
                breedName = "black and tan coonhound",
                description = "Born in the USA, the outgoing and friendly black and tan coonhound is a versatile companion who shines in the show ring and field. At home, he’s a superb playmate, jogging or walking companion, and bed warmer.",
                image = "https://cdn2-www.dogtime.com/assets/uploads/2011/01/file_23014_black-and-tan-coonhound-300x189.jpg",
                dogInfo = DogInfo.Data.dogInfoList[9],
            ),
            DogItem(
                id = "5eaff43af96b5978ca726d04",
                breedName = "black mouth cur",
                description = "Energetic, fearless, and strong, the Black Mouth Cur is valued as an all-around working dog bred to help farmers and hunters in the rugged terrain of the southeastern United States.",
                image = "https://cdn1-www.dogtime.com/assets/uploads/2017/11/black-mouth-cur-dog-breed-pictures-cover-650x368.jpg",
                dogInfo = DogInfo.Data.dogInfoList[10],
            ),
            DogItem(
                id = "5eaff43af96b5978ca726d04",
                breedName = "bloodhound",
                description = "The Bloodhound’s ancestors were created in medieval France to trail deer and boar. Today, he’s a highly active and intelligent dog breed whose keen sense of smell has found him a special place in law enforcement and search and rescue. His fans love him for his sweet nature and unique appearance.",
                image = "https://cdn2-www.dogtime.com/assets/uploads/2011/01/file_23016_bloodhound-300x189.jpg",
                dogInfo = DogInfo.Data.dogInfoList[11],
            ),
            DogItem(
                id = "5eaff43af96b5978ca726d16",
                breedName = "boshih",
                description = "The Bo Shih is a mixed breed dog–a cross between the Shih Tzu and Boston Terrier breeds. Small, inquisitive and affectionate, these pups inherited some of the best qualities from both of their parents.",
                image = "https://cdn3-www.dogtime.com/assets/uploads/2019/12/boshih-mixed-dog-breed-pictures-cover-650x368.jpg",
                dogInfo = DogInfo.Data.dogInfoList[12],
            ),
        )
    }
    
}