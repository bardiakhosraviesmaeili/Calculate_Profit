package com.example.calculateprofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculateProfit.setOnClickListener {
            if (editTextNumber.length()==0)
            {
                Toast.makeText(this, "please enter a valid number", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val value=editTextNumber.text.toString().toInt()
            var result=0
            if (radioButton10percent.isChecked){
                result = value * 10 / 100
            }
            if (radioButton12percent.isChecked){
                result = (value * 12 / 100 ) *3
            }
            if(!radioButton12percent.isChecked&&!radioButton10percent.isChecked){
                Toast.makeText(this, "please select a percentage", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show()
        }
    }
}