package com.sunchildapps.diary.model

import java.text.SimpleDateFormat
import java.util.*

data class User(
    val id: Int,
    var name: String,
    var lastName: String,
    var aboutMe: String? = null,
    private val _dateOfBirth: Date
) {
    val dateOfBirth: String
        get() = _dateOfBirth.toSimpleString()
}

fun Date.toSimpleString() : String {
    val format = SimpleDateFormat("dd/MM/yyy", Locale.getDefault())
    return format.format(this)
}