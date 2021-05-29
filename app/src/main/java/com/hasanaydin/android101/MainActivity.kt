package com.hasanaydin.android101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanaydin.android101.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.button.setOnClickListener {
            val result =  sum(binding.number1.text.toString().toInt(),binding.number2.text.toString().toInt())
            binding.sonuc.text = "Sonuc = $result"
        }

    }

    fun sum (x:Int,y:Int):Int{
        val z = x+y
        println(z)
        return z
    }

}