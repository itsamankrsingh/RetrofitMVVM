package com.magician.retrofitmvvm.api

import com.magician.retrofitmvvm.model.Post
import retrofit2.http.GET

interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost(): Post
}