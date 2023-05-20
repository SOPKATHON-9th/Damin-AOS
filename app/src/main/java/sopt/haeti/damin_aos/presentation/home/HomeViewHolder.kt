package sopt.haeti.damin_aos.presentation.home

import android.annotation.SuppressLint
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import sopt.haeti.damin_aos.databinding.ItemHomeBinding
import sopt.haeti.damin_aos.databinding.ItemSituationInBinding
import sopt.haeti.damin_aos.presentation.situation.SituationInActivity
import sopt.haeti.damin_aos.presentation.situation.SituationWhereActivity

class HomeViewHolder(
    private val binding: ItemHomeBinding
) : RecyclerView.ViewHolder(binding.root) {

    @SuppressLint("UseCompatLoadingForDrawables")
    fun bind(data: HomeModel) {
        with(binding) {
            ivSelect.setImageDrawable(binding.root.context.getDrawable(data.img))
            tvSelect.text = data.title
            binding.root.setOnClickListener {
                binding.root.context.startActivity(Intent(binding.root.context,SituationWhereActivity::class.java))
            }
        }
    }
}