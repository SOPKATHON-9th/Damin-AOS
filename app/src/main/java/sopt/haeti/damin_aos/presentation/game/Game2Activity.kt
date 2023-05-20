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

        binding.viewModel = viewModel
        binding.lifecycleOwner

        navigateToHome()
        addSurviveRateBySelection()
    }

    private fun navigateToHome() {
        binding.ivBack.setOnClickListener {
            startActivity<HomeActivity>()
            if (!isFinishing) finish()
            SurviveRate.surviveRate = 0
        }
    }

    private fun navigateToGame3() {
        startActivity<Game3Activity>()
        if (!isFinishing) finish()
    }

    private fun addSurviveRateBySelection() {

        binding.tvSurviveQuestion1.setOnClickListener {
            SurviveRate.surviveRate += 8
            navigateToGame3()
        }

        binding.tvSurviveQuestion2.setOnClickListener {
            SurviveRate.surviveRate += 33
            navigateToGame3()
        }

        binding.tvSurviveQuestion3.setOnClickListener {
            SurviveRate.surviveRate += 5
            navigateToGame3()
        }


    }
}