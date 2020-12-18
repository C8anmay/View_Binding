package com.acm.viewbinding

import androidx.lifecycle.ViewModel

class ViewModel :ViewModel(){
    var count:Int=0
    fun getC():Int=count
    fun setC(){
        count+=1
    }

}