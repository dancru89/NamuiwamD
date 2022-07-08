package com.example.namuiwan.yatulve;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Numeros extends AppCompatActivity implements View.OnClickListener {

    ImageView  imgUno, imgDos, imgTres, imgCuatro, imgCinco, imgSeis, imgSiete,
               imgOcho, imgNueve, imgDiez, imgOnce, imgDoce, imgTrece, imgCatorce, imgQuince, imgDiesciseis,
               imgDiescisiete, imgDiesciocho, imgDiescinueve, imgVeinte,imgPregunta;
    MediaPlayer serpiente, sonido, num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,
                num12,num13,num14,num15,num16,num17,num18,num19,num20,pregunta1 ;
    MediaPlayer sounds[] = new MediaPlayer[1];
    MediaPlayer numero[] = new MediaPlayer[20];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerosve);
        referenciar();
    }

    private void referenciar() {
        numero[1]=MediaPlayer.create(this, R.raw.unove);
        numero[2]=MediaPlayer.create(this, R.raw.dosve);
        numero[3]=MediaPlayer.create(this, R.raw.tresve);
        numero[4]=MediaPlayer.create(this, R.raw.cuatrove);
        numero[5]=MediaPlayer.create(this, R.raw.cincove);
        numero[6]=MediaPlayer.create(this, R.raw.seisve);
        numero[7]=MediaPlayer.create(this, R.raw.sieteve);
        numero[8]=MediaPlayer.create(this, R.raw.ochove);
        numero[9]=MediaPlayer.create(this, R.raw.nueveve);
        numero[10]=MediaPlayer.create(this, R.raw.diezve);
        numero[11]=MediaPlayer.create(this, R.raw.onceve);
        numero[12]=MediaPlayer.create(this, R.raw.doceve);
        numero[13]=MediaPlayer.create(this, R.raw.treceve);
        numero[14]=MediaPlayer.create(this, R.raw.catorceve);
        numero[15]=MediaPlayer.create(this, R.raw.quinceve);
        numero[16]=MediaPlayer.create(this, R.raw.diescieisve);
        numero[17]=MediaPlayer.create(this, R.raw.diescisieteve);
        numero[18]=MediaPlayer.create(this, R.raw.diesciochove);
        numero[19]=MediaPlayer.create(this, R.raw.diescinueveve);
        numero[0]=MediaPlayer.create(this, R.raw.veinteve);


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
        imgDiesciocho = findViewById(R.id.imgDiesciocho);
        imgDiesciocho.setOnClickListener(this);
        imgDiescinueve = findViewById(R.id.imgDiescinueve);
        imgDiescinueve.setOnClickListener(this);
        imgVeinte = findViewById(R.id.imgVeinte);
        imgVeinte.setOnClickListener(this);
        imgPregunta = findViewById(R.id.imgPregunta);
        imgPregunta.setOnClickListener(this);

        sounds[0]=MediaPlayer.create(this,R.raw.numerosve);
        sonido = MediaPlayer.create(this, R.raw.numerosve);
        pregunta1 = MediaPlayer.create(this, R.raw.pregunta1cualeseluno);

        /* num1 = MediaPlayer.create(this, R.raw.unove);
        num2 = MediaPlayer.create(this, R.raw.dosve);
        num3 = MediaPlayer.create(this, R.raw.treceve);
        num4 = MediaPlayer.create(this, R.raw.cuatrove);
        num5 = MediaPlayer.create(this, R.raw.cincove);
        num6 = MediaPlayer.create(this, R.raw.seisve);
        num7 = MediaPlayer.create(this, R.raw.sieteve);
        num8 = MediaPlayer.create(this, R.raw.ochove);
        num9 = MediaPlayer.create(this, R.raw.nueveve);
        num10 = MediaPlayer.create(this, R.raw.diezve);
        num11 = MediaPlayer.create(this, R.raw.onceve);
        num12 = MediaPlayer.create(this, R.raw.doceve);
        num13 = MediaPlayer.create(this, R.raw.treceve);
        num14 = MediaPlayer.create(this, R.raw.catorceve);
        num15 = MediaPlayer.create(this, R.raw.quinceve);
        num16 = MediaPlayer.create(this, R.raw.diescieisve);
        num17 = MediaPlayer.create(this, R.raw.diescisieteve);
        num18 = MediaPlayer.create(this, R.raw.diesciochove);
        num19 = MediaPlayer.create(this, R.raw.diescinueveve);
        num20 = MediaPlayer.create(this, R.raw.veinteve);*/
        serpiente = MediaPlayer.create(this, R.raw.numerosve);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgPregunta:
                Toast.makeText(Numeros.this, "¿Cual es el 1...?", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Numeros.this, Pregunta1numeros.class);
                startActivity(intent1);
                pregunta1.start();
                break;
            case R.id.imgUno:

                numero[1].start();

                break;
            case R.id.imgDos:

                numero[2].start();
                break;
            case R.id.imgTres:
                numero[3].start();

                break;
            case R.id.imgCuatro:
                numero[4].start();
                break;
            case R.id.imgCinco:
                numero[5].start();
                break;
            case R.id.imgSeis:
                numero[6].start();
                break;
            case R.id.imgSiete:
                numero[7].start();
                break;
            case R.id.imgOcho:
                numero[8].start();
                break;
            case R.id.imgNueve:
                numero[9].start();
                break;
            case R.id.imgDiez:
                numero[10].start();
                break;
            case R.id.imgOnce:
                numero[11].start();
                break;
            case R.id.imgDoce:
                numero[12].start();
                break;
            case R.id.imgTrece:
                numero[13].start();
                break;
            case R.id.imgCatorce:
                numero[14].start();
                break;
            case R.id.imgQuince:
                numero[15].start();
                break;
            case R.id.imgDiesciseis:
                numero[16].start();
                break;
            case R.id.imgDiescisiete:
                numero[17].start();
                break;
            case R.id.imgDiesciocho:
                numero[18].start();
                break;
            case R.id.imgDiescinueve:
                numero[19].start();
                break;
            case R.id.imgVeinte:
                numero[0].start();
                break;
        }
    }
}
