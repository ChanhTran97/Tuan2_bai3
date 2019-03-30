package com.example.bai3

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class MyAdapter(private val place : IntArray, private val name : Array<String>, private val mContext: Context)
    : RecyclerView.Adapter<MyHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewTyle: Int): MyHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false)
        return MyHolder(v,mContext)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.index(place[position],name[position])
    }

    override fun getItemCount(): Int {
        return place.size
    }
}