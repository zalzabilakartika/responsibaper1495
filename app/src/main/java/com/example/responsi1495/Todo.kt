package com.example.responsi1495

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Todo (
    val waktu: String,
    val space: String
    ) : Parcelable