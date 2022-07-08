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

public class Frio extends AppCompatActivity implements View.OnClickListener {
    ImageView imgUlluco,imgPapaColorada,imgPapaAmarilla,imgRepollo, imgPregunta,imgtitlerepollo,imgtitlepapaamarilla,imgtitlepapacolorada,imgtitleullucos, imgtitlealimentosfrios;
    MediaPlayer ulluco,papacolorada,papaamarilla,repollo,pregunta1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friove);
        referenciar();
    }
    private void referenciar() {
        imgPregunta = findViewById(R.id.imgPregunta);
        imgPregunta.setOnClickListener(this);
        imgUlluco = findViewById(R.id.imgUlluco);
        imgUlluco.setOnClickListener(this);
        imgPapaColorada = findViewById(R.id.imgPapaColorada);
        imgPapaColorada.setOnClickListener(this);
        imgPapaAmarilla   = findViewById(R.id.imgPapaAmarilla);
        imgPapaAmarilla.setOnClickListener(this);
        imgRepollo    = findViewById(R.id.imgRepollo);
        imgRepollo.setOnClickListener(this);
       /* imgtitlerepollo = findViewById(R.id.imgtitlerepollo);
        imgtitlerepollo.setOnClickListener(this);
        imgtitlepapaamarilla = findViewById(R.id.imgtitlepapaamarilla);
        imgtitlepapaamarilla.setOnClickListener(this);
        imgtitlepapacolorada = findViewById(R.id.imgtitlepapacolorada);
        imgtitlepapacolorada.setOnClickListener(this);
        imgtitleullucos = findViewById(R.id.imgtitleullucos);
        imgtitleullucos.setOnClickListener(this);*/
        imgtitlealimentosfrios = findViewById(R.id.imgtitlealimentosfrios);
        imgtitlealimentosfrios.setOnClickListener(this);



        //almacena sonido en la variable gallina
        ulluco    = MediaPlayer.create(this,R.raw.lau);
        papacolorada  = MediaPlayer.create(this,R.raw.pikoye);
        papaamarilla       = MediaPlayer.create(this,R.raw.maiye);
        repollo      = MediaPlayer.create(this,R.raw.tulurmon);
        pregunta1 = MediaPlayer.create(this,R.raw.pregunta1vegetcualesrepollo);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgPregunta:
                Toast.makeText(Frio.this, "¿Cual es el repollo...?", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Frio.this, Pregunta1vegefrio.class);
                startActivity(intent1);
                pregunta1.start();
                break;

            case R.id.imgUlluco:
                imgtitlealimentosfrios.setImageResource(R.drawable.titleullucosve);
                ulluco.start();
                break;
            case R.id.imgPapaColorada:
                imgtitlealimentosfrios.setImageResource(R.drawable.titlepapacoloradave);
                papacolorada.start();
                break;
            case R.id.imgPapaAmarilla:
                imgtitlealimentosfrios.setImageResource(R.drawable.titlepapaamarillave);
                papaamarilla.start();
                break;
            case R.id.imgRepollo:
                imgtitlealimentosfrios.setImageResource(R.drawable.titlerepollove);
                repollo.start();
                break;
        }
    }
}