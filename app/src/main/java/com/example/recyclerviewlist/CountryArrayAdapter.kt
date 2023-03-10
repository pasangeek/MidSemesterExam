package com.example.recyclerviewlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountryArrayAdapter(val countryNames: List<String>, val countryFlags: List<Int>) :
    RecyclerView.Adapter<CountryArrayAdapter.MyViewHolder>() {

    class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {

        val textView = row.findViewById<TextView>(R.id.country_names)
        val imageView = row.findViewById<ImageView>(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(
            R.layout.item_view,
            parent, false
        )
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = countryNames[position]
        holder.imageView.setImageResource(countryFlags[position])

    }


    override fun getItemCount(): Int = countryFlags.size


}