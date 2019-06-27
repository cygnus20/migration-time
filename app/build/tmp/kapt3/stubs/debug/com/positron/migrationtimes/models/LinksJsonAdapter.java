package com.positron.migrationtimes.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\'\u001a\u00020(H\u0016R\u001e\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/positron/migrationtimes/models/LinksJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/positron/migrationtimes/models/Links;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableListOfNullableAboutAdapter", "", "Lcom/positron/migrationtimes/models/About;", "nullableListOfNullableAuthorAdapter", "Lcom/positron/migrationtimes/models/Author;", "nullableListOfNullableCollectionAdapter", "Lcom/positron/migrationtimes/models/Collection;", "nullableListOfNullableCuryAdapter", "Lcom/positron/migrationtimes/models/Cury;", "nullableListOfNullablePredecessorVersionAdapter", "Lcom/positron/migrationtimes/models/PredecessorVersion;", "nullableListOfNullableReplyAdapter", "Lcom/positron/migrationtimes/models/Reply;", "nullableListOfNullableSelfAdapter", "Lcom/positron/migrationtimes/models/Self;", "nullableListOfNullableVersionHistoryAdapter", "Lcom/positron/migrationtimes/models/VersionHistory;", "nullableListOfNullableWpAttachmentAdapter", "Lcom/positron/migrationtimes/models/WpAttachment;", "nullableListOfNullableWpFeaturedMediaAdapter", "Lcom/positron/migrationtimes/models/WpFeaturedMedia;", "nullableListOfNullableWpTermAdapter", "Lcom/positron/migrationtimes/models/WpTerm;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "app_debug"})
public final class LinksJsonAdapter extends com.squareup.moshi.JsonAdapter<com.positron.migrationtimes.models.Links> {
    private final com.squareup.moshi.JsonReader.Options options = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.positron.migrationtimes.models.Self>> nullableListOfNullableSelfAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.positron.migrationtimes.models.Collection>> nullableListOfNullableCollectionAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.positron.migrationtimes.models.About>> nullableListOfNullableAboutAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.positron.migrationtimes.models.Author>> nullableListOfNullableAuthorAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.positron.migrationtimes.models.Reply>> nullableListOfNullableReplyAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.positron.migrationtimes.models.VersionHistory>> nullableListOfNullableVersionHistoryAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.positron.migrationtimes.models.PredecessorVersion>> nullableListOfNullablePredecessorVersionAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.positron.migrationtimes.models.WpFeaturedMedia>> nullableListOfNullableWpFeaturedMediaAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.positron.migrationtimes.models.WpAttachment>> nullableListOfNullableWpAttachmentAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.positron.migrationtimes.models.WpTerm>> nullableListOfNullableWpTermAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.positron.migrationtimes.models.Cury>> nullableListOfNullableCuryAdapter = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.positron.migrationtimes.models.Links fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    com.positron.migrationtimes.models.Links value) {
    }
    
    public LinksJsonAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
}