package sopt.haeti.damin_aos.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.presentation.home.MainActivity
import sopt.haeti.damin_aos.util.extension.startActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private val splashList = listOf(R.layout.activity_splash_fire, R.layout.activity_splash_raining, R.layout.activity_splash_earthquake, R.layout.activity_splash_virus)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val randomSplashLayout = splashList.random()
        setContentView(randomSplashLayout)

        lifecycleScope.launch {
            delay(2000)
            startActivity<MainActivity>()
            overridePendingTransition(0, 0)
            finish()
        }
    }
}