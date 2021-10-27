package com.example.livedata

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer

class DataClass {
    var Fragment=0
    var FragmentTwo=0
    val FragementMutableLiveData=MutableLiveData<String>()
    val FragementTwoMutableLiveData=MutableLiveData<String>()
    val  MediatorLiveData=MediatorLiveData<String>()
    fun getFragment() {
        Fragment++
        FragementMutableLiveData.value="Fragment live $Fragment"

    }



    fun getFragmentTwo(){
        FragmentTwo++
        FragementTwoMutableLiveData.value="Fragment lice $FragmentTwo"
    }
    fun getMediator():LiveData<String>{
        MediatorLiveData.addSource(FragementMutableLiveData, Observer {
            MediatorLiveData.value=it
        })
        MediatorLiveData.addSource(FragementTwoMutableLiveData, Observer {
            MediatorLiveData.value=it
        })

        return MediatorLiveData
    }
}