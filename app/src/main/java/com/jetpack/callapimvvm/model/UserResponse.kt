package com.jetpack.callapimvvm.model

import Retrofit.Address
import Retrofit.Company

data class UserResponse(
    val address: Address,
    val company: Company,
    val email: String,
    val id: Int,
    val name: String,
    val phone: String,
    val username: String,
    val website: String
)
