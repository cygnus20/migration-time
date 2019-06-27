package com.positron.migrationtimes.models;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bt\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ed\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0010\b\u0001\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 \u0012\u0017\b\u0001\u0010!\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\"\u00a2\u0006\u0002\b#\u0018\u00010 \u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\u0017\b\u0001\u0010%\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\"\u00a2\u0006\u0002\b#\u0018\u00010 \u0012\b\b\u0001\u0010&\u001a\u00020\u001a\u0012\n\b\u0001\u0010\'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010)\u00a2\u0006\u0002\u0010*J\t\u0010z\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003H\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010lJ\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003J\u0012\u0010\u0088\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 H\u00c6\u0003J\u0019\u0010\u0089\u0001\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\"\u00a2\u0006\u0002\b#\u0018\u00010 H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0019\u0010\u008b\u0001\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\"\u00a2\u0006\u0002\b#\u0018\u00010 H\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u001aH\u00c6\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00f8\u0002\u0010\u0096\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0003\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 2\u0017\b\u0003\u0010!\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\"\u00a2\u0006\u0002\b#\u0018\u00010 2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00052\u0017\b\u0003\u0010%\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\"\u00a2\u0006\u0002\b#\u0018\u00010 2\b\b\u0003\u0010&\u001a\u00020\u001a2\n\b\u0003\u0010\'\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010(\u001a\u0004\u0018\u00010)H\u00c6\u0001\u00a2\u0006\u0003\u0010\u0097\u0001J\n\u0010\u0098\u0001\u001a\u00020\u0003H\u00d6\u0001J\u0015\u0010\u0099\u0001\u001a\u00020\u001a2\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u009c\u0001\u001a\u00020\u0005H\u00d6\u0001J\u001e\u0010\u009d\u0001\u001a\u00030\u009e\u00012\b\u0010\u009f\u0001\u001a\u00030\u00a0\u00012\u0007\u0010\u00a1\u0001\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u00104\"\u0004\bF\u00106R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010,\"\u0004\bL\u0010.R\u001c\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u00104\"\u0004\bN\u00106R\u001c\u0010\'\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u00104\"\u0004\bP\u00106R)\u0010%\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\"\u00a2\u0006\u0002\b#\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u00100\"\u0004\bR\u00102R\u001a\u0010&\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u00104\"\u0004\bX\u00106R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u00104\"\u0004\bb\u00106R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u00104\"\u0004\bd\u00106R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u00104\"\u0004\bf\u00106R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u00104\"\u0004\bh\u00106R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u00104\"\u0004\bj\u00106R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010o\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR)\u0010!\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\"\u00a2\u0006\u0002\b#\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u00100\"\u0004\bq\u00102R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u00104\"\u0004\bs\u00106R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u00104\"\u0004\by\u00106\u00a8\u0006\u00a2\u0001"}, d2 = {"Lcom/positron/migrationtimes/models/Visa;", "Landroid/os/Parcelable;", "id", "", "date", "", "dateGmt", "guid", "Lcom/positron/migrationtimes/models/Guid;", "modified", "modifiedGmt", "slug", "status", "type", "link", "title", "Lcom/positron/migrationtimes/models/Title;", "content", "Lcom/positron/migrationtimes/models/Content;", "excerpt", "Lcom/positron/migrationtimes/models/Excerpt;", "author", "featuredMedia", "commentStatus", "pingStatus", "sticky", "", "template", "format", "meta", "Lcom/positron/migrationtimes/models/Meta;", "categories", "", "tags", "", "Lkotlinx/android/parcel/RawValue;", "jetPackFeaturedMediaUrl", "jetpackPublicizeConnections", "jetpackSharingEnabled", "jetPackShortLink", "links", "Lcom/positron/migrationtimes/models/Links;", "(ILjava/lang/String;Ljava/lang/String;Lcom/positron/migrationtimes/models/Guid;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/positron/migrationtimes/models/Title;Lcom/positron/migrationtimes/models/Content;Lcom/positron/migrationtimes/models/Excerpt;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/positron/migrationtimes/models/Meta;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/positron/migrationtimes/models/Links;)V", "getAuthor", "()I", "setAuthor", "(I)V", "getCategories", "()Ljava/util/List;", "setCategories", "(Ljava/util/List;)V", "getCommentStatus", "()Ljava/lang/String;", "setCommentStatus", "(Ljava/lang/String;)V", "getContent", "()Lcom/positron/migrationtimes/models/Content;", "setContent", "(Lcom/positron/migrationtimes/models/Content;)V", "getDate", "setDate", "getDateGmt", "setDateGmt", "getExcerpt", "()Lcom/positron/migrationtimes/models/Excerpt;", "setExcerpt", "(Lcom/positron/migrationtimes/models/Excerpt;)V", "getFeaturedMedia", "setFeaturedMedia", "getFormat", "setFormat", "getGuid", "()Lcom/positron/migrationtimes/models/Guid;", "setGuid", "(Lcom/positron/migrationtimes/models/Guid;)V", "getId", "setId", "getJetPackFeaturedMediaUrl", "setJetPackFeaturedMediaUrl", "getJetPackShortLink", "setJetPackShortLink", "getJetpackPublicizeConnections", "setJetpackPublicizeConnections", "getJetpackSharingEnabled", "()Z", "setJetpackSharingEnabled", "(Z)V", "getLink", "setLink", "getLinks", "()Lcom/positron/migrationtimes/models/Links;", "setLinks", "(Lcom/positron/migrationtimes/models/Links;)V", "getMeta", "()Lcom/positron/migrationtimes/models/Meta;", "setMeta", "(Lcom/positron/migrationtimes/models/Meta;)V", "getModified", "setModified", "getModifiedGmt", "setModifiedGmt", "getPingStatus", "setPingStatus", "getSlug", "setSlug", "getStatus", "setStatus", "getSticky", "()Ljava/lang/Boolean;", "setSticky", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTags", "setTags", "getTemplate", "setTemplate", "getTitle", "()Lcom/positron/migrationtimes/models/Title;", "setTitle", "(Lcom/positron/migrationtimes/models/Title;)V", "getType", "setType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/positron/migrationtimes/models/Guid;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/positron/migrationtimes/models/Title;Lcom/positron/migrationtimes/models/Content;Lcom/positron/migrationtimes/models/Excerpt;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/positron/migrationtimes/models/Meta;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/positron/migrationtimes/models/Links;)Lcom/positron/migrationtimes/models/Visa;", "describeContents", "equals", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Visa implements android.os.Parcelable {
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
    @org.jetbrains.annotations.Nullable()
    private com.positron.migrationtimes.models.Excerpt excerpt;
    private int author;
    private int featuredMedia;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String commentStatus;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pingStatus;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean sticky;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String template;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String format;
    @org.jetbrains.annotations.Nullable()
    private com.positron.migrationtimes.models.Meta meta;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.Integer> categories;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.lang.Object> tags;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String jetPackFeaturedMediaUrl;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.lang.Object> jetpackPublicizeConnections;
    private boolean jetpackSharingEnabled;
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Excerpt getExcerpt() {
        return null;
    }
    
    public final void setExcerpt(@org.jetbrains.annotations.Nullable()
    com.positron.migrationtimes.models.Excerpt p0) {
    }
    
    public final int getAuthor() {
        return 0;
    }
    
    public final void setAuthor(int p0) {
    }
    
    public final int getFeaturedMedia() {
        return 0;
    }
    
    public final void setFeaturedMedia(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCommentStatus() {
        return null;
    }
    
    public final void setCommentStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPingStatus() {
        return null;
    }
    
    public final void setPingStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSticky() {
        return null;
    }
    
    public final void setSticky(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTemplate() {
        return null;
    }
    
    public final void setTemplate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFormat() {
        return null;
    }
    
    public final void setFormat(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Meta getMeta() {
        return null;
    }
    
    public final void setMeta(@org.jetbrains.annotations.Nullable()
    com.positron.migrationtimes.models.Meta p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getCategories() {
        return null;
    }
    
    public final void setCategories(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getTags() {
        return null;
    }
    
    public final void setTags(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJetPackFeaturedMediaUrl() {
        return null;
    }
    
    public final void setJetPackFeaturedMediaUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getJetpackPublicizeConnections() {
        return null;
    }
    
    public final void setJetpackPublicizeConnections(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    public final boolean getJetpackSharingEnabled() {
        return false;
    }
    
    public final void setJetpackSharingEnabled(boolean p0) {
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
    
    public Visa(@com.squareup.moshi.Json(name = "id")
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
    com.positron.migrationtimes.models.Content content, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "excerpt")
    com.positron.migrationtimes.models.Excerpt excerpt, @com.squareup.moshi.Json(name = "author")
    int author, @com.squareup.moshi.Json(name = "featured_media")
    int featuredMedia, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comment_status")
    java.lang.String commentStatus, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "ping_status")
    java.lang.String pingStatus, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sticky")
    java.lang.Boolean sticky, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "template")
    java.lang.String template, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "format")
    java.lang.String format, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "meta")
    com.positron.migrationtimes.models.Meta meta, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "categories")
    java.util.List<java.lang.Integer> categories, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "tags")
    java.util.List<? extends java.lang.Object> tags, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "jetpack_featured_media_url")
    java.lang.String jetPackFeaturedMediaUrl, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "jetpack_publicize_connections")
    java.util.List<? extends java.lang.Object> jetpackPublicizeConnections, @com.squareup.moshi.Json(name = "jetpack_sharing_enabled")
    boolean jetpackSharingEnabled, @org.jetbrains.annotations.Nullable()
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Excerpt component13() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int component15() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Meta component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component25() {
        return null;
    }
    
    public final boolean component26() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.positron.migrationtimes.models.Links component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.positron.migrationtimes.models.Visa copy(@com.squareup.moshi.Json(name = "id")
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
    com.positron.migrationtimes.models.Content content, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "excerpt")
    com.positron.migrationtimes.models.Excerpt excerpt, @com.squareup.moshi.Json(name = "author")
    int author, @com.squareup.moshi.Json(name = "featured_media")
    int featuredMedia, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comment_status")
    java.lang.String commentStatus, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "ping_status")
    java.lang.String pingStatus, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sticky")
    java.lang.Boolean sticky, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "template")
    java.lang.String template, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "format")
    java.lang.String format, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "meta")
    com.positron.migrationtimes.models.Meta meta, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "categories")
    java.util.List<java.lang.Integer> categories, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "tags")
    java.util.List<? extends java.lang.Object> tags, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "jetpack_featured_media_url")
    java.lang.String jetPackFeaturedMediaUrl, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "jetpack_publicize_connections")
    java.util.List<? extends java.lang.Object> jetpackPublicizeConnections, @com.squareup.moshi.Json(name = "jetpack_sharing_enabled")
    boolean jetpackSharingEnabled, @org.jetbrains.annotations.Nullable()
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