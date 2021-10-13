package com.example.recyclerview_rizkisyafa_24

import android.os.Parcelable
import android.view.View
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Students(
    val imgStudents:Int,
    val nameStudents:String,
    val descStudents:String
) : Parcelable