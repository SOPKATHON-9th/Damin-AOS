package sopt.haeti.damin_aos.server

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import sopt.haeti.damin_aos.data.remote.request.RequestSituationResult
import sopt.haeti.damin_aos.data.remote.response.ResponseSituationResult

interface ResultService {
    @GET("/situation/result")
    fun getSituationResult(
        @Body request: RequestSituationResult
    ): Call<ResponseSituationResult>


}