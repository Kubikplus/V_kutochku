package com.example.u_kutochku.data.network

import javax.inject.Inject

class ApiRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getAllAnimes() = apiService.getAllAnimes()

}