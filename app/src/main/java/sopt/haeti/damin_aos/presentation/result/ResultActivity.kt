package sopt.haeti.damin_aos.presentation.result

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.tabs.TabLayout
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ActivityResultBinding
import sopt.haeti.damin_aos.presentation.home.HomeActivity
import sopt.haeti.damin_aos.presentation.mypage.MypageActivity
import sopt.haeti.damin_aos.util.base.BindingActivity

class ResultActivity : BindingActivity<ActivityResultBinding>(R.layout.activity_result) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initTabSelectedListener()
        initNavigationButtons()
    }

    private fun initNavigationButtons() {
        binding.btnMypage.setOnClickListener {
            Intent(this, MypageActivity::class.java).apply {
                startActivity(this)
            }
        }

        binding.btnHome.setOnClickListener {
            Intent(this, HomeActivity::class.java).apply {
                startActivity(this)
            }
        }
    }

    private fun initTabSelectedListener() {
        binding.tabResult.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> navigateTo<MyResultFragment>()
                    1 -> navigateTo<ActionRulesFragment>()
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {}

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
        })
    }

    private inline fun <reified T : Fragment> navigateTo() {
        supportFragmentManager.commit {
            replace<T>(R.id.fcv_result, T::class.simpleName)
        }
    }
}