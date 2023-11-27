package com.example.kursovaya.interfaces


import com.example.kursovaya.model.ApiResponse
import com.example.kursovaya.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface ApiInterface {
    @Headers("Content-Type:application/json")
    @GET("/users")
    fun getAllUsers(): Call<ApiResponse<User>>
}