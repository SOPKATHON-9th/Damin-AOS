package sopt.haeti.damin_aos.presentation.mypage

import androidx.recyclerview.widget.RecyclerView
import sopt.haeti.damin_aos.databinding.ItemMypageCharacterBinding

class MyPageViewHolder(private val binding: ItemMypageCharacterBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun onBind(item: MypageData) {
        binding.ivCharacter.setImageResource(item.type)
        binding.tvCharacters.text = item.detail
    }
}