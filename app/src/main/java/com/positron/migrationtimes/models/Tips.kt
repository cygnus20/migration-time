package com.positron.migrationtimes.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Tips (var id: Int,
                 var title: String,
                 var thumbnail: Int,
                 var salary: String,
                 var address: String)