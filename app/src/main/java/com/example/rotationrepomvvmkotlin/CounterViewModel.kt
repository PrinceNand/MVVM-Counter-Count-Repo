package com.example.rotationrepomvvmkotlin

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    // private variable for this class
    private val _count = mutableStateOf(0)

    // public variable to access outside this class
    val count: MutableState<Int> = _count

    fun increment() {
        _count.value++
    }

    fun decrement() {
        _count.value--
    }
}