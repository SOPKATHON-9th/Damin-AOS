package sopt.haeti.damin_aos.presentation.situation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import sopt.haeti.damin_aos.databinding.ItemHomeBinding
import sopt.haeti.damin_aos.databinding.ItemSituationInBinding
import sopt.haeti.damin_aos.presentation.home.HomeModel
import sopt.haeti.damin_aos.presentation.situation.SituationInActivity
import sopt.haeti.damin_aos.presentation.situation.SituationWhereActivity

class SituationWhereHolder(
    private val binding: ItemSituationInBinding
) : RecyclerView.ViewHolder(binding.root) {

    @SuppressLint("UseCompatLoadingForDrawables")
    fun bind(data: HomeModel) {
        with(binding) {
            ivSelect.setImageDrawable(binding.root.context.getDrawable(data.img))
            tvSelect.text = data.title
            binding.root.setOnClickListener {
                binding.root.context.startActivity(Intent(binding.root.context,SituationInActivity::class.java))
            }
        }
    }
}