package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTest {

    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val actualtip = calculateTip(amount,tipPercent,false)
        val tip = tipPercent/100*amount
        val exceptedTip = NumberFormat.getCurrencyInstance().format(tip)
        assertEquals(actualtip,exceptedTip)
    }
}