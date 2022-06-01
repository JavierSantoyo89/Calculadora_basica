package com.example.calculadorabasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Variable global del total y registro de operaciones //
    var total = "";
    var operaciones = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun suma(view: View){
        // Guarda en variables su respectivo boton en tipo integer //
        var boton0 = findViewById<Button>(R.id.btnZero)
            val numZero = boton0.text.toString().toInt()
        var boton1 = findViewById<Button>(R.id.btnOne)
            val numOne = boton1.text.toString().toInt()
        var boton2 = findViewById<Button>(R.id.btnTwo)
            val numTwo = boton2.text.toString().toInt()
        var boton3 = findViewById<Button>(R.id.btnThree)
            val numThree = boton3.text.toString().toInt()
        var boton4 = findViewById<Button>(R.id.btnFour)
            val numFour = boton4.text.toString().toInt()
        var boton5 = findViewById<Button>(R.id.btnFive)
            val numFive = boton5.text.toString().toInt()
        var boton6 = findViewById<Button>(R.id.btnSix)
            val numSix = boton6.text.toString().toInt()
        var boton7 = findViewById<Button>(R.id.btnSeven)
            val numSeven = boton7.text.toString().toInt()
        var boton8 = findViewById<Button>(R.id.btnEigth)
            val numEight = boton8.text.toString().toInt()
        var boton9 = findViewById<Button>(R.id.btnNine)
            val numNine = boton9.text.toString().toInt()
        var botonSuma = findViewById<Button>(R.id.btnPlus)
            val numSuma = botonSuma.text.toString().toInt()

        // Imprime en el textview el valor de la varable "total" //
        findViewById<TextView>(R.id.tvResult).text =  total
    }

}