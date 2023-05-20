package sopt.haeti.damin_aos.presentation

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ActivitySplashBinding
import sopt.haeti.damin_aos.presentation.home.MainActivity
import sopt.haeti.damin_aos.util.base.BindingActivity
import sopt.haeti.damin_aos.util.extension.startActivity

class SplashActivity : BindingActivity<ActivitySplashBinding>(R.layout.activity_splash) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycleScope.launch {
            delay(2000)
            startActivity<MainActivity>()
            overridePendingTransition(0, 0)
            finish()
        }
    }
}