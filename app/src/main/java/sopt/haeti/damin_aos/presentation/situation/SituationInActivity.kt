package sopt.haeti.damin_aos.presentation.situation

import android.content.Intent
import android.os.Bundle
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ActivityHomeBinding
import sopt.haeti.damin_aos.presentation.home.HomeModel
import sopt.haeti.damin_aos.presentation.mypage.MypageActivity
import sopt.haeti.damin_aos.util.base.BindingActivity

class SituationInActivity :
    BindingActivity<ActivityHomeBinding>(R.layout.activity_home) {
    val modelList = listOf(
        HomeModel(R.drawable.ic_inplatform, "역사 내"),
        HomeModel(R.drawable.ic_platform, "플랫폼"),
        HomeModel(R.drawable.ic_insubway, "열차 내"),
        HomeModel(R.drawable.ic_elevator, "엘리베이터"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adaptor = SituationInRecyclerAdapter(this)
        binding.rvHome.adapter = adaptor
        adaptor.submitList(modelList)

        binding.ivUser.setOnClickListener() {
            intent = Intent(this@SituationInActivity, MypageActivity::class.java)
            finish()
            startActivity(intent)
        }
    }
}