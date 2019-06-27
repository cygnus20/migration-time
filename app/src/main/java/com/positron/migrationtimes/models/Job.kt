package com.positron.migrationtimes.models

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
@JsonClass(generateAdapter = true)
data class Job (@Json(name="id")var id: Int,
                @Json(name="date")var date: String?,
                @Json(name="date_gmt")var dateGmt: String?,
                @Json(name="guid")var guid: Guid?,
                @Json(name="modified")var modified: String?,
                @Json(name="modified_gmt")var modifiedGmt: String?,
                @Json(name="slug")var slug: String?,
                @Json(name="status")var status: String?,
                @Json(name="type")var type: String?,
                @Json(name="link")var link: String?,
                @Json(name="title")var title: Title?,
                @Json(name="content")var content: Content?,
                @Json(name="featured_media")var featuredMedia: Int,
                @Json(name="template")var template: String?,
                @Json(name="meta")var fields: Fields?,
                @Json(name="job-types")var jobTypes: List<Int>?,
                @Json(name="jetpack_publicize_connections")var jetpackPublicizeConnections: List<@RawValue Any?>?,
                @Json(name="jetpack_shortlink")var jetPackShortLink: String?,
                @Json(name="links")var links: Links?
) : Parcelable