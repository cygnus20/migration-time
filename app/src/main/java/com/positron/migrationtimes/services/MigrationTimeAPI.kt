package com.positron.migrationtimes.services

import com.positron.migrationtimes.models.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MigrationTimeAPI {
    @GET("posts")
    fun getPosts(@Query("page") page: Int = 1): Call<List<Post>>

    @GET("posts/{id}")
    suspend fun getPostById(@Path("id") id: String): Response<Post>

    @GET("posts")
    suspend fun getPostBySlug(@Query("slug") slug: String): Response<List<Post>>

    @GET("posts?categories=17")
    fun getImmigrations(@Query("page") page: Int = 1): Call<List<Immigration>>

    @GET("posts?categories=15")
    fun getVisas(@Query("page") page: Int = 1): Call<List<Visa>>

    @GET("posts?categories=16")
    fun getStudies(@Query("page") page: Int = 1): Call<List<Study>>

    @GET("job-listings")
    fun getJobs(@Query("page") page: Int = 1): Call<List<Job>>

    @GET("job-listings")
    suspend fun getJobBySlug(@Query("slug") slug: String): Response<List<Job>>

    @GET("posts?categories=21")
    fun getWorks(@Query("page") page: Int = 1) : Call<List<Work>>

    //fun getScholarship(@Query("page") page: Int = 1): Call<ArrayList<Scholarship>>
}