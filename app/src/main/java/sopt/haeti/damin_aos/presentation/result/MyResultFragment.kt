package sopt.haeti.damin_aos.presentation.result

import android.os.Bundle
import android.view.View
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.data.remote.request.ReqSituationResult
import sopt.haeti.damin_aos.data.remote.response.ResSituationResult
import sopt.haeti.damin_aos.databinding.FragmentMyResultBinding
import sopt.haeti.damin_aos.server.ServicePool
import sopt.haeti.damin_aos.util.base.BindingFragment

class MyResultFragment : BindingFragment<FragmentMyResultBinding>(R.layout.fragment_my_result) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getSituationResult()
    }

    private fun getSituationResult() {
        val mockRequest = ReqSituationResult(
            "SAFE",
            "STORM",
            "SUBWAY",
            "IN_SUBWAY"
        )

        ServicePool.apiService.getSituationResult(mockRequest)
            .enqueue(object : Callback<ResSituationResult> {
                override fun onResponse(
                    call: Call<ResSituationResult>,
                    response: Response<ResSituationResult>
                ) {
                    if(response.isSuccessful){
                        binding.tvResult.text = response.body()?.data?.result
                    }
                }

                override fun onFailure(call: Call<ResSituationResult>, t: Throwable) {

                }
            })
    }
}