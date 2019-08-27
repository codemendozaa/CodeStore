package com.codemen.codestore

import android.view.View
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

class ItemList:AnkoComponent<AdapterCarrito> {
    override fun createView(ui: AnkoContext<AdapterCarrito>): View = with(ui){
        verticalLayout{
            lparams(width = matchParent,height = wrapContent)
            cardView {
                linearLayout {
                    orientation = LinearLayout.HORIZONTAL
                }
            }


        }
    }

}