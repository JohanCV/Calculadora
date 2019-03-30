package com.jcv.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {
    public TextView rpta;
    private String operador;
    private double operadoruno;
    private double operadordos;
    private Button btn_1;
    private Button btn_limpiador;
    private Button btn_suma;
    private Button btn_igual;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        rpta = findViewById(R.id.respuesta);
        btn_1 = findViewById(R.id.btn1);

        btn_limpiador = findViewById(R.id.btn_limpiar);
        //operaciones
        btn_suma = findViewById(R.id.btn_suma);
        btn_igual = findViewById(R.id.btn_igual);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rpta.setText("1");
            }
        });

        btn_limpiador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rpta.setText("");
            }
        });
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = rpta.getText().toString();
                operadoruno = Double.parseDouble(numero);
                rpta.setText("+");
                operador = "+";
            }
        });
        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"btn igual",Toast.LENGTH_LONG).show();
                String numero =rpta.getText().toString();
                operadordos = Double.parseDouble(numero);
                if (operador.equals("+")){
                    double suma = 0.0;
                    suma = operadoruno + operadordos;

                    rpta.setText(String.valueOf(suma));
                }
            }
        });
    }
}
