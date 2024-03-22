package com.example.foodtracker.ui.tracking

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodtracker.data.trackedDayData
import com.example.foodtracker.databinding.TrackedDayItemBinding
import com.example.foodtracker.model.TrackedDay

class TrackingAdapter(
    val dataset: List<TrackedDay>
): RecyclerView.Adapter<TrackingAdapter.TrackingViewHolder>() {


    class TrackingViewHolder(val binding: TrackedDayItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(trackedDay: TrackedDay) {
            binding.day.text = trackedDay.day
            binding.imageView.setImageResource(trackedDay.meals[0])
            binding.imageView2.setImageResource(trackedDay.meals[1])
            binding.imageView3.setImageResource(trackedDay.meals[2])
            //val imageAdapter = ImageAdapter(dataset = trackedDay.meals)
            //binding.recyclerViewDishes.adapter = imageAdapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackingViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = TrackedDayItemBinding.inflate(inflater, parent, false)
        return TrackingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TrackingViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item)
    }

    override fun getItemCount() = dataset.size
}