package com.codemen.codestore

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_descr.*

class DetailActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        intent?.extras?.let {

            txtDetailTitle.text = it.getString("Title")
            txtDetailDescrip.text = it.getString("Desc")
            txtDetailPrice.text = "$ ${String.format("%.2f",it.getDouble("price"))}"
        }

    }
}
