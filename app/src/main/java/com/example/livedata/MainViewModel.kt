package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    private  val data:MutableLiveData<Int> = MutableLiveData<Int>()
    init {
        data.value=0
    }
    val Data:LiveData<Int> =data
    fun setValue(){
        data.value=data.value!!+1
    }
}