package sopt.haeti.damin_aos.data.remote.request

@kotlinx.serialization.Serializable
data class MissionProceedRequestDto(
    val situationIn: String,
    val situationWhat: String,
    val situationWhere: String,
    val userId: Int
)