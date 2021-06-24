package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val res = findViewById<TextView>(R.id.res)

        var prev = 0

        findViewById<Button>(R.id.add_button).setOnClickListener {
            if (res.text.isNotEmpty() && (res.text[res.text.length-1].isDigit() || res.text[res.text.length-1].isLetter())) {
                res.text = res.text.toString() + "+"
            }
        }
        findViewById<Button>(R.id.subtract_button).setOnClickListener {
            if (res.text.isNotEmpty() && (res.text[res.text.length-1].isDigit() || res.text[res.text.length-1].isLetter())) {
                res.text = res.text.toString() + "-"
            }
        }
        findViewById<Button>(R.id.multiply_button).setOnClickListener {
            if (res.text.isNotEmpty() && (res.text[res.text.length-1].isDigit() || res.text[res.text.length-1].isLetter())) {
                res.text = res.text.toString() + "*"
            }
        }
        findViewById<Button>(R.id.divide_button).setOnClickListener {
            if (res.text.isNotEmpty() && (res.text[res.text.length-1].isDigit() || res.text[res.text.length-1].isLetter())) {
                res.text = res.text.toString() + "/"
            }
        }
        findViewById<Button>(R.id.one_button).setOnClickListener {
            if (!res.text[res.text.length-1].isDigit() && !res.text[res.text.length-1].isLetter()) {
                if (res.text.isNotEmpty()) res.text = res.text.toString() + "1"
                else res.text = "1"
            }
        }
        findViewById<Button>(R.id.two_button).setOnClickListener {
            if (!res.text[res.text.length-1].isDigit() && !res.text[res.text.length-1].isLetter()) {
                if (res.text.isNotEmpty()) res.text = res.text.toString() + "2"
                else res.text = "2"
            }
        }
        findViewById<Button>(R.id.three_button).setOnClickListener {
            if (!res.text[res.text.length-1].isDigit() && !res.text[res.text.length-1].isLetter()) {
                if (res.text.isNotEmpty()) res.text = res.text.toString() + "3"
                else res.text = "3"
            }
        }
        findViewById<Button>(R.id.four_button).setOnClickListener {
            if (!res.text[res.text.length-1].isDigit() && !res.text[res.text.length-1].isLetter()) {
                if (res.text.isNotEmpty()) res.text = res.text.toString() + "4"
                else res.text = "4"
            }
        }
        findViewById<Button>(R.id.answer_button).setOnClickListener {
            if (!res.text[res.text.length-1].isDigit() && !res.text[res.text.length-1].isLetter()) {
                if (res.text.isNotEmpty()) res.text = res.text.toString() + "A"
                else res.text = "A"
            }
        }
        findViewById<Button>(R.id.clear_button).setOnClickListener {
            res.text = "0"
        }
        findViewById<Button>(R.id.equals_button).setOnClickListener {
            var stk = ArrayDeque<Int>()
            var str = res.text
            var ans = 0

            // todo

            res.text = ans.toString()
        }
    }
}