package com.hasanaydin.android101.activities.sub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.hasanaydin.android101.R
import com.hasanaydin.android101.activities.main.MainActivityRecyclerAdapter
import com.hasanaydin.android101.activities.main.MainActivityViewModel
import com.hasanaydin.android101.databinding.ActivityMainBinding
import com.hasanaydin.android101.databinding.ActivitySubsBinding

class SubsActivity : AppCompatActivity() {

    lateinit var binding: ActivitySubsBinding
    lateinit var viewModel: SubsViewModel
    lateinit var adapter: SubActivityRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySubsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProviders.of(this).get(SubsViewModel::class.java)

        adapter = SubActivityRecyclerAdapter(viewModel.subList)
        binding.recycler.adapter = adapter

        binding.sub.setOnClickListener {
            val result = viewModel.sub(
                binding.number1.text.toString().toInt(),
                binding.number2.text.toString().toInt()
            )
            adapter.notifyDataSetChanged()
            binding.sonuc.text = "Sonuc = $result"

        }
    }
}