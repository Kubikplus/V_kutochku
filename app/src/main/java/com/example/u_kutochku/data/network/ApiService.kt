package com.example.u_kutochku.data.network

import com.example.u_kutochku.data.models.Animes
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/shows")
    suspend fun getAllAnimes():Response<List<Animes>>

}