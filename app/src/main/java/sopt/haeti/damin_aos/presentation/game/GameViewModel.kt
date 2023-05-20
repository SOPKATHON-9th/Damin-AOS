package sopt.haeti.damin_aos.presentation.game

import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    var surviveRate = SurviveRate.surviveRate

    fun setSurviveState() {
        when (SurviveRate.surviveRate) {
            in 0..33 -> {
                SurviveRate.surviveState = "FAIL"
            }
            in 34..66 -> {
                SurviveRate.surviveState = "WARNING"
            }
            else -> {
                SurviveRate.surviveState = "SAFE"
            }
        }
    }

}

object SurviveRate {
    var surviveRate = 0
    var surviveState = ""
}