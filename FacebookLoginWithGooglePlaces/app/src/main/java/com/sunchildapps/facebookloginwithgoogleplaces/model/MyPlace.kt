package com.sunchildapps.facebookloginwithgoogleplaces.model

import android.os.Parcel
import android.os.Parcelable
import java.util.*

class MyPlace(
    val id: String?,
    val address: String?,
    val placeTypes: List<Int>?,
    val locale: Locale?,
    val name: String?,
    val latLng: FloatArray?,
    val pictureUrl: String?,
    val link: String?
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        TODO("placeTypes"),
        TODO("locale"),
        parcel.readString(),
        parcel.createFloatArray(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(address.toString())
        parcel.writeString(name)
        parcel.writeFloatArray(latLng)
        parcel.writeString(pictureUrl)
        parcel.writeString(link)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MyPlace> {
        override fun createFromParcel(parcel: Parcel): MyPlace {
            return MyPlace(parcel)
        }

        override fun newArray(size: Int): Array<MyPlace?> {
            return arrayOfNulls(size)
        }
    }
}