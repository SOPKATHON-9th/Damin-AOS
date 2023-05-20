package sopt.haeti.damin_aos.presentation.situation

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ItemSituationInBinding

class SituationInRecyclerAdapter(context: Context, private val itemClick: (String) -> Unit) :
    RecyclerView.Adapter<SituationInViewHolder>() {
    private val inflater by lazy { LayoutInflater.from(context) }

    val imageResId1 = R.drawable.ic_inplatform
    val drawable1 = context.getDrawable(imageResId1)

    val imageResId2 = R.drawable.ic_platform
    val drawable2 = context.getDrawable(imageResId2)

    val imageResId3 = R.drawable.ic_elevator
    val drawable3 = context.getDrawable(imageResId3)

    val imageResId4 = R.drawable.ic_insubway
    val drawable4 = context.getDrawable(imageResId4)

    val itemlist: List<SituationInModel> =
        listOf(
            SituationInModel(imageResId1, "역사 내"),
            SituationInModel(imageResId2, "플랫폼"),
            SituationInModel(imageResId3, "열차 내"),
            SituationInModel(imageResId4, "엘리베이터")
        )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SituationInViewHolder {
        val binding: ItemSituationInBinding = ItemSituationInBinding.inflate(
            inflater,
            parent, false
        )
        return SituationInViewHolder(binding, itemClick)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: SituationInViewHolder, position: Int) {
        holder.bind(itemlist[position])
    }

}
