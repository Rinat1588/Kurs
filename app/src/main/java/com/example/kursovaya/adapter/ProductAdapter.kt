package com.example.kursovaya.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

abstract class ProductAdapter<T,VH: RecyclerView.ViewHolder> (
   val context: Context,
   itemCallback: DiffUtil.ItemCallback<T>
)    :ListAdapter<T, VH>(itemCallback) {
    val inflater=LayoutInflater.from(context)

    private var onItemClickListener: OnItemClickListener<T>?=null
    fun setOnItemClickListener(listener: OnItemClickListener<T>){
        onItemClickListener = listener
    }
    protected fun callOnItemClickListener(position: Int,item:T,view:View){
        onItemClickListener?.onItemClick(position,item,view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        TODO("Not yet implemented")
    }
}