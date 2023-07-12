package com.example.mycalculadora

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //se declaran text botones por id
        val numero1 = findViewById<EditText>(R.id.editTextNumber1)
        val numero2 = findViewById<EditText>(R.id.editTextNumber2)
        val sumar = findViewById<Button>(R.id.suma)
        val resta = findViewById<Button>(R.id.resta)
        val multiplicacion = findViewById<Button>(R.id.multiplicacion)
        val division = findViewById<Button>(R.id.division)
        @SuppAQWressLint("MissingInflatedId", "LocalSuppress") val resultado = findViewById<TextView>(R.id.muestraresultado)


        // seton clic da comportamiento
        sumar.setOnClickListener(View.OnClickListener {
            if (numero1.text.toString().trim { it <= ' ' }.isEmpty() || numero2.text.toString().trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = numero1.text.toString().toInt()
            val segundo = numero2.text.toString().toInt()
            val suma = primer + segundo
            resultado.text = "el resultado es$suma"
            Toast.makeText(baseContext, "sumaste$suma", Toast.LENGTH_LONG).show()
        })
        resta.setOnClickListener(View.OnClickListener {
            if (numero1.text.toString().trim { it <= ' ' }.isEmpty() || numero2.text.toString().trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = numero1.text.toString().toInt()
            val segundo = numero2.text.toString().toInt()
            val resta = primer - segundo
            resultado.text = "el resultado es$resta"
            Toast.makeText(baseContext, "restaste", Toast.LENGTH_LONG).show()
        })
        multiplicacion.setOnClickListener(View.OnClickListener {
            if (numero1.text.toString().trim { it <= ' ' }.isEmpty() || numero2.text.toString().trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = numero1.text.toString().toInt()
            val segundo = numero2.text.toString().toInt()
            val multiplica = primer * segundo
            resultado.text = "el resultado es$multiplica"
            Toast.makeText(baseContext, "multiplicaste$multiplica", Toast.LENGTH_LONG).show()
        })
        division.setOnClickListener(View.OnClickListener {
            if (numero1.text.toString().trim { it <= ' ' }.isEmpty() || numero2.text.toString().trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = numero1.text.toString().toInt()
            if (numero2.text.toString().toInt() == 0) {
                Toast.makeText(baseContext, "no se puede dividir por 0: ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val segundo = numero2.text.toString().toInt()
            val divide = primer / segundo
            resultado.text = "el resultado es$divide"
            Toast.makeText(baseContext, "dividiste$divide", Toast.LENGTH_LONG).show()
        })
    }
}