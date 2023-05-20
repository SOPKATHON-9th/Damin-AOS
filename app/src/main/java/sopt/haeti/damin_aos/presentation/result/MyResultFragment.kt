package sopt.haeti.damin_aos.presentation.result

import android.os.Bundle
import android.view.View
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.data.remote.request.SituationResultRequestDto
import sopt.haeti.damin_aos.data.remote.response.SituationResultResponseDto
import sopt.haeti.damin_aos.databinding.FragmentMyResultBinding
import sopt.haeti.damin_aos.server.ServicePool
import sopt.haeti.damin_aos.util.base.BindingFragment

class MyResultFragment : BindingFragment<FragmentMyResultBinding>(R.layout.fragment_my_result) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //getSituationResult()
    }

    private fun getSituationResult() {
        val mockRequest = SituationResultRequestDto(
            "SAFE",
            "STORM",
            "SUBWAY",
            "IN_SUBWAY"
        )

        ServicePool.resultService.getSituationResult(mockRequest)
            .enqueue(object : Callback<SituationResultResponseDto> {
                override fun onResponse(
                    call: Call<SituationResultResponseDto>,
                    response: Response<SituationResultResponseDto>
                ) {
                    if(response.isSuccessful){
//                        binding.tvResult.text = response.body()?.data?.result
                    }
                }

                override fun onFailure(call: Call<SituationResultResponseDto>, t: Throwable) {

                }
            })
    }
}