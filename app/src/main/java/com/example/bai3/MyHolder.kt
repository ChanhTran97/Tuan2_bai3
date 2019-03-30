package com.example.bai3

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide



class MyHolder( itemView : View,private val mContext: Context) : RecyclerView.ViewHolder(itemView)
{
    private val iview = itemView.findViewById<View>(R.id.iview) as ImageView?
    private val tview = itemView.findViewById<View>(R.id.tview) as TextView?

    fun index(item : Int, s: String)
    {
        if (tview != null) {
            Glide.with(mContext).load(item).into(iview)
            tview.text = s
        }
    }
}