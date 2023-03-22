package com.example.basket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView puntuaciolocal, puntuacionvisitante;

    int puntualocal;
    int puntuavisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puntuaciolocal = findViewById(R.id.puntuacion);
        puntuacionvisitante = findViewById(R.id.vpuntuacion);

        puntualocal = Integer.parseInt(puntuaciolocal.getText().toString());
        puntuavisitante = Integer.parseInt(puntuacionvisitante.getText().toString());
    }

    public void menosunol(View v){
        if (puntualocal > 0){
            puntualocal = puntualocal - 1;
        }
        puntuaciolocal.setText(String.valueOf(puntualocal));
    }

    public void masunol(View v){
        puntualocal = puntualocal + 1;
        puntuaciolocal.setText(String.valueOf(puntualocal));
    }

    public void masdosl(View v){
        puntualocal = puntualocal + 2;
        puntuaciolocal.setText(String.valueOf(puntualocal));
    }

    public void limpiar(View v){
        puntualocal = 0;
        puntuavisitante = 0;
        puntuaciolocal.setText("0");
        puntuacionvisitante.setText("0");
    }

    public void menosunov(View v){
        if (puntuavisitante > 0){
            puntuavisitante = puntuavisitante - 1;
        }
        puntuacionvisitante.setText(String.valueOf(puntuavisitante));
    }

    public void masunov(View v){
        puntuavisitante = puntuavisitante + 1;
        puntuacionvisitante.setText(String.valueOf(puntuavisitante));
    }

    public void masdosv(View v){
        puntuavisitante = puntuavisitante + 2;
        puntuacionvisitante.setText(String.valueOf(puntuavisitante));
    }

    public void abrir (View v){
        String texto = "";
        String puntajes = "";

        if(puntualocal == puntuavisitante){
            texto = "EMPATE";
        } else if (puntualocal > puntuavisitante) {
            texto = "GANA LOCAL";
        }else {
            texto = "GANA VISITANTE";
        }

        puntajes = String.valueOf(puntualocal) + "-" + String.valueOf(puntuavisitante);

        Intent open = new Intent(this, puntuacion.class);
        open.putExtra("informacionfinal", texto);
        open.putExtra("puntajesfinales", puntajes);
        startActivity(open);
    }

}