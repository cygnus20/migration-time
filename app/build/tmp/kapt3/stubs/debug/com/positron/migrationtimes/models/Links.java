package com.positron.migrationtimes.models;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00d5\u0001\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0003\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0003\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0003\u0012\u0012\b\u0001\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0003\u0012\u0012\b\u0001\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0003\u0012\u0012\b\u0001\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0003\u0012\u0012\b\u0001\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0003\u0012\u0012\b\u0001\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0003\u0012\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0019J\u0013\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0003H\u00c6\u0003J\u0013\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0003H\u00c6\u0003J\u0013\u00105\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003H\u00c6\u0003J\u0013\u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0003H\u00c6\u0003J\u0013\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0003H\u00c6\u0003J\u0013\u00108\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0003H\u00c6\u0003J\u0013\u00109\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010:\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010<\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0003H\u00c6\u0003J\u00e5\u0001\u0010=\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00032\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00032\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u00032\u0012\b\u0003\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u00032\u0012\b\u0003\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00032\u0012\b\u0003\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00032\u0012\b\u0003\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00032\u0012\b\u0003\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00032\u0012\b\u0002\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0003H\u00c6\u0001J\t\u0010>\u001a\u00020?H\u00d6\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH\u00d6\u0003J\t\u0010D\u001a\u00020?H\u00d6\u0001J\t\u0010E\u001a\u00020FH\u00d6\u0001J\u0019\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020?H\u00d6\u0001R$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR$\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR$\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR$\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR$\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b\'\u0010\u001dR$\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR$\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR$\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR$\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR$\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001d\u00a8\u0006L"}, d2 = {"Lcom/positron/migrationtimes/models/Links;", "Landroid/os/Parcelable;", "self", "", "Lcom/positron/migrationtimes/models/Self;", "collection", "Lcom/positron/migrationtimes/models/Collection;", "about", "Lcom/positron/migrationtimes/models/About;", "author", "Lcom/positron/migrationtimes/models/Author;", "replies", "Lcom/positron/migrationtimes/models/Reply;", "versionHistory", "Lcom/positron/migrationtimes/models/VersionHistory;", "predecessorVersion", "Lcom/positron/migrationtimes/models/PredecessorVersion;", "wpFeaturedMedia", "Lcom/positron/migrationtimes/models/WpFeaturedMedia;", "wpAttachment", "Lcom/positron/migrationtimes/models/WpAttachment;", "wpTerm", "Lcom/positron/migrationtimes/models/WpTerm;", "curies", "Lcom/positron/migrationtimes/models/Cury;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAbout", "()Ljava/util/List;", "setAbout", "(Ljava/util/List;)V", "getAuthor", "setAuthor", "getCollection", "setCollection", "getCuries", "setCuries", "getPredecessorVersion", "setPredecessorVersion", "getReplies", "setReplies", "getSelf", "setSelf", "getVersionHistory", "setVersionHistory", "getWpAttachment", "setWpAttachment", "getWpFeaturedMedia", "setWpFeaturedMedia", "getWpTerm", "setWpTerm", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.Json(name = "_links")
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Links implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.positron.migrationtimes.models.Self> self;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.positron.migrationtimes.models.Collection> collection;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.positron.migrationtimes.models.About> about;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.positron.migrationtimes.models.Author> author;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.positron.migrationtimes.models.Reply> replies;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.positron.migrationtimes.models.VersionHistory> versionHistory;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.positron.migrationtimes.models.PredecessorVersion> predecessorVersion;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.positron.migrationtimes.models.WpFeaturedMedia> wpFeaturedMedia;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.positron.migrationtimes.models.WpAttachment> wpAttachment;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.positron.migrationtimes.models.WpTerm> wpTerm;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.positron.migrationtimes.models.Cury> curies;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.Self> getSelf() {
        return null;
    }
    
    public final void setSelf(@org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Self> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.Collection> getCollection() {
        return null;
    }
    
    public final void setCollection(@org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Collection> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.About> getAbout() {
        return null;
    }
    
    public final void setAbout(@org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.About> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.Author> getAuthor() {
        return null;
    }
    
    public final void setAuthor(@org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Author> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.Reply> getReplies() {
        return null;
    }
    
    public final void setReplies(@org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Reply> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.VersionHistory> getVersionHistory() {
        return null;
    }
    
    public final void setVersionHistory(@org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.VersionHistory> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.PredecessorVersion> getPredecessorVersion() {
        return null;
    }
    
    public final void setPredecessorVersion(@org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.PredecessorVersion> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.WpFeaturedMedia> getWpFeaturedMedia() {
        return null;
    }
    
    public final void setWpFeaturedMedia(@org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.WpFeaturedMedia> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.WpAttachment> getWpAttachment() {
        return null;
    }
    
    public final void setWpAttachment(@org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.WpAttachment> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.WpTerm> getWpTerm() {
        return null;
    }
    
    public final void setWpTerm(@org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.WpTerm> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.Cury> getCuries() {
        return null;
    }
    
    public final void setCuries(@org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Cury> p0) {
    }
    
    public Links(@org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Self> self, @org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Collection> collection, @org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.About> about, @org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Author> author, @org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Reply> replies, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "version-history")
    java.util.List<com.positron.migrationtimes.models.VersionHistory> versionHistory, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "predecessor-version")
    java.util.List<com.positron.migrationtimes.models.PredecessorVersion> predecessorVersion, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wp:featured_media")
    java.util.List<com.positron.migrationtimes.models.WpFeaturedMedia> wpFeaturedMedia, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wp:attachment")
    java.util.List<com.positron.migrationtimes.models.WpAttachment> wpAttachment, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wp:term")
    java.util.List<com.positron.migrationtimes.models.WpTerm> wpTerm, @org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Cury> curies) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.Self> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.Collection> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.About> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.Author> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.Reply> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.VersionHistory> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.PredecessorVersion> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.WpFeaturedMedia> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.WpAttachment> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.WpTerm> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.positron.migrationtimes.models.Cury> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.positron.migrationtimes.models.Links copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Self> self, @org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Collection> collection, @org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.About> about, @org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Author> author, @org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Reply> replies, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "version-history")
    java.util.List<com.positron.migrationtimes.models.VersionHistory> versionHistory, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "predecessor-version")
    java.util.List<com.positron.migrationtimes.models.PredecessorVersion> predecessorVersion, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wp:featured_media")
    java.util.List<com.positron.migrationtimes.models.WpFeaturedMedia> wpFeaturedMedia, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wp:attachment")
    java.util.List<com.positron.migrationtimes.models.WpAttachment> wpAttachment, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wp:term")
    java.util.List<com.positron.migrationtimes.models.WpTerm> wpTerm, @org.jetbrains.annotations.Nullable()
    java.util.List<com.positron.migrationtimes.models.Cury> curies) {
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