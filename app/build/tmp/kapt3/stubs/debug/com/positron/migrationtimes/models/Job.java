package com.positron.migrationtimes.models;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bM\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00f8\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\u0017\b\u0001\u0010\u0019\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\u001a\u00a2\u0006\u0002\b\u001b\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0002\u0010\u001fJ\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0011\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018H\u00c6\u0003J\u0018\u0010^\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\u001a\u00a2\u0006\u0002\b\u001b\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00fc\u0001\u0010i\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00182\u0017\b\u0003\u0010\u0019\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\u001a\u00a2\u0006\u0002\b\u001b\u0018\u00010\u00182\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00c6\u0001J\t\u0010j\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010k\u001a\u00020l2\b\u0010m\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010n\u001a\u00020\u0003H\u00d6\u0001J\t\u0010o\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010\'R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010+\"\u0004\b7\u0010-R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010%\"\u0004\b9\u0010\'R)\u0010\u0019\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\u001a\u00a2\u0006\u0002\b\u001b\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010;\"\u0004\b?\u0010=R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010%\"\u0004\bA\u0010\'R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010%\"\u0004\bG\u0010\'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010%\"\u0004\bI\u0010\'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010%\"\u0004\bK\u0010\'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010%\"\u0004\bM\u0010\'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010%\"\u0004\bO\u0010\'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010%\"\u0004\bU\u0010\'\u00a8\u0006u"}, d2 = {"Lcom/positron/migrationtimes/models/Job;", "Landroid/os/Parcelable;", "id", "", "date", "", "dateGmt", "guid", "Lcom/positron/migrationtimes/models/Guid;", "modified", "modifiedGmt", "slug", "status", "type", "link", "title", "Lcom/positron/migrationtimes/models/Title;", "content", "Lcom/positron/migrationtimes/models/Content;", "featuredMedia", "template", "fields", "Lcom/positron/migrationtimes/models/Fields;", "jobTypes", "", "jetpackPublicizeConnections", "", "Lkotlinx/android/parcel/RawValue;", "jetPackShortLink", "links", "Lcom/positron/migrationtimes/models/Links;", "(ILjava/lang/String;Ljava/lang/String;Lcom/positron/migrationtimes/models/Guid;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/positron/migrationtimes/models/Title;Lcom/positron/migrationtimes/models/Content;ILjava/lang/String;Lcom/positron/migrationtimes/models/Fields;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/positron/migrationtimes/models/Links;)V", "getContent", "()Lcom/positron/migrationtimes/models/Content;", "setContent", "(Lcom/positron/migrationtimes/models/Content;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getDateGmt", "setDateGmt", "getFeaturedMedia", "()I", "setFeaturedMedia", "(I)V", "getFields", "()Lcom/positron/migrationtimes/models/Fields;", "setFields", "(Lcom/positron/migrationtimes/models/Fields;)V", "getGuid", "()Lcom/positron/migrationtimes/models/Guid;", "setGuid", "(Lcom/positron/migrationtimes/models/Guid;)V", "getId", "setId", "getJetPackShortLink", "setJetPackShortLink", "getJetpackPublicizeConnections", "()Ljava/util/List;", "setJetpackPublicizeConnections", "(Ljava/util/List;)V", "getJobTypes", "setJobTypes", "getLink", "setLink", "getLinks", "()Lcom/positron/migrationtimes/models/Links;", "setLinks", "(Lcom/positron/migrationtimes/models/Links;)V", "getModified", "setModified", "getModifiedGmt", "setModifiedGmt", "getSlug", "setSlug", "getStatus", "setStatus", "getTemplate", "setTemplate", "getTitle", "()Lcom/positron/migrationtimes/models/Title;", "setTitle", "(Lcom/positron/migrationtimes/models/Title;)V", "getType", "setType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Job implements android.os.Parcelable {
    private int id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String dateGmt;
    @org.jetbrains.annotations.Nullable()
    private com.positron.migrationtimes.models.Guid guid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String modified;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String modifiedGmt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String slug;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String link;
    @org.jetbrains.annotations.Nullable()
    private com.positron.migrationtimes.models.Title title;
    @org.jetbrains.annotations.Nullable()
    private com.positron.migrationtimes.models.Content content;
    private int featuredMedia;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String template;
    @org.jetbrains.annotations.Nullable()
    private com.positron.migrationtimes.models.Fields fields;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.Integer> jobTypes;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.lang.Object> jetpackPublicizeConnections;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String jetPackShortLink;
    @org.jetbrains.annotations.Nullable()
    private com.positron.migrationtimes.models.Links links;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateGmt() {
        return null;
    }
    
    public final void setDateGmt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Guid getGuid() {
        return null;
    }
    
    public final void setGuid(@org.jetbrains.annotations.Nullable()
    com.positron.migrationtimes.models.Guid p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getModified() {
        return null;
    }
    
    public final void setModified(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getModifiedGmt() {
        return null;
    }
    
    public final void setModifiedGmt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSlug() {
        return null;
    }
    
    public final void setSlug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    public final void setLink(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Title getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    com.positron.migrationtimes.models.Title p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Content getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.Nullable()
    com.positron.migrationtimes.models.Content p0) {
    }
    
    public final int getFeaturedMedia() {
        return 0;
    }
    
    public final void setFeaturedMedia(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTemplate() {
        return null;
    }
    
    public final void setTemplate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Fields getFields() {
        return null;
    }
    
    public final void setFields(@org.jetbrains.annotations.Nullable()
    com.positron.migrationtimes.models.Fields p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getJobTypes() {
        return null;
    }
    
    public final void setJobTypes(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getJetpackPublicizeConnections() {
        return null;
    }
    
    public final void setJetpackPublicizeConnections(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJetPackShortLink() {
        return null;
    }
    
    public final void setJetPackShortLink(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Links getLinks() {
        return null;
    }
    
    public final void setLinks(@org.jetbrains.annotations.Nullable()
    com.positron.migrationtimes.models.Links p0) {
    }
    
    public Job(@com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "date")
    java.lang.String date, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "date_gmt")
    java.lang.String dateGmt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "guid")
    com.positron.migrationtimes.models.Guid guid, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "modified")
    java.lang.String modified, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "modified_gmt")
    java.lang.String modifiedGmt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "slug")
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    com.positron.migrationtimes.models.Title title, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "content")
    com.positron.migrationtimes.models.Content content, @com.squareup.moshi.Json(name = "featured_media")
    int featuredMedia, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "template")
    java.lang.String template, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "meta")
    com.positron.migrationtimes.models.Fields fields, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "job-types")
    java.util.List<java.lang.Integer> jobTypes, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "jetpack_publicize_connections")
    java.util.List<? extends java.lang.Object> jetpackPublicizeConnections, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "jetpack_shortlink")
    java.lang.String jetPackShortLink, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "links")
    com.positron.migrationtimes.models.Links links) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Guid component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Title component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Content component12() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Fields component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Links component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.positron.migrationtimes.models.Job copy(@com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "date")
    java.lang.String date, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "date_gmt")
    java.lang.String dateGmt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "guid")
    com.positron.migrationtimes.models.Guid guid, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "modified")
    java.lang.String modified, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "modified_gmt")
    java.lang.String modifiedGmt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "slug")
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    com.positron.migrationtimes.models.Title title, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "content")
    com.positron.migrationtimes.models.Content content, @com.squareup.moshi.Json(name = "featured_media")
    int featuredMedia, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "template")
    java.lang.String template, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "meta")
    com.positron.migrationtimes.models.Fields fields, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "job-types")
    java.util.List<java.lang.Integer> jobTypes, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "jetpack_publicize_connections")
    java.util.List<? extends java.lang.Object> jetpackPublicizeConnections, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "jetpack_shortlink")
    java.lang.String jetPackShortLink, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "links")
    com.positron.migrationtimes.models.Links links) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}