package com.example.namuiwan.Josue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.namuiwan.Josue.carlos.Adivina;
import com.example.namuiwan.Josue.carlos.Memoria;
import com.example.namuiwan.Josue.rompeca.Home;
import com.example.namuiwan.R;
import com.example.namuiwan.yatulve.Habilidadesnew;
import com.example.namuiwan.yatulve.Habilidadesve;

public class JuegosCJ extends AppCompatActivity {
    Button btnPuzzle, btnMemorie, btnAdivina, btnHabilidades;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos_cj);


        btnMemorie = findViewById(R.id.btnMemorie);
        btnMemorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Iniciando juego ...");
                iniciarjuego();
            }
        });
        btnPuzzle = findViewById(R.id.btnPuzzle);
        btnPuzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivityForResult(intent, 0);
            }
        });
        btnAdivina = findViewById(R.id.btnAdivina);
        btnAdivina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Adivina.class);
                startActivityForResult(intent, 0);
            }
        });
        btnHabilidades = findViewById(R.id.btnHabilidades);
        btnHabilidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Habilidadesnew.class);
                startActivityForResult(intent,0);
            }
        });



    }
    private void iniciarjuego () {
        Intent i = new Intent(this, Memoria.class);
        startActivity(i);
    }
}