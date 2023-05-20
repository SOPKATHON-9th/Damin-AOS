package sopt.haeti.damin_aos.server

import retrofit2.Callback
import retrofit2.http.Body
import retrofit2.http.PATCH
import sopt.haeti.damin_aos.data.remote.request.MissionProceedRequestDto
import sopt.haeti.damin_aos.data.remote.response.MissionProceedResponseDto

interface MissionProceedService {
    @PATCH("/situation/proceeded")
    fun patchMissionProceed(@Body request: MissionProceedRequestDto)
            : Callback<MissionProceedResponseDto>

}