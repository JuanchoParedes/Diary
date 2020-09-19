package com.sunchildapps.diary.model

import android.graphics.drawable.BitmapDrawable
import android.location.Location

data class DiaryEntry(
    val id: Int,
    val entryTitle: String,
    var pictureUrl: String? = null,
    var entryDescription: String,
    val location: Location? = null

    ) {
}