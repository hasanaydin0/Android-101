package com.hasanaydin.android101.activities.sub

import androidx.lifecycle.ViewModel

class SubsViewModel : ViewModel() {

    fun sub(x:Int,y:Int) : Int{
        val z = x - y
        println(z)
        return z
    }

}