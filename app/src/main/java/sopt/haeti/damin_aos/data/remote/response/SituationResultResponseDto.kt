package sopt.haeti.damin_aos.data.remote.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
<<<<<<< develop:app/src/main/java/sopt/haeti/damin_aos/data/remote/response/Response.kt
data class ResponseSituationResult(
=======
data class SituationResultResponseDto(
>>>>>>> 서버 연결부분 수정 & 추가:app/src/main/java/sopt/haeti/damin_aos/data/remote/response/SituationResultResponseDto.kt
    @SerialName("status")
    val status: Int,
    @SerialName("message")
    val message: String,
    @SerialName("data")
    val data: SituationResult,
){
    @Serializable
    data class SituationResult(
        @SerialName("result")
        val result: String
    )
}