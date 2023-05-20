package sopt.haeti.damin_aos.presentation.home

import android.content.Intent
import android.os.Bundle
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ActivityHomeBinding
import sopt.haeti.damin_aos.presentation.mypage.MypageActivity
import sopt.haeti.damin_aos.util.base.BindingActivity

class HomeActivity : BindingActivity<ActivityHomeBinding>(R.layout.activity_home) {

    val modelList = listOf(
        HomeModel(R.drawable.ic_fire, "화재"),
        HomeModel(R.drawable.ic_earthquake, "지진"),
        HomeModel(R.drawable.ic_virus, "좀비"),
        HomeModel(R.drawable.ic_raining, "폭우"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adaptor = HomeRecyclerAdapter(this)
        binding.rvHome.adapter = adaptor
        adaptor.submitList(modelList)


        binding.ivUser.setOnClickListener() {
            intent = Intent(this@HomeActivity, MypageActivity::class.java)
            finish()
            startActivity(intent)
        }

    }


}