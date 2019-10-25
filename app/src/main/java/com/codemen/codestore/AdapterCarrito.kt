package com.codemen.codestore

import android.content.ClipData
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.find

class AdapterCarrito(val data:List<ItemListPojo>) :RecyclerView.Adapter<AdapterCarrito.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder =
        Holder(itemList().createView(AnkoContext.Companion.create(parent!!.context,this,false)))

    override fun onBindViewHolder(holder: Holder, position: Int) {
       holder?.bindView(data[position])
    }


    override fun getItemCount(): Int = data.size

    class Holder(itemView: View):RecyclerView.ViewHolder(itemView){
        val  txtViewTitle by lazy {
            itemView.find<TextView>(R.id.txtTitleItem)

        }

        val  txtViewDesc by lazy {
            itemView.find<TextView>(R.id.txtDescItem)

        }

        val  txtViewPrice by lazy {
            itemView.find<TextView>(R.id.txtPriceItem)

        }
        fun bindView(item:ItemListPojo){
            with(item){
                txtViewTitle.text = titulo
                txtViewDesc.text = desc
                txtViewPrice.text = price
            }

        }

    }





}



