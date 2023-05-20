package sopt.haeti.damin_aos.data.remote.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
<<<<<<< develop:app/src/main/java/sopt/haeti/damin_aos/data/remote/request/Request.kt
data class RequestSituationResult(
=======
data class SituationResultRequestDto(
>>>>>>> 서버 연결부분 수정 & 추가:app/src/main/java/sopt/haeti/damin_aos/data/remote/request/SituationResultRequestDto.kt
    @SerialName("surviveState")
    val surviveState: String,
    @SerialName("situationWhat")
    val situationWhat: String,
    @SerialName("situationWhere")
    val situationWhere: String,
    @SerialName("situationIn")
    val situationIn: String
)