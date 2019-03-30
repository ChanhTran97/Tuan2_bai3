package com.example.bai3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.GridLayout.VERTICAL
import com.example.bai3.R.drawable.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)
        val rview = findViewById<View>(R.id.rview) as RecyclerView?

        val place = intArrayOf(images, images1, images2, images3, images4, images5)

        val name = arrayOf("Adam G", "Betty L", "Roberts", "Miller W", "Kevin John", "Laura M")

        val lManager = GridLayoutManager(this,1, VERTICAL,false)
        if (rview != null) {
            rview.setLayoutManager(lManager)
        }

        if (rview != null) {
            rview.adapter = MyAdapter(place,name, this)
        }
    }
}

