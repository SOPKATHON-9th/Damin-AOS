package sopt.haeti.damin_aos.presentation.home

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import sopt.haeti.damin_aos.databinding.ItemHomeBinding
import sopt.haeti.damin_aos.databinding.ItemSituationInBinding
import sopt.haeti.damin_aos.presentation.situation.SituationInModel

class HomeRecyclerAdapter(context: Context) :
    RecyclerView.Adapter<HomeViewHolder>() {
    private var modelList: List<HomeModel> = emptyList()
    private val layoutInflater by lazy { LayoutInflater.from(context) }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding = ItemHomeBinding.inflate(layoutInflater, parent, false)
        return HomeViewHolder(binding)
    }

    override fun getItemCount(): Int = modelList.size

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(this.modelList[position])
        Log.d("onBind 확인", "submitList : $this.modelList")
    }

    fun submitList(modelList: List<HomeModel>) {
        this.modelList = modelList
        notifyDataSetChanged()
        Log.d("submitList 확인", "submitList : $modelList")
    }

}