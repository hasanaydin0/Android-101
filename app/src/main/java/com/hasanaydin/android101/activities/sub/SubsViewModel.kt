package com.hasanaydin.android101.activities.sub

import androidx.lifecycle.ViewModel

class SubsViewModel : ViewModel() {

    val subList = arrayListOf<Int>()

    fun sub(x:Int,y:Int) : Int{
        val z = x - y
        println(z)

        subList.add(z)
        println(subList)

        return z






    }

}