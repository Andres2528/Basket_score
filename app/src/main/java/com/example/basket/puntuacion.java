package com.example.basket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class puntuacion extends AppCompatActivity {

    TextView resultados, resultadosNumeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntuacion);

        resultadosNumeros = findViewById(R.id.puntuacionnum);
        resultados = findViewById(R.id.resultadoinfo);

        Bundle extras = getIntent().getExtras();
        String resnum = extras.getString("puntajesfinales");
        String restexto = extras.getString("informacionfinal");

        resultadosNumeros.setText(resnum);
        resultados.setText(restexto);
    }
}