package com.magician.retrofitmvvm.Repository

import com.magician.retrofitmvvm.api.RetrofitInstance
import com.magician.retrofitmvvm.model.Post

class Repository {
    suspend fun getPost(): Post {
        return RetrofitInstance.api.getPost()
    }
}