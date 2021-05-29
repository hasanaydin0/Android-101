package com.hasanaydin.android101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.hasanaydin.android101.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        binding.button.setOnClickListener {
            val result = viewModel.sum(binding.number1.text.toString().toInt(),binding.number2.text.toString().toInt())
            binding.sonuc.text = "Sonuc = $result"
        }

    }



}