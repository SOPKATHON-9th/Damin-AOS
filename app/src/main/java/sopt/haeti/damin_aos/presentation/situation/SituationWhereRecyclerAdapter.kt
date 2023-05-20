package sopt.haeti.damin_aos.presentation.situation

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import sopt.haeti.damin_aos.databinding.ItemSituationWhereBinding

class SituationWhereRecyclerAdapter(context: Context, private val itemClick: (String) -> Unit) :
    RecyclerView.Adapter<SituationWhereViewHolder>() {
    private var modelList: List<SituationWhereModel> = emptyList()
    private val layoutInflater by lazy { LayoutInflater.from(context) }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SituationWhereViewHolder {
        val binding = ItemSituationWhereBinding.inflate(layoutInflater, parent, false)
        return SituationWhereViewHolder(binding, itemClick)
    }

    override fun getItemCount(): Int = modelList.size

    override fun onBindViewHolder(holder: SituationWhereViewHolder, position: Int) {
        holder.bind(this.modelList[position])
    }

    fun submitList(modelList: List<SituationWhereModel>) {
        this.modelList = modelList
        notifyDataSetChanged()
    }

}