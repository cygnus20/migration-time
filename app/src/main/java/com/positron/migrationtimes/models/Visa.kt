package com.positron.migrationtimes.models

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
@JsonClass(generateAdapter = true)
data class Visa (@Json(name="id")var id: Int,
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
                 @Json(name="excerpt")var excerpt: Excerpt?,
                 @Json(name="author")var author: Int,
                 @Json(name="featured_media")var featuredMedia: Int,
                 @Json(name="comment_status")var commentStatus: String?,
                 @Json(name="ping_status")var pingStatus: String?,
                 @Json(name="sticky")var sticky: Boolean?,
                 @Json(name="template")var template: String?,
                 @Json(name="format")var format: String?,
                 @Json(name="meta")var meta: Meta?,
                 @Json(name="categories")var categories: List<Int>?,
                 @Json(name="tags")var tags: List<@RawValue Any?>?,
                 @Json(name="jetpack_featured_media_url")var jetPackFeaturedMediaUrl: String?,
                 @Json(name="jetpack_publicize_connections")var jetpackPublicizeConnections: List<@RawValue Any?>?,
                 @Json(name="jetpack_sharing_enabled")var jetpackSharingEnabled: Boolean,
                 @Json(name="jetpack_shortlink")var jetPackShortLink: String?,
                 @Json(name="links")var links: Links?
) : Parcelable