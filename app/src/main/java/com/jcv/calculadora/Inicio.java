package com.jcv.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {
    public TextView rpta;
    private String operador;
    private Button btn_1;
    private Button btn_limpiador;
    private Button btn_suma;
    private Button btn_igual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        rpta = findViewById(R.id.respuesta);
        btn_1 = findViewById(R.id.btn1);

        btn_limpiador = findViewById(R.id.btn_limpiar);
        //operaciones
        btn_suma = findViewById(R.id.btn_suma);

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
                operador = "+";
            }
        });
        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operador.equals("+")){
                    int suma = 0;
                }
            }
        });
    }
}
