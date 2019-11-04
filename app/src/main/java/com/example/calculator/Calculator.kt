package com.example.calculator

class Calculator {

    fun execCalculation(num1:String, num2:String, operatorName:String): Float {

        var result:Float = 0.0F

        when(operatorName){
            "+" -> {
                result = num1.toFloat() + num2.toFloat()
            }
            "-" -> {
                result = num1.toFloat() - num2.toFloat()
            }
            "*" -> {
                result = num1.toFloat() * num2.toFloat()
            }
            "/" -> {
                result = num1.toFloat() / num2.toFloat()
            }
        }

        return result

    }

}