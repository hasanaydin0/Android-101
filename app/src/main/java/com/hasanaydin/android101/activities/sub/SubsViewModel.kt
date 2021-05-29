package com.hasanaydin.android101.activities.sub

import androidx.lifecycle.ViewModel
import com.hasanaydin.android101.activities.Calculation

class SubsViewModel : ViewModel() {

    val subList = arrayListOf<Calculation>()

    fun sub(x: Int, y: Int): Int {
        val z = x - y
        println(z)

        val calc = Calculation(x,y,z)
        subList.add(calc)
        println(subList)

        return z


    }

}