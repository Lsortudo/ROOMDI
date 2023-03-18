package com.example.roomdi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdi.Model.Car
import com.example.roomdi.R

class CarListAdapter : ListAdapter<Car, CarListAdapter.CarViewHolder> (DiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }
    class CarViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        private val carItemViewName : TextView = itemView.findViewById(R.id.tvName)
        private val carItemViewPrice : TextView = itemView.findViewById(R.id.tvPrice)

        //fun bind(text: String?) {
        fun bind(car: Car) {
            carItemViewName.text = car.name
            carItemViewPrice.text = car.price
        }

        companion object {
            fun create (parent: ViewGroup) : CarViewHolder {
                val view: View =  LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
                return CarViewHolder(view)
            }
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<Car>(){

        override fun areItemsTheSame(oldItem: Car, newItem: Car) =
            //return oldItem === newItem
             oldItem.id == newItem.id


        override fun areContentsTheSame(oldItem: Car, newItem: Car) =
            //return oldItem.id == newItem.id
             oldItem == newItem


        /*override fun areItemsTheSame(oldItem: Car, newItem: Car): Boolean {
            //return oldItem === newItem
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Car, newItem: Car): Boolean {
            //return oldItem.id == newItem.id
            return oldItem == newItem
        }*/

    }
}