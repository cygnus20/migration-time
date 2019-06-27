package com.positron.migrationtimes.models

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Content (var rendered: String?,
                    @Json(name="protected")var _protected: Boolean) : Parcelable {
}