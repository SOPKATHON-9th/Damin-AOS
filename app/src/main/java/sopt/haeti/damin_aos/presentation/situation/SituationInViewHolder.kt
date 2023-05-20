package sopt.haeti.damin_aos.presentation.situation

import androidx.recyclerview.widget.RecyclerView
import sopt.haeti.damin_aos.databinding.ItemSituationInBinding

class SituationInViewHolder(
    private val binding: ItemSituationInBinding,
    private val itemClick: (String) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(data: SituationInModel) {
        with(binding) {
            situationInModel = data
            root.setOnClickListener {
                itemClick(data.title)
            }
        }
    }
}