package com.codemen.codestore

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowId
import android.widget.Toast

//toas mensaje corto
fun Activity.toastShort(message: String) {

    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

//toas mensaje largo
fun Activity.toastLong(message: String) {

    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun ViewGroup.inflante(layautId:Int):View{
    return LayoutInflater.from(context).inflate(layautId,this,false)
}