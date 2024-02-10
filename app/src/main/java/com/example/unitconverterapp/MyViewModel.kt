package com.example.unitconverterapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.roundToInt

class MyViewModel :ViewModel(){
   var resultC by mutableStateOf(0)

    fun convertTemp(tempF:String){
        var tempFnum=tempF.toInt()
       resultC=((tempFnum-32)*0.5556).roundToInt()
    }
}