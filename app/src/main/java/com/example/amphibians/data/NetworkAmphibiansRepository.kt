package com.example.amphibians.data

import com.example.amphibians.network.ApiService
import com.example.amphibians.models.Amphibian

interface AmphibiansRepository {
    suspend fun getAmphibians(): List<Amphibian>
}

class NetworkAmphibiansRepository(
    private val apiService: ApiService
): AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> {
        return apiService.getAmphibians()
    }

}