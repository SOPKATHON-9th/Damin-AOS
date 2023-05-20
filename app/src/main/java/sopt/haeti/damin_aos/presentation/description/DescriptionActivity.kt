package sopt.haeti.damin_aos.presentation.description

import android.content.Intent
import android.os.Bundle
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ActivityDescriptionBinding
import sopt.haeti.damin_aos.presentation.game.Game1Activity
import sopt.haeti.damin_aos.presentation.home.HomeActivity
import sopt.haeti.damin_aos.presentation.mypage.MypageActivity
import sopt.haeti.damin_aos.util.base.BindingActivity

class DescriptionActivity :
    BindingActivity<ActivityDescriptionBinding>(R.layout.activity_description) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.btnHome.setOnClickListener() {
            intent = Intent(this@DescriptionActivity, HomeActivity::class.java)
            finish()
            startActivity(intent)
        }
        binding.btnStart.setOnClickListener() {
            intent = Intent(this@DescriptionActivity, Game1Activity::class.java)
            finish()
            startActivity(intent)
        }
        binding.btnUser.setOnClickListener() {
            intent = Intent(this@DescriptionActivity, MypageActivity::class.java)
            finish()
            startActivity(intent)
        }
    }
}