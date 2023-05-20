package sopt.haeti.damin_aos.presentation.home

import androidx.recyclerview.widget.RecyclerView
import sopt.haeti.damin_aos.databinding.ItemHomeBinding

class HomeViewHolder(
    private val binding: ItemHomeBinding,
    private val itemClick: (String) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(data: HomeModel) {
        with(binding) {
            homeModel = data
            root.setOnClickListener {
                itemClick(data.title)
            }
        }
    }
}