package com.example.traveltour

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListTravelAdapter(private val listTravel: ArrayList<Travel>): RecyclerView.Adapter<ListTravelAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback
    private lateinit var btnMoveDetailActivity: DetailActivity

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
         var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
         var tvDesc : TextView = itemView.findViewById(R.id.tv_item_detail)
         var imgPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data : Travel)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_travel, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val travel = listTravel[position]

        Glide.with(holder.itemView.context)
            .load(travel.photo)
            .apply(RequestOptions().override(150, 170))
            .into(holder.imgPhoto)

        holder.tvName.text = travel.name
        holder.tvDesc.text = travel.description

        holder.itemView.setOnClickListener{ onItemClickCallback.onItemClicked(listTravel[holder.adapterPosition])}
    }

    override fun getItemCount(): Int {
        return listTravel.size
    }
}