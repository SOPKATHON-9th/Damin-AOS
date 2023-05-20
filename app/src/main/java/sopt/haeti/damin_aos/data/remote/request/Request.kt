package sopt.haeti.damin_aos.data.remote.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ReqSituationResult(
    @SerialName("surviveState")
    val surviveState: String,
    @SerialName("situationWhat")
    val situationWhat: String,
    @SerialName("situationWhere")
    val situationWhere: String,
    @SerialName("situationIn")
    val situationIn: String
)