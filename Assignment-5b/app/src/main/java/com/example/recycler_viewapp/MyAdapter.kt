package com.example.recycler_viewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val data: List<data>): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    class MyViewHolder(val cardView: View) : RecyclerView.ViewHolder(cardView) {
        val img: ImageView = cardView.findViewById(R.id.imageView)
        val text1: TextView = cardView.findViewById(R.id.textView1)
        val text2: TextView = cardView.findViewById(R.id.textView2)
        val text3: TextView = cardView.findViewById(R.id.textView3)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        holder.img.setImageResource(data[position].imageNumber)
        holder.text1.text = data[position].title
        holder.text2.text = data[position].species
        holder.text3.text = data[position].location
    }

    override fun getItemCount(): Int = data.size
}