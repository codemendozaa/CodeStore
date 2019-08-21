package com.codemen.codestore

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_landing.view.*

class AdapterLanding (val data:List<Item_landing>): RecyclerView.Adapter<AdapterLanding.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(parent.inflante(R.layout.item_landing))
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindView(data[position])
    }

    class Holder(ItemView:View?):RecyclerView.ViewHolder(ItemView!!){
        fun bindView(item_landing: Item_landing){
            with(item_landing){
                itemView.txtTitleItem.text = title
                itemView.txtDescItem.text = desc
                itemView.txtPriceItem.text = "$ ${String.format("%.2f",price)}"
            }

        }
    }
}