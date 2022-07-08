package com.example.namuiwan.yatulve;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

import java.util.Timer;
import java.util.TimerTask;

public class Herramientas extends AppCompatActivity implements View.OnClickListener {
    ImageView imgAzadon, imgHacha,imgMachete,imgPala,imgtitleazadon,imgtitlehacha,imgtitlemachete,imgtitlepala;
    MediaPlayer azadon, hacha, machete,pala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramientasve);
        referenciar();
    }
    private void referenciar(){
        imgtitleazadon=findViewById(R.id.imgtitleazadon);
        imgtitleazadon.setOnClickListener(this);
        imgtitlehacha=findViewById(R.id.imgtitlehacha);
        imgtitlehacha.setOnClickListener(this);
        imgtitlemachete=findViewById(R.id.imgtitlemachete);
        imgtitlemachete.setOnClickListener(this);
        imgtitlepala=findViewById(R.id.imgtitlepala);
        imgtitlepala.setOnClickListener(this);
        imgAzadon=findViewById(R.id.imgAzadon);
        imgAzadon.setOnClickListener(this);
        imgHacha=findViewById(R.id.imgHacha);
        imgHacha.setOnClickListener(this);
        imgMachete=findViewById(R.id.imgMachete);
        imgMachete.setOnClickListener(this);
        imgPala=findViewById(R.id.imgPala);
        imgPala.setOnClickListener(this);

        //almacena sonido en la variable gallina
        azadon = MediaPlayer.create(this,R.raw.anchul_kachull);
        hacha = MediaPlayer.create(this,R.raw.walom);
        machete = MediaPlayer.create(this,R.raw.awinchi);
        pala = MediaPlayer.create(this,R.raw.ol_kachul);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgAzadon:
                imgtitlemachete.setVisibility(View.INVISIBLE);
                imgtitlepala.setVisibility(View.INVISIBLE);
                imgtitlehacha.setVisibility(View.INVISIBLE);
                imgtitleazadon.setVisibility(View.VISIBLE);
                azadon.start();
                /*TimerTask esperar1 = new TimerTask() {
                    @Override
                    public void run() {
                        imgtitleazadon.setVisibility(View.INVISIBLE);
                    }
                };
                Timer timer1 = new Timer();
                timer1.schedule(esperar1,1400);*/
                break;
            case R.id.imgHacha:
                imgtitlemachete.setVisibility(View.INVISIBLE);
                imgtitlepala.setVisibility(View.INVISIBLE);
                imgtitleazadon.setVisibility(View.INVISIBLE);
                imgtitlehacha.setVisibility(View.VISIBLE);
                hacha.start();
                break;
            case R.id.imgMachete:
                imgtitlepala.setVisibility(View.INVISIBLE);
                imgtitleazadon.setVisibility(View.INVISIBLE);
                imgtitlehacha.setVisibility(View.INVISIBLE);
                imgtitlemachete.setVisibility(View.VISIBLE);
                machete.start();

                break;
            case R.id.imgPala:
                imgtitlemachete.setVisibility(View.INVISIBLE);
                imgtitleazadon.setVisibility(View.INVISIBLE);
                imgtitlehacha.setVisibility(View.INVISIBLE);
                imgtitlepala.setVisibility(View.VISIBLE);
                pala.start();

                break;
        }
    }
}