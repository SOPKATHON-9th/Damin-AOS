package sopt.haeti.damin_aos.data.remote.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResSituationResult(
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