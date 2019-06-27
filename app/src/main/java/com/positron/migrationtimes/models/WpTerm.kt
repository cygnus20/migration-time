package com.positron.migrationtimes.models

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class WpTerm (var taxonomy: String?,
                   var embeddable: Boolean?,
                   var href: String?) : Parcelable