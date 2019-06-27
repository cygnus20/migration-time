package com.positron.migrationtimes.models

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Cury (var name: String?,
                 var href: String?,
                 var templated: Boolean) : Parcelable