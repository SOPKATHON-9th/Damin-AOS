package sopt.haeti.damin_aos.presentation.situation

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import sopt.haeti.damin_aos.databinding.ItemHomeBinding
import sopt.haeti.damin_aos.databinding.ItemSituationInBinding
import sopt.haeti.damin_aos.presentation.home.HomeModel
import sopt.haeti.damin_aos.presentation.home.HomeViewHolder
import sopt.haeti.damin_aos.presentation.situation.SituationInModel

class SituationWhereAdapter(context: Context) :
    RecyclerView.Adapter<SituationWhereHolder>() {
    private var modelList: List<HomeModel> = emptyList()
    private val layoutInflater by lazy { LayoutInflater.from(context) }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SituationWhereHolder {
        val binding = ItemSituationInBinding.inflate(layoutInflater, parent, false)
        return SituationWhereHolder(binding)
    }

    override fun getItemCount(): Int = modelList.size

    override fun onBindViewHolder(holder: SituationWhereHolder, position: Int) {
        holder.bind(this.modelList[position])
        Log.d("onBind 확인", "submitList : $this.modelList")
    }

    fun submitList(modelList: List<HomeModel>) {
        this.modelList = modelList
        notifyDataSetChanged()
        Log.d("submitList 확인", "submitList : $modelList")
    }

}