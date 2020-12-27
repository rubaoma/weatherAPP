package com.example.weatherapp.network

import com.example.weatherapp.models.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Interface que cria os parametros passado na requisição e utilizam a notação @Query
 * @GET = é passado o path chamado após o BASE_URL
 * @Query = Latitude (Pega essa informação do GPS do aparelho)
 * @Query = Longitude (Pega essa informação do GPS do aparelho)
 * @Query = units (Unidade métrica nesse caso irá retornar em graus celsius)
 * @Query = appid (Key unica de uso exclussivo da API)
 * @Query = lang (linguagem de retorno por exemplo portguês do Brasil pt_br)
 * */


interface WeatherService {

    @GET("2.5/weather")
    fun getWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String?,
        @Query("appid") appid: String?,
        @Query("lang") lang: String?
    ) : Call<WeatherResponse>
}