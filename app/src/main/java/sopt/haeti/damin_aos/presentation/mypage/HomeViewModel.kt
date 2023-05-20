package sopt.haeti.damin_aos.presentation.mypage

import androidx.lifecycle.ViewModel
import sopt.haeti.damin_aos.R

class MyPageViewModel : ViewModel() {
    val mockCharacterList = listOf<MypageData>(
        MypageData(R.drawable.ic_fire, "화재"),
        MypageData(R.drawable.ic_earthquake, "지진"),
        MypageData(R.drawable.ic_virus, "좀비"),
        MypageData(R.drawable.ic_raining, "폭우"),
        MypageData(R.drawable.ic_earthquake, "지진"),
        MypageData(R.drawable.ic_fire, "화재")
    )
}