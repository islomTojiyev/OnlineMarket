package com.example.onlinemarket

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class DiscountStoresAdapter() :
    RecyclerView.Adapter<DiscountStoresAdapter.ViewHolder>() {

    private var images = arrayOf(
        R.drawable.discount_stores_just,
        R.drawable.discount_stores_avva,
        R.drawable.discount_stores_indenim,
        R.drawable.discount_stores_waikiki,
        R.drawable.discount_stores_zara
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var layoutView =
            LayoutInflater.from(parent.context).inflate(R.layout.discount_stores_item,parent,false)
        return ViewHolder(layoutView)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return images.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var image : ImageView
        init {
            image = view.findViewById(R.id.discount_stores_image)
        }
    }


}