package sopt.haeti.damin_aos.presentation.mypage

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ActivityMypageBinding
import sopt.haeti.damin_aos.presentation.home.HomeActivity
import sopt.haeti.damin_aos.util.base.BindingActivity

class MypageActivity : BindingActivity<ActivityMypageBinding>(R.layout.activity_mypage) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        val viewModel by viewModels<MyPageViewModel>()
        binding.rvCharacters.layoutManager = GridLayoutManager(this, 2)
        binding.rvCharacters.run {
            adapter = MyPageAdapter(viewModel.mockCharacterList)
        }
        binding.btnHome.setOnClickListener() {
            val intent = Intent(this@MypageActivity, HomeActivity::class.java)
            finish()
            startActivity(intent)
        }
    }

}