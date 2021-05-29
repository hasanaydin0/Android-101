package com.hasanaydin.android101.activities.main

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.hasanaydin.android101.R
import com.hasanaydin.android101.activities.sub.SubsActivity
import com.hasanaydin.android101.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel
    lateinit var adapter: MainActivityRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        adapter = MainActivityRecyclerAdapter(viewModel.resultList)
        binding.recycler.adapter = adapter


        binding.button.setOnClickListener {
            val result = viewModel.sum(binding.number1.text.toString().toInt(),binding.number2.text.toString().toInt())
            binding.sonuc.text = "Sonuc = $result"
            adapter.notifyDataSetChanged()

            if (viewModel.resultList.size >= 2){
                val matc = viewModel.matc(viewModel.resultList[viewModel.resultList.size-2].result,viewModel.resultList[viewModel.resultList.size-1].result)

                if (matc){
                    binding.bingo.visibility = View.VISIBLE
                }else{
                    binding.bingo.visibility = View.GONE
                }
            }


        }

        binding.nextActivity.setOnClickListener {

            var intent = Intent(this,SubsActivity::class.java)
            startActivity(intent)

        }

    }



}