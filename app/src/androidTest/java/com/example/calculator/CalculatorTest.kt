package com.example.calculator

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class CalculatorTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun execCalculation() {
        val calculator = Calculator()
        //整数の足し算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("10", "10", "+"), 20.0f)

        //整数の足し算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("-10", "-10", "+"), -20.0f)
        assertEquals(calculator.execCalculation("10", "-10", "+"), 0.0f)
        assertEquals(calculator.execCalculation("-10", "10", "+"), 0.0f)

        //小数の足し算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("0.5", "0.5", "+"), 1.0f)

        //小数の足し算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("-0.5", "-0.5", "+"), -1.0f)
        assertEquals(calculator.execCalculation("0.5", "-0.5", "+"), 0.0f)
        assertEquals(calculator.execCalculation("-0.5", "0.5", "+"), 0.0f)

        //整数の引き算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("20", "10", "-"), 10.0f)
        assertEquals(calculator.execCalculation("10", "20", "-"), -10.0f)

        //整数の引き算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("-10", "-10", "-"), 0.0f)
        assertEquals(calculator.execCalculation("-10", "10", "-"), -20.0f)
        assertEquals(calculator.execCalculation("10", "-10", "-"), 20.0f)

        //小数の引き算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("1.0", "0.5", "-"), 0.5f)
        assertEquals(calculator.execCalculation("0.5", "1.0", "-"), -0.5f)

        //小数の引き算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("-1.0", "-0.5", "-"), -0.5f)
        assertEquals(calculator.execCalculation("-1.0", "0.5", "-"), -1.5f)
        assertEquals(calculator.execCalculation("1.0", "-0.5", "-"), 1.5f)

        //整数の掛け算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("5", "10", "*"), 50.0f)

        //整数の掛け算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("-5", "-10", "*"), 50.0f)
        assertEquals(calculator.execCalculation("-5", "10", "*"), -50.0f)
        assertEquals(calculator.execCalculation("5", "-10", "*"), -50.0f)

        //小数の掛け算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("1.5", "0.5", "*"), 0.8f)

        //小数の掛け算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("-1.5", "-0.5", "*"), 0.8f)
        assertEquals(calculator.execCalculation("-1.5", "0.5", "*"), -0.8f)
        assertEquals(calculator.execCalculation("1.5", "-0.5", "*"), -0.8f)

        //整数の割り算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("10", "2", "/"), 5.0f)
        assertEquals(calculator.execCalculation("2", "10", "/"), 0.2f)

        //整数の割り算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("-10", "-2", "/"), 5.0f)
        assertEquals(calculator.execCalculation("10", "-2", "/"), -5.0f)
        assertEquals(calculator.execCalculation("-10", "2", "/"), -5.0f)
        assertEquals(calculator.execCalculation("-2", "-10", "/"), 0.2f)
        assertEquals(calculator.execCalculation("2", "-10", "/"), -0.2f)
        assertEquals(calculator.execCalculation("-2", "10", "/"), -0.2f)

        //小数の割り算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("1.5", "0.5", "/"), 3.0f)
        assertEquals(calculator.execCalculation("0.5", "1.5", "/"), 0.3f)

        //小数の割り算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("-1.5", "-0.5", "/"), 3.0f)
        assertEquals(calculator.execCalculation("1.5", "-0.5", "/"), -3.0f)
        assertEquals(calculator.execCalculation("-1.5", "0.5", "/"), -3.0f)
        assertEquals(calculator.execCalculation("-0.5", "-1.5", "/"), 0.3f)
        assertEquals(calculator.execCalculation("0.5", "-1.5", "/"), -0.3f)
        assertEquals(calculator.execCalculation("-0.5", "1.5", "/"), -0.3f)

        //0で割るとき0を返すことをチェック
        assertEquals(calculator.execCalculation("1.5", "0.0", "/"), 0.0f)

        //1つ目の数値に文字列を渡されたら0を返すことをチェック
        assertEquals(calculator.execCalculation("誤", "10", "+"), 0.0f)
        assertEquals(calculator.execCalculation("誤", "10", "-"), 0.0f)
        assertEquals(calculator.execCalculation("誤", "10", "*"), 0.0f)
        assertEquals(calculator.execCalculation("誤", "10", "/"), 0.0f)

        //2つ目の数値に文字列を渡されたら0を返すことをチェック
        assertEquals(calculator.execCalculation("10", "誤", "+"), 0.0f)
        assertEquals(calculator.execCalculation("10", "誤", "-"), 0.0f)
        assertEquals(calculator.execCalculation("10", "誤", "*"), 0.0f)
        assertEquals(calculator.execCalculation("10", "誤", "/"), 0.0f)

        //全角数字は使えないことをチェック
        assertEquals(calculator.execCalculation("10", "１０", "+"), 0.0f)
        assertEquals(calculator.execCalculation("10", "１０", "-"), 0.0f)
        assertEquals(calculator.execCalculation("10", "１０", "*"), 0.0f)
        assertEquals(calculator.execCalculation("10", "１０", "/"), 0.0f)
        assertEquals(calculator.execCalculation("１０", "10", "+"), 0.0f)
        assertEquals(calculator.execCalculation("１０", "10", "-"), 0.0f)
        assertEquals(calculator.execCalculation("１０", "10", "*"), 0.0f)
        assertEquals(calculator.execCalculation("１０", "10", "/"), 0.0f)

    }
}