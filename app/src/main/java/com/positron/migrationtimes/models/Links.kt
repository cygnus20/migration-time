package com.positron.migrationtimes.models

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
@Json(name = "_links")
data class Links (var self: List<Self?>?,
                  var collection: List<Collection?>?,
                  var about: List<About?>?,
                  var author: List<Author?>?,
                  var replies: List<Reply?>?,
                  @Json(name="version-history")var versionHistory: List<VersionHistory?>?,
                  @Json(name="predecessor-version")var predecessorVersion: List<PredecessorVersion?>?,
                  @Json(name="wp:featured_media")var wpFeaturedMedia: List<WpFeaturedMedia?>?,
                  @Json(name="wp:attachment")var wpAttachment: List<WpAttachment?>?,
                  @Json(name="wp:term")var wpTerm: List<WpTerm?>?,
                  var curies: List<Cury?>?
                  ) : Parcelable