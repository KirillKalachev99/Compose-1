package com.example.calculatorcompose

import org.junit.Assert.*

import org.junit.Test

class MainActivityKtTest {

    @Test
    fun count(){
        var count = ""
        var delimArray = arrayOf(MATH.split('+', '-', '/', '*', '%'))
        assertEquals("1", delimArray[0])
    }

}