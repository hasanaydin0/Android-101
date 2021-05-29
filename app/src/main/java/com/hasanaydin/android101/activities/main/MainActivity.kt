package com.hasanaydin.android101.activities.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.hasanaydin.android101.R
import com.hasanaydin.android101.activities.sub.SubsActivity
import com.hasanaydin.android101.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        binding.button.setOnClickListener {
            val result = viewModel.sum(binding.number1.text.toString().toInt(),binding.number2.text.toString().toInt())
            binding.sonuc.text = "Sonuc = $result"
        }

        binding.nextActivity.setOnClickListener {

            var intent = Intent(this,SubsActivity::class.java)
            startActivity(intent)

        }

    }



}