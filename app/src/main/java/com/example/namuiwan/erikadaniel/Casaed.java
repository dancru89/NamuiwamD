package com.example.namuiwan.erikadaniel;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Casaed extends AppCompatActivity implements View.OnClickListener {

    ImageView btntierra, btnfamilia, btncuerpo, btnorientacion, btngeometrica, btndomestico;
    MediaPlayer animales, cuerpo, familia, orientacion, tierra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casaed);
        referenciar();
    }
    private void referenciar(){
        btntierra= findViewById(R.id.btntierra);
        btntierra.setOnClickListener(this);
        btnfamilia= findViewById(R.id.btnfamilia);
        btnfamilia.setOnClickListener(this);
        btncuerpo= findViewById(R.id.btncuerpo);
        btncuerpo.setOnClickListener(this);
        btnorientacion= findViewById(R.id.btnorientacion);
        btnorientacion.setOnClickListener(this);
        btngeometrica= findViewById(R.id.btngeometrica);
        btngeometrica.setOnClickListener(this);
        btndomestico= findViewById(R.id.btndomestico);
        btndomestico.setOnClickListener(this);

        animales = MediaPlayer.create(this, R.raw.animalesed);
        cuerpo = MediaPlayer.create(this, R.raw.cuerpoed);
        familia = MediaPlayer.create(this, R.raw.familiaed);
        orientacion = MediaPlayer.create(this, R.raw.orientacioned1);
        tierra = MediaPlayer.create(this, R.raw.tierraed);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btntierra:
                Intent intent = new Intent(Casaed.this, Bosqueed.class);
                startActivity(intent);
                tierra.start();
                break;

            case R.id.btnfamilia:
                Intent intent1 = new Intent(Casaed.this, Familiaed.class);
                startActivity(intent1);
                familia.start();
                break;

            case R.id.btncuerpo:
                Intent intent2 = new Intent(Casaed.this, Cuerpoed.class);
                startActivity(intent2);
                cuerpo.start();
                break;

            case R.id.btnorientacion:
                Intent intent3 = new Intent(Casaed.this, Orientacioned.class);
                startActivity(intent3);
                orientacion.start();
                break;

            case R.id.btngeometrica:
                Intent intent4 = new Intent(Casaed.this, Geometricaed.class);
                startActivity(intent4);

                break;
            case R.id.btndomestico:
                Intent intent5 = new Intent(Casaed.this, Domesticoed.class);
                startActivity(intent5);
                animales.start();
                break;



        }
    }
}