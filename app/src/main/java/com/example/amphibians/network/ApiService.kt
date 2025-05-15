package com.example.amphibians.network

import com.example.amphibians.models.Amphibian
import retrofit2.http.GET

interface ApiService {
    @GET("amphibians")
    suspend fun getAmphibians(): List<Amphibian>
}