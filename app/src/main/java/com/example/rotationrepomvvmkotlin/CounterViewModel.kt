package com.example.rotationrepomvvmkotlin

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel(): ViewModel() {

    private val _repository: CounterRepository = CounterRepository()

    // private variable for this class
    private val _count = mutableStateOf(_repository.getCounter().count)

    // public variable to access outside this class
    val count: MutableState<Int> = _count

    fun increment() {
        // increment using model
        _repository.incrementCounter()
        // add value to the private variable to send to local variable
        _count.value = _repository.getCounter().count
    }

    fun decrement() {
        // decrement using model
        _repository.decrementCounter()
        // add value to the private variable to send to local variable
        _count.value = _repository.getCounter().count

    }
}