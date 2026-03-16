package com.example.kotlin02_cambioapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Implementacoes:
        val botaoConverter = findViewById<Button>(R.id.Button01)
        botaoConverter.setOnClickListener {
            convert()
        }
    }

    fun convert() {
        val input = findViewById<EditText>(R.id.EditText01)
        val output = findViewById<TextView>(R.id.TextView02)

        if(input.length() == 0) {
            Toast.makeText(this, "Forneca algum valor em Dolar!", Toast.LENGTH_SHORT).show()
            output.text = "R$ 00,00"
        }
        else {
            val dolar = input.text.toString().toDouble()
            val real = dolar * 5.5
            output.text = "R$ $real"
        }
    }
}