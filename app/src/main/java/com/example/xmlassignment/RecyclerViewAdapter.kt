package com.example.xmlassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RecyclerViewAdapter (val details: List<Student>) : RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {

    val TAG = "Adapter"
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent,false))
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val data = details[position]


        holder.itemView.apply {
            tvName.text = data.name
            tvMarks.text = data.grade.toString()

        }
    }

    override fun getItemCount() = details.size
}


