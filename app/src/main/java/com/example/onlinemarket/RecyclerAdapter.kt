package com.example.onlinemarket

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter() :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles = arrayOf(
        "Рубашки",
        "Брюки",
        "Костюмы",
        "Джинсы",
        "Туфли",
        "Футболки",
        "Кросовки",
        "Спортивки"
    )
    private var images = arrayOf(
        R.drawable.men_shirt,
        R.drawable.men_pant,
        R.drawable.men_suit,
        R.drawable.men_jeans,
        R.drawable.men_shoes,
        R.drawable.men_t_shirt,
        R.drawable.men_sneakers,
        R.drawable.men_sportswear
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutView =
            LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return ViewHolder(layoutView)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textItem.text = titles[position]
        holder.imageItem.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imageItem: ImageView
        var textItem: TextView

        init {
            imageItem = view.findViewById(R.id.category_image)
            textItem = view.findViewById(R.id.category_text)
        }
    }
}