package sopt.haeti.damin_aos.server

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
import sopt.haeti.damin_aos.data.remote.ExampleDto

interface MockService {
    @GET("/v2/search/web")
    fun getSearchWeb(
        @Header("Authorization") key: String = "KakaoAK ",
        @Query("query") keyword: String
    ): Call<ExampleDto>
}