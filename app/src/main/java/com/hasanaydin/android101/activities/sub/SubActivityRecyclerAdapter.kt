package com.hasanaydin.android101.activities.sub

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hasanaydin.android101.activities.Calculation
import com.hasanaydin.android101.databinding.ItemRecyclerSubBinding
import com.hasanaydin.android101.databinding.ItemRecyclerSumBinding

class SubActivityRecyclerAdapter(private val dataSet: ArrayList<Calculation>) :
    RecyclerView.Adapter<SubActivityRecyclerAdapter.ViewHolder>() {
    private lateinit var binding : ItemRecyclerSubBinding
    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(val binding: ItemRecyclerSubBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(value:Calculation){
            binding.item1.text="${value.value1} + ${value.value2} = ${value.result}"
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        binding= ItemRecyclerSubBinding.inflate(LayoutInflater.from(viewGroup.context))

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