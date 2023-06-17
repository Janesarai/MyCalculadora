package com.example.mycalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se declaran text botones por id

        EditText numero1= findViewById(R.id.editTextNumber1);
        EditText numero2= findViewById(R.id.editTextNumber2);

        Button sumar = findViewById(R.id.suma);
        Button resta = findViewById(R.id.resta);
        Button multiplicacion = findViewById(R.id.multiplicacion);
        Button division = findViewById(R.id.division);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView resultado = findViewById(R.id.muestraresultado);


        // seton clic da comportamiento
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                    return;
                }

                Integer primer = Integer.parseInt(numero1.getText().toString());
                Integer segundo = Integer.parseInt(numero2.getText().toString());
                Integer suma = primer + segundo;
                resultado.setText("el resultado es"+ suma);


                Toast.makeText(getBaseContext(), "sumaste" + suma.toString(), Toast.LENGTH_LONG).show();
            }
        });


        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                    return;
                }

                Integer primer = Integer.parseInt(numero1.getText().toString());
                Integer segundo = Integer.parseInt(numero2.getText().toString());
                Integer resta = primer - segundo;
                resultado.setText("el resultado es"+ resta);

                Toast.makeText(getBaseContext(), "restaste", Toast.LENGTH_LONG).show();
            }
        });

        multiplicacion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            if(numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().trim().isEmpty()){
                Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                return;
            }

            Integer primer = Integer.parseInt(numero1.getText().toString());
            Integer segundo = Integer.parseInt(numero2.getText().toString());
            Integer multiplica = primer * segundo;
            resultado.setText("el resultado es"+ multiplica);

            Toast.makeText(getBaseContext(), "multiplicaste" + multiplica.toString(), Toast.LENGTH_LONG).show();
        }

        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if(numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().trim().isEmpty()){
                Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                return;
            }

            Integer primer = Integer.parseInt(numero1.getText().toString());
            if(Integer.parseInt(numero2.getText().toString())==0){
                Toast.makeText(getBaseContext(), "no se puede dividir por 0: " ,Toast.LENGTH_SHORT).show();
                return;
            }
            Integer segundo = Integer.parseInt(numero2.getText().toString());
            Integer divide = primer / segundo;
            resultado.setText("el resultado es"+ divide);

            Toast.makeText(getBaseContext(), "dividiste" + divide.toString(), Toast.LENGTH_LONG).show();

            }
        });

    }
}