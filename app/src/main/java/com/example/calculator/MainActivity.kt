package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var etNumber1: EditText? = null // on the activity etNumber1
    private var etNumber2: EditText? = null // on the activity etNumber2
    private var tvDisplay: TextView? = null // on the activity tvDisplay

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1 = findViewById<EditText>(R.id.etNumber1)
        etNumber2 = findViewById<EditText>(R.id.etNumber2)
        tvDisplay = findViewById<EditText>(R.id.tvDisplay)

        val btnAddition = findViewById<Button>(R.id.btnadd)
        btnAddition.setOnClickListener{
            add()
        }
        val btnSubtraction = findViewById<Button>(R.id.btnsub)
        btnSubtraction.setOnClickListener{
            sub()
        }
        val btnMultiplication = findViewById<Button>(R.id.btnmul)
        btnMultiplication.setOnClickListener{
            mul()
        }
        val btnDivision = findViewById<Button>(R.id.btndiv)
        btnDivision.setOnClickListener{
            div()
        }

    }

    private fun add(){
        var intNumber1: Int = 0
        var intNumber2: Int = 0
        var intAnswer: Int = 0

        intNumber1 = etNumber1.text.toString().toInt()
        intNumber2 = etNumber2.text.toString().toInt()

        intAnswer = intNumber1 + intNumber2

        //output intNumber1 + " + " + intNumber2 + " = " + intAnswer // 1 + 1 = 2
        tvDisplay?.text = "" + intNumber1 + "+ " + intNumber2 + "=" + intAnswer

    }
}