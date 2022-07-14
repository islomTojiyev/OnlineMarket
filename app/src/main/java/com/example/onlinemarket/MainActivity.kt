package com.example.onlinemarket

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowInsetsController
import android.view.WindowManager
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {


    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    private var discountStoreAdapter: RecyclerView.Adapter<DiscountStoreAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        men_closes_category.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        adapter = RecyclerAdapter()
        men_closes_category.adapter = adapter


        women_closes_category.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        women_closes_category.adapter = adapter

        children_closes_category.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        children_closes_category.adapter = adapter

        discount_stores.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        discountStoreAdapter = DiscountStoreAdapter()
        discount_stores.adapter = discountStoreAdapter


    }


}