package com.example.namuiwan.yatulve;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

import java.util.Timer;
import java.util.TimerTask;

public class Frutas extends AppCompatActivity implements View.OnClickListener {
    ImageView imgUchuvas, imgMora, imgMortino, imgFresas,imgPregunta,titlemora,titlefresas,titlemortino,titleuchuvas;
    MediaPlayer uchuvas, mora, mortino, fresas, pregunta1;
    int valor = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutasve);
        referenciar();
    }
    private void referenciar(){
        imgPregunta = findViewById(R.id.imgPregunta);
        imgPregunta.setOnClickListener(this);
        imgUchuvas= findViewById(R.id.imgUchuvas);
        imgUchuvas.setOnClickListener(this);
        imgMora=findViewById(R.id.imgMora);
        imgMora.setOnClickListener(this);
        imgMortino=findViewById(R.id.imgMortino);
        imgMortino.setOnClickListener(this);
        imgFresas=findViewById(R.id.imgFresas);
        imgFresas.setOnClickListener(this);

        titlefresas=findViewById(R.id.titlefresas);
        titlefresas.setOnClickListener(this);
        titlemora=findViewById(R.id.titlemora);
        titlemora.setOnClickListener(this);
        titlemortino=findViewById(R.id.titlemortino);
        titlemortino.setOnClickListener(this);
        titleuchuvas=findViewById(R.id.titleuchuvas);
        titleuchuvas.setOnClickListener(this);


        uchuvas = MediaPlayer.create(this,R.raw.uchuvave);
        mora = MediaPlayer.create(this,R.raw.morave);
        mortino = MediaPlayer.create(this,R.raw.mortinove);
        fresas = MediaPlayer.create(this,R.raw.fresasve);
        pregunta1 = MediaPlayer.create(this, R.raw.pregunta1frutascualesuchuvave);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgPregunta:
                   Toast.makeText(Frutas.this, "¿Cual es la uchuva...?", Toast.LENGTH_SHORT).show();
                   Intent intent1 = new Intent(Frutas.this, Pregunta1frutas.class);
                   startActivity(intent1);
                   pregunta1.start();
                   valor = 1;
                break;

            case R.id.imgUchuvas:
                titlemora.setVisibility(View.INVISIBLE);
                titlemortino.setVisibility(View.INVISIBLE);
                titlefresas.setVisibility(View.INVISIBLE);
                titleuchuvas.setVisibility(View.VISIBLE);
                uchuvas.start();
                /*TimerTask esperar1 = new TimerTask() {
                    @Override
                    public void run() {
                        titleuchuvas.setVisibility(View.INVISIBLE);

                    }
                };
                Timer timer1 = new Timer();
                timer1.schedule(esperar1,1400);*/
                break;

            case R.id.imgMora:
                titlemortino.setVisibility(View.INVISIBLE);
                titlefresas.setVisibility(View.INVISIBLE);
                titleuchuvas.setVisibility(View.INVISIBLE);
                titlemora.setVisibility(View.VISIBLE);
                mora.start();
                /*TimerTask esperar2 = new TimerTask() {
                    @Override
                    public void run() {
                        titlemora.setVisibility(View.INVISIBLE);
                    }
                };
                Timer timer2 = new Timer();
                timer2.schedule(esperar2,1400);*/
                break;

            case R.id.imgMortino:
                titlefresas.setVisibility(View.INVISIBLE);
                titleuchuvas.setVisibility(View.INVISIBLE);
                titlemora.setVisibility(View.INVISIBLE);
                titlemortino.setVisibility(View.VISIBLE);
                mortino.start();
                /*TimerTask esperar3 = new TimerTask() {
                    @Override
                    public void run() {
                        titlemortino.setVisibility(View.INVISIBLE);
                    }
                };
                Timer timer3 = new Timer();
                timer3.schedule(esperar3,1400);*/
                break;
            case R.id.imgFresas:
                titleuchuvas.setVisibility(View.INVISIBLE);
                titlemora.setVisibility(View.INVISIBLE);
                titlemortino.setVisibility(View.INVISIBLE);
                titlefresas.setVisibility(View.VISIBLE);
                fresas.start();

                /*TimerTask esperar4 = new TimerTask() {
                    @Override
                    public void run() {
                        titlefresas.setVisibility(View.INVISIBLE);
                    }
                };
                Timer timer4 = new Timer();
                timer4.schedule(esperar4,1400);*/
                break;
        }
    }
}