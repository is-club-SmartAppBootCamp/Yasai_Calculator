package com.example.calculator

class Calculator {

    fun execCalculation(num1:String, num2:String, operator_name:String): Float {

        var result:Float = 0.0F

        when(operator_name){
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