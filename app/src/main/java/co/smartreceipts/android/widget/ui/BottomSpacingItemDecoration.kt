package co.smartreceipts.android.widget.ui

import android.graphics.Rect
import androidx.recyclerview.widget.RecyclerView
import co.smartreceipts.android.R

class BottomSpacingItemDecoration : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, itemPosition: Int, parent: RecyclerView) {
        parent.adapter?.let {
            if (itemPosition == it.itemCount - 1) {
                outRect.bottom =
                    parent.resources.getDimensionPixelOffset(R.dimen.bottom_list_offset)
            } else {
                super.getItemOffsets(outRect, itemPosition, parent)
            }
        }
    }
}