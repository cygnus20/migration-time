package com.positron.migrationtimes.models

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class WpFeaturedMedia (var embeddable: Boolean?,
                            var href: String?) : Parcelable