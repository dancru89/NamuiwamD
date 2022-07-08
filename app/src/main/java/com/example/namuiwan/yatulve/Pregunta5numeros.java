package com.example.namuiwan.yatulve;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

import java.util.Timer;
import java.util.TimerTask;

public class Pregunta5numeros extends AppCompatActivity implements View.OnClickListener{

    ImageView imgUno, imgDos, imgTres, imgCuatro, imgCinco, imgSeis, imgSiete,
            imgOcho, imgNueve, imgDiez, imgOnce, imgDoce, imgTrece, imgCatorce, imgQuince, imgDiesciseis,
            imgDiescisiete, imgDiesciocho, imgDiescinueve, imgVeinte,imgParlanteve,imageView4;
    MediaPlayer correcto,incorrecto, sonido, pregunta5,num01,num02,num03,num04,num05,
            num06,num07,num08,num09,num10,num11,num12,num13,num14,num15,num16,num17,num18,num19,num20;
    TextView txtPuntos;
    int puntos =Habilidadesnew.puntos;

    //MediaPlayer num[] = new MediaPlayer[25];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta5numeros);
        txtPuntos =findViewById(R.id.txtPuntos);
        txtPuntos.setText(""+puntos);
        referenciar();
    }

    private void referenciar() {
        correcto = MediaPlayer.create(this,R.raw.correctove);
        incorrecto=MediaPlayer.create(this,R.raw.incorrectove);

        num01=MediaPlayer.create(this, R.raw.unove);
        num02=MediaPlayer.create(this, R.raw.dosve);
        num03=MediaPlayer.create(this, R.raw.tresve);
        num04=MediaPlayer.create(this, R.raw.cuatrove);
        num05=MediaPlayer.create(this, R.raw.cincove);
        num06=MediaPlayer.create(this, R.raw.seisve);
        num07=MediaPlayer.create(this, R.raw.sieteve);
        num08=MediaPlayer.create(this, R.raw.ochove);
        num09=MediaPlayer.create(this, R.raw.nueveve);
        num10=MediaPlayer.create(this, R.raw.diezve);
        num11=MediaPlayer.create(this, R.raw.onceve);
        num12=MediaPlayer.create(this, R.raw.doceve);
        num13=MediaPlayer.create(this, R.raw.treceve);
        num14=MediaPlayer.create(this, R.raw.catorceve);
        num15=MediaPlayer.create(this, R.raw.quinceve);
        num16=MediaPlayer.create(this, R.raw.diescieisve);
        num17=MediaPlayer.create(this, R.raw.diescisieteve);
        num18=MediaPlayer.create(this,R.raw.diesciochove);
        num19=MediaPlayer.create(this,R.raw.diescinueveve);
        num20=MediaPlayer.create(this,R.raw.veinteve);
        sonido=MediaPlayer.create(this,R.raw.numerosve);

        pregunta5 = MediaPlayer.create(this,R.raw.pregunta5cualeselocho);

        imgUno = findViewById(R.id.imgUno);
        imgUno.setOnClickListener(this);
        imgDos = findViewById(R.id.imgDos);
        imgDos.setOnClickListener(this);
        imgTres = findViewById(R.id.imgTres);
        imgTres.setOnClickListener(this);
        imgCuatro = findViewById(R.id.imgCuatro);
        imgCuatro.setOnClickListener(this);
        imgCinco = findViewById(R.id.imgCinco);
        imgCinco.setOnClickListener(this);
        imgSeis = findViewById(R.id.imgSeis);
        imgSeis.setOnClickListener(this);
        imgSiete = findViewById(R.id.imgSiete);
        imgSiete.setOnClickListener(this);
        imgOcho = findViewById(R.id.imgOcho);
        imgOcho.setOnClickListener(this);
        imgNueve = findViewById(R.id.imgNueve);
        imgNueve.setOnClickListener(this);
        imgDiez = findViewById(R.id.imgDiez);
        imgDiez.setOnClickListener(this);
        imgOnce = findViewById(R.id.imgOnce);
        imgOnce.setOnClickListener(this);
        imgDoce = findViewById(R.id.imgDoce);
        imgDoce.setOnClickListener(this);
        imgTrece = findViewById(R.id.imgTrece);
        imgTrece.setOnClickListener(this);
        imgCatorce = findViewById(R.id.imgCatorce);
        imgCatorce.setOnClickListener(this);
        imgQuince = findViewById(R.id.imgQuince);
        imgQuince.setOnClickListener(this);
        imgDiesciseis = findViewById(R.id.imgDiesciseis);
        imgDiesciseis.setOnClickListener(this);
        imgDiescisiete = findViewById(R.id.imgDiescisiete);
        imgDiescisiete.setOnClickListener(this);
        imgDiesciocho =findViewById(R.id.imgDiesciocho);
        imgDiesciocho.setOnClickListener(this);
        imgDiescinueve = findViewById(R.id.imgDiescinueve);
        imgDiescinueve.setOnClickListener(this);
        imgVeinte = findViewById(R.id.imgVeinte);
        imgVeinte.setOnClickListener(this);
        imgParlanteve = findViewById(R.id.imgParlanteve);
        imgParlanteve.setOnClickListener(this);
        imageView4=findViewById(R.id.imageView4);
        imageView4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgParlanteve:
                Toast.makeText(this, "¿Cual es el número 8...?", Toast.LENGTH_SHORT).show();
                hacerSonarNumero(pregunta5);
                break;
            case R.id.imgUno:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num01);
                break;
            case R.id.imgDos:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num02);
                break;
            case R.id.imgTres:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num03);
                break;
            case R.id.imgCuatro:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num04);
                break;
            case R.id.imgCinco:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num05);
                break;
            case R.id.imgSeis:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num06);
                break;
            case R.id.imgSiete:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num07);
                break;
            case R.id.imgOcho:
                puntos = puntos + 2;
                txtPuntos.setText(" "+puntos);
                Habilidadesnew.puntos = puntos;
                correcto.start();
                Intent intent = new Intent(Pregunta5numeros.this, Resultado.class);
                startActivity(intent);
                break;
            case R.id.imgNueve:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num09);
                break;
            case R.id.imgDiez:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num10);
                break;
            case R.id.imgOnce:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num11);
                break;
            case R.id.imgDoce:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num12);
                break;
            case R.id.imgTrece:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num13);
                break;
            case R.id.imgCatorce:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num14);
                break;
            case R.id.imgQuince:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num15);
                break;
            case R.id.imgDiesciseis:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num16);
                break;
            case R.id.imgDiescisiete:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num17);
                break;
            case R.id.imgDiesciocho:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num18);
                break;
            case R.id.imgDiescinueve:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num19);
                break;
            case R.id.imgVeinte:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                hacerSonarNumero(num20);
                break;
            case R.id.imageView4:
                Toast.makeText(this, "numeros...?", Toast.LENGTH_SHORT).show();
                hacerSonarNumero(sonido);
                break;
        }
    }

    private void hacerSonarNumero(MediaPlayer number) {
        TimerTask espera = new TimerTask() {
            @Override
            public void run() {

                number.start();
            }
        };
        Timer timer = new Timer();
        timer.schedule(espera,1000);
    }
}