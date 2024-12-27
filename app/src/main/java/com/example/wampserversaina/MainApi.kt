package com.example.wampserversaina

import retrofit2.http.GET

interface MainApi {
    @GET("get_all_items.php")
    suspend fun getAllUsers(): List<User>
}