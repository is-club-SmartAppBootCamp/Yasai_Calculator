package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tapCalculationButton(calculate_button)
    }

    @SuppressLint("SetTextI18n")
    fun tapCalculationButton(view: View){
        val num1 = findViewById<EditText>(R.id.Num1).text.toString()
        val num2 = findViewById<EditText>(R.id.Num2).text.toString()
        val operator_name = findViewById<Spinner>(R.id.spinner).selectedItem.toString()
        val result = Calculator().execCalculation(num1, num2, operator_name)
        textView.text = num1 + operator_name + num2 + "=" + result.toString()
    }

}
