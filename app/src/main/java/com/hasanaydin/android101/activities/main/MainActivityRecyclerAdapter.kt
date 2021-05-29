package com.hasanaydin.android101.activities.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hasanaydin.android101.databinding.ItemRecyclerSumBinding

class MainActivityRecyclerAdapter(private val dataSet: ArrayList<Int>) :
    RecyclerView.Adapter<MainActivityRecyclerAdapter.ViewHolder>() {
    private lateinit var binding : ItemRecyclerSumBinding
    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(val binding: ItemRecyclerSumBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(value:Int){
            binding.textView.text=value.toString()
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        binding= ItemRecyclerSumBinding.inflate(LayoutInflater.from(viewGroup.context))

        return ViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.bind(dataSet[position])
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}