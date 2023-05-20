package sopt.haeti.damin_aos.server

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import sopt.haeti.damin_aos.data.remote.request.SituationResultRequestDto
import sopt.haeti.damin_aos.data.remote.response.SituationResultResponseDto

interface ResultService {
    @GET("/situation/result")
    fun getSituationResult(
        @Body request: SituationResultRequestDto
    ): Call<SituationResultResponseDto>


}