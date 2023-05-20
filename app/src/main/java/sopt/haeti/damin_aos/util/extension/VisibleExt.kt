package sopt.haeti.damin_aos.util.extension

import android.view.View

fun View.visible(isVisible: Boolean) {
    visibility = if (isVisible) View.VISIBLE else View.GONE
}