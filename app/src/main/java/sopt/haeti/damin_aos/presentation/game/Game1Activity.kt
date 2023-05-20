package sopt.haeti.damin_aos.presentation.game

import android.os.Bundle
import androidx.activity.viewModels
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ActivityGame1Binding
import sopt.haeti.damin_aos.presentation.home.HomeActivity
import sopt.haeti.damin_aos.util.base.BindingActivity
import sopt.haeti.damin_aos.util.extension.startActivity

class Game1Activity : BindingActivity<ActivityGame1Binding>(R.layout.activity_game_1) {

    private val viewModel by viewModels<GameViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        navigateToHome()
        addSurviveRateBySelection()
    }

    private fun navigateToHome() {
        binding.ivBack.setOnClickListener {
            startActivity<HomeActivity>()
            if (!isFinishing) finish()
            viewModel.surviveRate = 0
        }
    }

    private fun navigateToGame2() {
        startActivity<Game2Activity>()
        if (!isFinishing) finish()
    }

    private fun addSurviveRateBySelection() {
        with(binding) {
            tvSurviveQuestion1.setOnClickListener {
                viewModel.surviveRate += 11
                navigateToGame2()
            }

            tvSurviveQuestion2.setOnClickListener {
                viewModel.surviveRate += 22
                navigateToGame2()
            }

            tvSurviveQuestion3.setOnClickListener {
                viewModel.surviveRate += 33
                navigateToGame2()
            }

        }

    }
}