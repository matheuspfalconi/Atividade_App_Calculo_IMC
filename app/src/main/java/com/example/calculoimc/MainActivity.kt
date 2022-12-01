package com.example.calculoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var peso = findViewById<EditText>(R.id.editTextPeso)
        var altura = findViewById<EditText>(R.id.editTextAltura)
        var btnCalcular = findViewById<Button>(R.id.buttonCalcular)
        var res = findViewById<TextView>(R.id.textResultadoCalc)

        btnCalcular.setOnClickListener {
            var p = peso.text.toString().toDouble()
            var h = altura.text.toString().toDouble()

            var resultado = p / (h * h)

            res.text = resultado.toString()
        }
    }
}

