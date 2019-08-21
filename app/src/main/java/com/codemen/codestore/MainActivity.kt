package com.codemen.codestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcViewLanding.layoutManager = GridLayoutManager(this,2)
        val itemsShop = (0..20).map{
            Item_landing("Titulo $it","Desc $it",2000.00 + it)
        }

        val adapter = AdapterLanding(itemsShop)
        rcViewLanding.adapter = adapter
       // toastLong("Hello Erix ..")
        toastShort("hello desde Anko")
    }
}
