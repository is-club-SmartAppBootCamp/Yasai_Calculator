package com.example.calculator

import java.math.BigDecimal

class Calculator {

    fun execCalculation(num1:String, num2:String, operatorName:String): Float {

        var result:Float = 0.0F

        var num1 = num1.toFloatOrNull() ?: return 0.0F
        var num2 = num2.toFloatOrNull() ?: return 0.0F


        when(operatorName){
            "+" -> {
                result = BigDecimal((num1 + num2).toString()).setScale(1, BigDecimal.ROUND_HALF_UP).toFloat()
            }
            "-" -> {
                result = BigDecimal((num1 - num2).toString()).setScale(1, BigDecimal.ROUND_HALF_UP).toFloat()
            }
            "*" -> {
                result = BigDecimal((num1 * num2).toString()).setScale(1, BigDecimal.ROUND_HALF_UP).toFloat()
            }
            "/" -> {
                if(num2 == 0.0F){
                    result = 0.0F
                } else {
                    result = BigDecimal((num1 / num2).toString()).setScale(1, BigDecimal.ROUND_HALF_UP).toFloat()
                }
            }
        }

        return result

    }

}