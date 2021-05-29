package com.hasanaydin.android101.activities.main

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val resultList = arrayListOf<Int>()

    fun sum (x:Int,y:Int):Int{
        val z = x+y
        println(z)

        resultList.add(z)
        println(resultList)
        return z
    }


}