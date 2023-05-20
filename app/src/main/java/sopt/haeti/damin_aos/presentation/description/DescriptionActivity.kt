package sopt.haeti.damin_aos.presentation.description

import android.content.Intent
import android.os.Bundle
import sopt.haeti.damin_aos.R
import sopt.haeti.damin_aos.databinding.ActivityDescriptionBinding
import sopt.haeti.damin_aos.presentation.home.MainActivity
import sopt.haeti.damin_aos.util.base.BindingActivity

class DescriptionActivity : BindingActivity<ActivityDescriptionBinding>(R.layout.activity_description) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }
    private fun initView(){
        binding.btnHome.setOnClickListener(){
            intent=Intent(this@DescriptionActivity,MainActivity::class.java)
            finish()
            startActivity(intent)
        }
        binding.btnNext.setOnClickListener(){
            intent = Intent(this@DescriptionActivity, MainActivity::class.java)
            finish()
            startActivity(intent)
        }
    }
}