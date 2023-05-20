package sopt.haeti.damin_aos.presentation.situation

import androidx.recyclerview.widget.RecyclerView
import sopt.haeti.damin_aos.databinding.ItemSituationWhereBinding

class SituationWhereViewHolder(
    private val binding: ItemSituationWhereBinding,
    private val itemClick: (String) -> Unit
) : RecyclerView.ViewHolder(
    binding.root
) {
    fun bind(data: SituationWhereModel) {
        with(binding) {
            situationWhereModel = data
            root.setOnClickListener {
                itemClick(data.title)
            }
        }
    }
}