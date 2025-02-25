package com.jackal.calculator

import kotlin.test.Test
import kotlin.test.assertEquals

class TestCalculatorV3 {

    @Test
    fun testCalculate() {
        val calculatorV3 = CalculatorV3()

        val result1 = calculatorV3.calculate("1+2")
        assertEquals("3", result1)

        val result2 = calculatorV3.calculate("2333333333333332+1")
        assertEquals("2333333333333333", result2)
    }
}