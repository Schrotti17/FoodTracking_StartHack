package com.example.foodtracker.ui.tracking

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodtracker.databinding.DishItemBinding

class ImageAdapter(
    private val dataset: List<Int>
): RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    class ImageViewHolder(private val binding: DishItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(trackedDay: Int) {
            //binding.imageView.setImageResource(trackedDay)
            Log.d("Why", "Isnt it working")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.ImageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DishItemBinding.inflate(inflater, parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item)
    }

    override fun getItemCount() = dataset.size
}