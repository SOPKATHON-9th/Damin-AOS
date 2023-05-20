package sopt.haeti.damin_aos.presentation.situation

import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ActivitySituationInBinding
import sopt.haeti.damin_aos.util.base.BindingActivity

class SituationInActivity :
    BindingActivity<ActivitySituationInBinding>(R.layout.activity_situation_in) {
    private lateinit var adapter: SituationInRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*val layoutManager = GridLayoutManager(this, spanCount)
        binding.rvSituationIn.layoutManager = layoutManager

        adapter = SituationInRecyclerAdapter(this) { clickedItem ->

        }

        binding.rvSituationIn.adapter = adapter

        val modelList = listOf(
            SituationInModel("ic_inplatform", "역사 내"),
            SituationInModel("ic_platfrom", "플랫폼"),
            SituationInModel("ic_insubway", "열차 내"),
            SituationInModel("ic_elevator", "엘리베이터"),
        )
        adapter.submitList(modelList)*/
    }

}