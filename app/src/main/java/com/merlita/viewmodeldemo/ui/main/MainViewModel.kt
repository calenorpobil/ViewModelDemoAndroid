package com.merlita.viewmodeldemo.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val rate = 0.74f
    private var dollarText = ""
    //private var result: Float = 0f
    //LiveData:
    private var result: MutableLiveData<Float> = MutableLiveData()


    fun setAmount(value: String) {
        this.dollarText = value
//        result = value.toFloat() * rate
        result.value = value.toFloat() * rate
    }

    //fun getResult(): Float {
    fun getResult(): MutableLiveData<Float> {
        return result
    }
}