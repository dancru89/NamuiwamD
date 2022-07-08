package com.example.namuiwan.yatulve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.namuiwan.R;

public class Habilidadesnew extends AppCompatActivity implements View.OnClickListener {

    ImageView imgNumeros, imgtitlealimentosfrios,imgFrutas;
    MediaPlayer pregunta1,pregunta2,pregunta3;
    public static  int  puntos=4;
    public static int puntosFrutas,puntosVerduras,PuntosNumeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habilidadesnew);
        referenciar();
    }

    private void referenciar() {
        imgNumeros = findViewById(R.id.imgNumeros);
        imgNumeros.setOnClickListener(this);
        imgtitlealimentosfrios = findViewById(R.id.imgtitlealimentosfrios);
        imgtitlealimentosfrios.setOnClickListener(this);
        imgFrutas = findViewById(R.id.imgFrutas);
        imgFrutas.setOnClickListener(this);

        pregunta1 = MediaPlayer.create(this, R.raw.pregunta1frutascualesuchuvave);
        pregunta2 = MediaPlayer.create(this,R.raw.pregunta1vegetcualesrepollo);
        pregunta3 = MediaPlayer.create(this, R.raw.pregunta1cualeseluno);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgFrutas:
                puntos = 4;
                Toast.makeText(Habilidadesnew.this, "¿Cual es la uchuva...?", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Habilidadesnew.this, Pregunta1frutas.class);
                startActivity(intent1);
                pregunta1.start();
                break;
            case R.id.imgtitlealimentosfrios:
                puntos = 4;
                Toast.makeText(Habilidadesnew.this, "¿Cual es el repollo...?", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Habilidadesnew.this, Pregunta1vegefrio.class);
                startActivity(intent2);
                pregunta2.start();
                break;
            case R.id.imgNumeros:
                puntos=0;
                Toast.makeText(Habilidadesnew.this, "¿Cual es el 1...?", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Habilidadesnew.this, Pregunta1numeros.class);
                startActivity(intent3);
                pregunta3.start();
                break;
        }
    }
}