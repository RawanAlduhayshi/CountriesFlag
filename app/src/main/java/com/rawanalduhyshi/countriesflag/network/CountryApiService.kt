package com.rawanalduhyshi.countriesflag.network

import com.rawanalduhyshi.countriesflag.Response
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
private const val BASE_URL =
    "https://countriesnow.space"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()
// this is Retrofit builder to build and create a Retrofit object.
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()
interface CountryApiService {
    @GET("/api/v0.1/countries/flag/images")
suspend fun getPhotos(): Response
}

object CountryApi {
    val retrofitService : CountryApiService by lazy {
        retrofit.create(CountryApiService::class.java) }
}