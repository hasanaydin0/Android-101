package com.hasanaydin.android101.activities.main

import androidx.lifecycle.ViewModel
import com.hasanaydin.android101.activities.Calculation

class MainActivityViewModel : ViewModel() {

    val resultList = arrayListOf<Calculation>()

    fun sum (x:Int,y:Int):Int{
        val z = x+y
        println(z)
        val calc = Calculation(x,y,z)
        resultList.add(calc)
        println(resultList)
        return z
    }


}