package sopt.haeti.damin_aos.server

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

object ApiModule {
    private val client by lazy {
        OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }).build()
    }

    val retrofitForKakao: Retrofit by lazy {
        Retrofit.Builder().baseUrl("KAKAO_BASE_URL").client(client)
            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
            .build()
    }

    inline fun <reified T> createKakaoService(): T = retrofitForKakao.create<T>(T::class.java)

}

object ServicePool {
//    val kakaoSearchService = ApiFactory.createKakaoService<KaKaoService>()
}