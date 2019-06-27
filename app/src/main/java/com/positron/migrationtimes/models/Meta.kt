package com.positron.migrationtimes.models

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Meta(@Json(name="spay_email")var spayEmail: String?,
                @Json(name="jetpack_publicize_message")var jetPackPublicizeMessage: String?) : Parcelable