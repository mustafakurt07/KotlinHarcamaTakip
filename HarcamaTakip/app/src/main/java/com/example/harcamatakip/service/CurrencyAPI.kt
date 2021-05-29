package com.example.harcamatakip.service

import com.example.harcamatakip.model.EURCurrency
import com.example.harcamatakip.model.GBPCurrency
import com.example.harcamatakip.model.USDCurrency
import retrofit2.Call
import retrofit2.http.GET

interface CurrencyAPI {

    @GET("/api/v7/convert?q=USD_TRY&compact=ultra&apiKey=266f7eba261b6b981ad7")
    fun getUSD(): Call<USDCurrency>

    @GET("/api/v7/convert?q=EUR_TRY&compact=ultra&apiKey=266f7eba261b6b981ad7")
    fun getEURO(): Call<EURCurrency>

    @GET("/api/v7/convert?q=GBP_TRY&compact=ultra&apiKey=266f7eba261b6b981ad7")
    fun getGBP(): Call<GBPCurrency>
}