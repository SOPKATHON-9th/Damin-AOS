package sopt.haeti.damin_aos.server

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import sopt.haeti.damin_aos.BuildConfig

object ApiFactory {
    private val client by lazy {
        OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }).build()
    }

    @OptIn(ExperimentalSerializationApi::class)
    val retrofit: Retrofit by lazy {
        Retrofit.Builder().baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
            .client(client)
            .build()
    }

    inline fun <reified T> create(): T = retrofit.create(T::class.java)
}

object ServicePool {
    val resultService = ApiFactory.create<ResultService>()
    val missionProceedService = ApiFactory.create<MissionProceedService>()
}
