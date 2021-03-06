package com.jetpack.callapimvvm.network

import com.jetpack.callapimvvm.model.UserResponse
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface ApiInterface {

    @GET("users")
    suspend fun getUserData(): List<UserResponse>
}