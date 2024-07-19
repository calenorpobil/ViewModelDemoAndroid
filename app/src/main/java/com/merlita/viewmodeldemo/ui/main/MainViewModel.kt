package com.merlita.viewmodeldemo.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainViewModel (private val savedStateHandle: SavedStateHandle) : ViewModel() {

    val RESULT_KEY = "Euro Value"

    private val rate = 0.74f
    private var dollarText = ""
    //private var result: Float = 0f
    //LiveData:
    private var result: MutableLiveData<Float> =
        savedStateHandle.getLiveData(RESULT_KEY)


    fun setAmount(value: String) {
        this.dollarText = value
        val convertedValue = value.toFloat() * rate
        result.value = convertedValue
        savedStateHandle.set(RESULT_KEY, convertedValue)
    }

    //fun getResult(): Float {
    fun getResult(): MutableLiveData<Float> {
        return result
    }
}