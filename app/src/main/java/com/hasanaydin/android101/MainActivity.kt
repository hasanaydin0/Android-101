package com.hasanaydin.android101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val result =  sum(number1.text.toString().toInt(),number2.text.toString().toInt())
            sonuc.text = "Sonuc = $result"
        }

    }

    fun sum (x:Int,y:Int):Int{
        val z = x+y
        println(z)
        return z
    }

}