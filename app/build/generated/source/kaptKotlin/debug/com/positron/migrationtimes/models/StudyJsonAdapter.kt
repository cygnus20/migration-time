// Code generated by moshi-kotlin-codegen. Do not edit.
package com.positron.migrationtimes.models

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.lang.NullPointerException
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class StudyJsonAdapter(moshi: Moshi) : JsonAdapter<Study>() {
    private val options: JsonReader.Options =
            JsonReader.Options.of("id", "date", "date_gmt", "guid", "modified", "modified_gmt", "slug", "status", "type", "link", "title", "content", "excerpt", "author", "featured_media", "comment_status", "ping_status", "sticky", "template", "format", "meta", "categories", "tags", "jetpack_featured_media_url", "jetpack_publicize_connections", "jetpack_sharing_enabled", "jetpack_shortlink", "links")

    private val intAdapter: JsonAdapter<Int> =
            moshi.adapter<Int>(Int::class.java, kotlin.collections.emptySet(), "id")

    private val nullableStringAdapter: JsonAdapter<String?> =
            moshi.adapter<String?>(String::class.java, kotlin.collections.emptySet(), "date")

    private val nullableGuidAdapter: JsonAdapter<Guid?> =
            moshi.adapter<Guid?>(Guid::class.java, kotlin.collections.emptySet(), "guid")

    private val nullableTitleAdapter: JsonAdapter<Title?> =
            moshi.adapter<Title?>(Title::class.java, kotlin.collections.emptySet(), "title")

    private val nullableContentAdapter: JsonAdapter<Content?> =
            moshi.adapter<Content?>(Content::class.java, kotlin.collections.emptySet(), "content")

    private val nullableExcerptAdapter: JsonAdapter<Excerpt?> =
            moshi.adapter<Excerpt?>(Excerpt::class.java, kotlin.collections.emptySet(), "excerpt")

    private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
            moshi.adapter<Boolean?>(Boolean::class.javaObjectType, kotlin.collections.emptySet(), "sticky")

    private val nullableMetaAdapter: JsonAdapter<Meta?> =
            moshi.adapter<Meta?>(Meta::class.java, kotlin.collections.emptySet(), "meta")

    private val nullableListOfIntAdapter: JsonAdapter<List<Int>?> =
            moshi.adapter<List<Int>?>(Types.newParameterizedType(List::class.java, Int::class.javaObjectType), kotlin.collections.emptySet(), "categories")

    private val nullableListOfNullableAnyAdapter: JsonAdapter<List<Any?>?> =
            moshi.adapter<List<Any?>?>(Types.newParameterizedType(List::class.java, Any::class.java), kotlin.collections.emptySet(), "tags")

    private val booleanAdapter: JsonAdapter<Boolean> =
            moshi.adapter<Boolean>(Boolean::class.java, kotlin.collections.emptySet(), "jetpackSharingEnabled")

    private val nullableLinksAdapter: JsonAdapter<Links?> =
            moshi.adapter<Links?>(Links::class.java, kotlin.collections.emptySet(), "links")

    override fun toString(): String = "GeneratedJsonAdapter(Study)"

    override fun fromJson(reader: JsonReader): Study {
        var id: Int? = null
        var date: String? = null
        var dateGmt: String? = null
        var guid: Guid? = null
        var modified: String? = null
        var modifiedGmt: String? = null
        var slug: String? = null
        var status: String? = null
        var type: String? = null
        var link: String? = null
        var title: Title? = null
        var content: Content? = null
        var excerpt: Excerpt? = null
        var author: Int? = null
        var featuredMedia: Int? = null
        var commentStatus: String? = null
        var pingStatus: String? = null
        var sticky: Boolean? = null
        var template: String? = null
        var format: String? = null
        var meta: Meta? = null
        var categories: List<Int>? = null
        var tags: List<Any?>? = null
        var jetPackFeaturedMediaUrl: String? = null
        var jetpackPublicizeConnections: List<Any?>? = null
        var jetpackSharingEnabled: Boolean? = null
        var jetPackShortLink: String? = null
        var links: Links? = null
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 -> id = intAdapter.fromJson(reader) ?: throw JsonDataException("Non-null value 'id' was null at ${reader.path}")
                1 -> date = nullableStringAdapter.fromJson(reader)
                2 -> dateGmt = nullableStringAdapter.fromJson(reader)
                3 -> guid = nullableGuidAdapter.fromJson(reader)
                4 -> modified = nullableStringAdapter.fromJson(reader)
                5 -> modifiedGmt = nullableStringAdapter.fromJson(reader)
                6 -> slug = nullableStringAdapter.fromJson(reader)
                7 -> status = nullableStringAdapter.fromJson(reader)
                8 -> type = nullableStringAdapter.fromJson(reader)
                9 -> link = nullableStringAdapter.fromJson(reader)
                10 -> title = nullableTitleAdapter.fromJson(reader)
                11 -> content = nullableContentAdapter.fromJson(reader)
                12 -> excerpt = nullableExcerptAdapter.fromJson(reader)
                13 -> author = intAdapter.fromJson(reader) ?: throw JsonDataException("Non-null value 'author' was null at ${reader.path}")
                14 -> featuredMedia = intAdapter.fromJson(reader) ?: throw JsonDataException("Non-null value 'featuredMedia' was null at ${reader.path}")
                15 -> commentStatus = nullableStringAdapter.fromJson(reader)
                16 -> pingStatus = nullableStringAdapter.fromJson(reader)
                17 -> sticky = nullableBooleanAdapter.fromJson(reader)
                18 -> template = nullableStringAdapter.fromJson(reader)
                19 -> format = nullableStringAdapter.fromJson(reader)
                20 -> meta = nullableMetaAdapter.fromJson(reader)
                21 -> categories = nullableListOfIntAdapter.fromJson(reader)
                22 -> tags = nullableListOfNullableAnyAdapter.fromJson(reader)
                23 -> jetPackFeaturedMediaUrl = nullableStringAdapter.fromJson(reader)
                24 -> jetpackPublicizeConnections = nullableListOfNullableAnyAdapter.fromJson(reader)
                25 -> jetpackSharingEnabled = booleanAdapter.fromJson(reader) ?: throw JsonDataException("Non-null value 'jetpackSharingEnabled' was null at ${reader.path}")
                26 -> jetPackShortLink = nullableStringAdapter.fromJson(reader)
                27 -> links = nullableLinksAdapter.fromJson(reader)
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = Study(
                id = id ?: throw JsonDataException("Required property 'id' missing at ${reader.path}"),
                date = date,
                dateGmt = dateGmt,
                guid = guid,
                modified = modified,
                modifiedGmt = modifiedGmt,
                slug = slug,
                status = status,
                type = type,
                link = link,
                title = title,
                content = content,
                excerpt = excerpt,
                author = author ?: throw JsonDataException("Required property 'author' missing at ${reader.path}"),
                featuredMedia = featuredMedia ?: throw JsonDataException("Required property 'featuredMedia' missing at ${reader.path}"),
                commentStatus = commentStatus,
                pingStatus = pingStatus,
                sticky = sticky,
                template = template,
                format = format,
                meta = meta,
                categories = categories,
                tags = tags,
                jetPackFeaturedMediaUrl = jetPackFeaturedMediaUrl,
                jetpackPublicizeConnections = jetpackPublicizeConnections,
                jetpackSharingEnabled = jetpackSharingEnabled ?: throw JsonDataException("Required property 'jetpackSharingEnabled' missing at ${reader.path}"),
                jetPackShortLink = jetPackShortLink,
                links = links)
        return result
    }

    override fun toJson(writer: JsonWriter, value: Study?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("id")
        intAdapter.toJson(writer, value.id)
        writer.name("date")
        nullableStringAdapter.toJson(writer, value.date)
        writer.name("date_gmt")
        nullableStringAdapter.toJson(writer, value.dateGmt)
        writer.name("guid")
        nullableGuidAdapter.toJson(writer, value.guid)
        writer.name("modified")
        nullableStringAdapter.toJson(writer, value.modified)
        writer.name("modified_gmt")
        nullableStringAdapter.toJson(writer, value.modifiedGmt)
        writer.name("slug")
        nullableStringAdapter.toJson(writer, value.slug)
        writer.name("status")
        nullableStringAdapter.toJson(writer, value.status)
        writer.name("type")
        nullableStringAdapter.toJson(writer, value.type)
        writer.name("link")
        nullableStringAdapter.toJson(writer, value.link)
        writer.name("title")
        nullableTitleAdapter.toJson(writer, value.title)
        writer.name("content")
        nullableContentAdapter.toJson(writer, value.content)
        writer.name("excerpt")
        nullableExcerptAdapter.toJson(writer, value.excerpt)
        writer.name("author")
        intAdapter.toJson(writer, value.author)
        writer.name("featured_media")
        intAdapter.toJson(writer, value.featuredMedia)
        writer.name("comment_status")
        nullableStringAdapter.toJson(writer, value.commentStatus)
        writer.name("ping_status")
        nullableStringAdapter.toJson(writer, value.pingStatus)
        writer.name("sticky")
        nullableBooleanAdapter.toJson(writer, value.sticky)
        writer.name("template")
        nullableStringAdapter.toJson(writer, value.template)
        writer.name("format")
        nullableStringAdapter.toJson(writer, value.format)
        writer.name("meta")
        nullableMetaAdapter.toJson(writer, value.meta)
        writer.name("categories")
        nullableListOfIntAdapter.toJson(writer, value.categories)
        writer.name("tags")
        nullableListOfNullableAnyAdapter.toJson(writer, value.tags)
        writer.name("jetpack_featured_media_url")
        nullableStringAdapter.toJson(writer, value.jetPackFeaturedMediaUrl)
        writer.name("jetpack_publicize_connections")
        nullableListOfNullableAnyAdapter.toJson(writer, value.jetpackPublicizeConnections)
        writer.name("jetpack_sharing_enabled")
        booleanAdapter.toJson(writer, value.jetpackSharingEnabled)
        writer.name("jetpack_shortlink")
        nullableStringAdapter.toJson(writer, value.jetPackShortLink)
        writer.name("links")
        nullableLinksAdapter.toJson(writer, value.links)
        writer.endObject()
    }
}
