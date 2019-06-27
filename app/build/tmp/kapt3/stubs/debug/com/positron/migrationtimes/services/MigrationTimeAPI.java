package com.positron.migrationtimes.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\'J\'\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\'J!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\b\b\u0001\u0010\u0011\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/positron/migrationtimes/services/MigrationTimeAPI;", "", "getImmigrations", "Lretrofit2/Call;", "", "Lcom/positron/migrationtimes/models/Immigration;", "page", "", "getJobBySlug", "Lretrofit2/Response;", "Lcom/positron/migrationtimes/models/Job;", "slug", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getJobs", "getPostById", "Lcom/positron/migrationtimes/models/Post;", "id", "getPostBySlug", "getPosts", "getStudies", "Lcom/positron/migrationtimes/models/Study;", "getVisas", "Lcom/positron/migrationtimes/models/Visa;", "getWorks", "Lcom/positron/migrationtimes/models/Work;", "app_debug"})
public abstract interface MigrationTimeAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "posts")
    public abstract retrofit2.Call<java.util.List<com.positron.migrationtimes.models.Post>> getPosts(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "posts/{id}")
    public abstract java.lang.Object getPostById(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.positron.migrationtimes.models.Post>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "posts")
    public abstract java.lang.Object getPostBySlug(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "slug")
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.positron.migrationtimes.models.Post>>> p1);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "posts?categories=17")
    public abstract retrofit2.Call<java.util.List<com.positron.migrationtimes.models.Immigration>> getImmigrations(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "posts?categories=15")
    public abstract retrofit2.Call<java.util.List<com.positron.migrationtimes.models.Visa>> getVisas(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "posts?categories=16")
    public abstract retrofit2.Call<java.util.List<com.positron.migrationtimes.models.Study>> getStudies(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "job-listings")
    public abstract retrofit2.Call<java.util.List<com.positron.migrationtimes.models.Job>> getJobs(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "job-listings")
    public abstract java.lang.Object getJobBySlug(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "slug")
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.positron.migrationtimes.models.Job>>> p1);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "posts?categories=21")
    public abstract retrofit2.Call<java.util.List<com.positron.migrationtimes.models.Work>> getWorks(@retrofit2.http.Query(value = "page")
    int page);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}