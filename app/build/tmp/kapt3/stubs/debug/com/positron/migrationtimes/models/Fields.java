package com.positron.migrationtimes.models;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\fH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\fH\u00c6\u0003J\u0089\u0001\u00105\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u00106\u001a\u00020\fH\u00d6\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u00d6\u0003J\t\u0010;\u001a\u00020\fH\u00d6\u0001J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\fH\u00d6\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b\'\u0010\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013\u00a8\u0006B"}, d2 = {"Lcom/positron/migrationtimes/models/Fields;", "Landroid/os/Parcelable;", "spayEmail", "", "jobLocation", "application", "companyName", "companyWebsite", "companyTagline", "companyTwitter", "companyVideo", "filled", "", "featured", "jetPackPublicizeMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getApplication", "()Ljava/lang/String;", "setApplication", "(Ljava/lang/String;)V", "getCompanyName", "setCompanyName", "getCompanyTagline", "setCompanyTagline", "getCompanyTwitter", "setCompanyTwitter", "getCompanyVideo", "setCompanyVideo", "getCompanyWebsite", "setCompanyWebsite", "getFeatured", "()I", "setFeatured", "(I)V", "getFilled", "setFilled", "getJetPackPublicizeMessage", "setJetPackPublicizeMessage", "getJobLocation", "setJobLocation", "getSpayEmail", "setSpayEmail", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Fields implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String spayEmail;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String jobLocation;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String application;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String companyName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String companyWebsite;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String companyTagline;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String companyTwitter;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String companyVideo;
    private int filled;
    private int featured;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String jetPackPublicizeMessage;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSpayEmail() {
        return null;
    }
    
    public final void setSpayEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJobLocation() {
        return null;
    }
    
    public final void setJobLocation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompanyName() {
        return null;
    }
    
    public final void setCompanyName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompanyWebsite() {
        return null;
    }
    
    public final void setCompanyWebsite(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompanyTagline() {
        return null;
    }
    
    public final void setCompanyTagline(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompanyTwitter() {
        return null;
    }
    
    public final void setCompanyTwitter(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompanyVideo() {
        return null;
    }
    
    public final void setCompanyVideo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getFilled() {
        return 0;
    }
    
    public final void setFilled(int p0) {
    }
    
    public final int getFeatured() {
        return 0;
    }
    
    public final void setFeatured(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJetPackPublicizeMessage() {
        return null;
    }
    
    public final void setJetPackPublicizeMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public Fields(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "spay_email")
    java.lang.String spayEmail, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_job_location")
    java.lang.String jobLocation, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_application")
    java.lang.String application, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_company_name")
    java.lang.String companyName, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_company_website")
    java.lang.String companyWebsite, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_company_tagline")
    java.lang.String companyTagline, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_company_twitter")
    java.lang.String companyTwitter, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_company_video")
    java.lang.String companyVideo, @com.squareup.moshi.Json(name = "_filled")
    int filled, @com.squareup.moshi.Json(name = "_featured")
    int featured, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "jetpack_publicize_message")
    java.lang.String jetPackPublicizeMessage) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
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
    public final java.lang.String component4() {
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
    
    public final int component9() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.positron.migrationtimes.models.Fields copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "spay_email")
    java.lang.String spayEmail, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_job_location")
    java.lang.String jobLocation, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_application")
    java.lang.String application, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_company_name")
    java.lang.String companyName, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_company_website")
    java.lang.String companyWebsite, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_company_tagline")
    java.lang.String companyTagline, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_company_twitter")
    java.lang.String companyTwitter, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "_company_video")
    java.lang.String companyVideo, @com.squareup.moshi.Json(name = "_filled")
    int filled, @com.squareup.moshi.Json(name = "_featured")
    int featured, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "jetpack_publicize_message")
    java.lang.String jetPackPublicizeMessage) {
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