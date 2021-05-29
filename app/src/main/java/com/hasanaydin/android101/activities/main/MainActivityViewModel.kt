package com.hasanaydin.android101.activities.main

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    fun sum (x:Int,y:Int):Int{
        val z = x+y
        println(z)
        return z
    }

}