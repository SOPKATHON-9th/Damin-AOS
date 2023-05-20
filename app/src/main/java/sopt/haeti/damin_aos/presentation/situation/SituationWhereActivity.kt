package sopt.haeti.damin_aos.presentation.situation

import android.content.Intent
import android.os.Bundle
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ActivityHomeBinding
import sopt.haeti.damin_aos.presentation.home.HomeActivity
import sopt.haeti.damin_aos.presentation.home.HomeModel
import sopt.haeti.damin_aos.presentation.home.HomeRecyclerAdapter
import sopt.haeti.damin_aos.presentation.mypage.MypageActivity
import sopt.haeti.damin_aos.util.base.BindingActivity

class SituationWhereActivity:BindingActivity<ActivityHomeBinding>(R.layout.activity_home) {

    val modelList = listOf(
        HomeModel(R.drawable.ic_home, "집"),
        HomeModel(R.drawable.ic_school, "학교"),
        HomeModel(R.drawable.ic_car, "자동차"),
        HomeModel(R.drawable.ic_metro, "지하철역"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adaptor = SituationWhereAdapter(this)
        binding.rvHome.adapter = adaptor
        adaptor.submitList(modelList)

        binding.ivUser.setOnClickListener() {
            intent = Intent(this@SituationWhereActivity, MypageActivity::class.java)
            finish()
            startActivity(intent)
        }

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            })
        }
    }
}