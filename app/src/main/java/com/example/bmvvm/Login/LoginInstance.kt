package com.example.bmvvm.Login

import com.example.bmvvm.network.ApiLogin
import com.example.bmvvm.network.Constants
import com.example.bmvvm.network.HeardersInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object LoginInstance {
    // retrofit instance object class
    private val retrofit by lazy {
        Retrofit.Builder()
            .client(getClientes())
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun getClientes(): OkHttpClient {
        val cliente = OkHttpClient.Builder()
            .addInterceptor(HeardersInterceptor())
            .build()
        return cliente
    }

    val apiLog: ApiLogin by lazy {
        retrofit.create(ApiLogin::class.java)
    }
}