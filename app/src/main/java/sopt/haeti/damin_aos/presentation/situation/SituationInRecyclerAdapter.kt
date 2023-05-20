package sopt.haeti.damin_aos.presentation.situation

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ItemSituationInBinding
import sopt.haeti.damin_aos.presentation.home.HomeModel
import sopt.haeti.damin_aos.presentation.home.HomeViewHolder

class SituationInRecyclerAdapter(context: Context) :
    RecyclerView.Adapter<SituationInViewHolder>() {

    private var modelList: List<HomeModel> = emptyList()
    private val layoutInflater by lazy { LayoutInflater.from(context) }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SituationInViewHolder {
        val binding = ItemSituationInBinding.inflate(layoutInflater, parent, false)
        return SituationInViewHolder(binding)
    }

    override fun getItemCount(): Int = modelList.size

    override fun onBindViewHolder(holder: SituationInViewHolder, position: Int) {
        holder.bind(this.modelList[position])
        Log.d("onBind 확인", "submitList : $this.modelList")
    }

    fun submitList(modelList: List<HomeModel>) {
        this.modelList = modelList
        notifyDataSetChanged()
        Log.d("submitList 확인", "submitList : $modelList")
    }
}
