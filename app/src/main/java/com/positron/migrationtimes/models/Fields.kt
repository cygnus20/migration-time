package com.positron.migrationtimes.models

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Fields (@Json(name="spay_email")var spayEmail: String?,
                   @Json(name = "_job_location")var jobLocation: String?,
                   @Json(name = "_application")var application: String?,
                   @Json(name = "_company_name")var companyName: String?,
                   @Json(name = "_company_website")var companyWebsite: String?,
                   @Json(name = "_company_tagline")var companyTagline: String?,
                   @Json(name = "_company_twitter")var companyTwitter: String?,
                   @Json(name = "_company_video")var companyVideo: String?,
                   @Json(name = "_filled")var filled: Int,
                   @Json(name= "_featured") var featured: Int,
                   @Json(name="jetpack_publicize_message")var jetPackPublicizeMessage: String?) : Parcelable