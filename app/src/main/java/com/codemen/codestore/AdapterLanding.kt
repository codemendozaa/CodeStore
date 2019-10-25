package com.codemen.codestore

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityOptionsCompat
import androidx.core.app.ActivityOptionsCompat.makeSceneTransitionAnimation
import androidx.core.util.Pair
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_landing.view.*

class AdapterLanding (val data:List<Item_landing>): RecyclerView.Adapter<AdapterLanding.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(
            parent.inflante(R.layout.item_landing),
            fun(holder: Holder, position: Int) {
            }


        )
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindView(data[position])
    }

    class Holder(ItemView: View?, param: Any?):RecyclerView.ViewHolder(ItemView!!){
        fun bindView(item_landing: Item_landing){
            with(item_landing){
                itemView.txtTitleItem.text = title
                itemView.txtDescItem.text = desc
                itemView.txtPriceItem.text = "$ ${String.format("%.2f",price)}"

                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra("Title",title)
                    intent.putExtra("Desc",desc)
                    intent.putExtra("Price",price)


                    val p1:Pair<View, String> = Pair.create(itemView.imgItemHeader,"transitionHader")
                    val p2:Pair<View, String> = Pair.create(itemView.txtTitleItem,"transitionTitle")
                    val p3:Pair<View, String> = Pair.create(itemView.txtDescItem,"transitionDescrip")
                    val p4:Pair<View, String> = Pair.create(itemView.txtPriceItem,"transitionPrice")
                    val options:ActivityOptionsCompat = makeSceneTransitionAnimation(itemView.context as Activity, p1,p2,p3,p4)
                    itemView.context.startActivity(intent,options.toBundle())

                }
            }

        }
    }
}