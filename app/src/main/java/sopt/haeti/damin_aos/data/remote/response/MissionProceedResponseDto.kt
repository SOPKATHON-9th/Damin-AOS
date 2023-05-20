package sopt.haeti.damin_aos.data.remote.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MissionProceedResponseDto(
    @SerialName("status")
    val status: Int,
    @SerialName("message")
    val message: String,
)