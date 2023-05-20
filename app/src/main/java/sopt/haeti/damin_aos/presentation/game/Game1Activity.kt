package sopt.haeti.damin_aos.presentation.game

import android.os.Bundle
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ActivityGame1Binding
import sopt.haeti.damin_aos.util.base.BindingActivity

class Game1Activity : BindingActivity<ActivityGame1Binding>(R.layout.activity_game_1) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}