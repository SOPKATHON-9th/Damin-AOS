package sopt.haeti.damin_aos.presentation.mypage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import sopt.haeti.damin_aos.databinding.ItemMypageCharacterBinding

class MyPageAdapter(val itemList: List<MypageData>) : RecyclerView.Adapter<MyPageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyPageViewHolder {
        val binding: ItemMypageCharacterBinding =
            ItemMypageCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyPageViewHolder(binding)
    }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: MyPageViewHolder, position: Int) {
        holder.onBind(itemList[position])
    }
}