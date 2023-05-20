package sopt.haeti.damin_aos.presentation.game

import android.os.Bundle
import androidx.activity.viewModels
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ActivityGame2Binding
import sopt.haeti.damin_aos.presentation.home.HomeActivity
import sopt.haeti.damin_aos.util.base.BindingActivity
import sopt.haeti.damin_aos.util.extension.startActivity

class Game2Activity : BindingActivity<ActivityGame2Binding>(R.layout.activity_game_2) {
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

    private fun navigateToGame3() {
        startActivity<Game3Activity>()
        if (!isFinishing) finish()
    }

    private fun addSurviveRateBySelection() {
        with(binding) {
            tvSurviveQuestion1.setOnClickListener {
                viewModel.surviveRate += 8
                navigateToGame3()
            }

            tvSurviveQuestion2.setOnClickListener {
                viewModel.surviveRate += 33
                navigateToGame3()
            }

            tvSurviveQuestion3.setOnClickListener {
                viewModel.surviveRate += 5
                navigateToGame3()
            }

        }

    }
}