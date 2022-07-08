package com.example.namuiwan.AlvaroW;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Saludosawf extends AppCompatActivity implements View.OnClickListener{

    ImageView imgtraduccionsaludos, imgsaludoss, imgsaludosoleado, imgsaludofrio, imgsaludotarde, imgsaludonoche;

    MediaPlayer buencalido,buenfrio,buenatarde,buenanoche;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludosawf);

        referenciar();

    }

    private void referenciar() {

        imgtraduccionsaludos = findViewById(R.id.imgtraduccionsaludos);
        imgtraduccionsaludos.setOnClickListener(this);
        imgsaludoss = findViewById(R.id.imgsaludoss);
        imgsaludoss.setOnClickListener(this);
        imgsaludosoleado = findViewById(R.id.imgsaludosoleado);
        imgsaludosoleado.setOnClickListener(this);
        imgsaludofrio = findViewById(R.id.imgsaludofrio);
        imgsaludofrio.setOnClickListener(this);
        imgsaludotarde = findViewById(R.id.imgsaludotarde);
        imgsaludotarde.setOnClickListener(this);
        imgsaludonoche = findViewById(R.id.imgsaludonoche);
        imgsaludonoche.setOnClickListener(this);



        // almacenar sonidos

        buencalido = MediaPlayer.create(this, R.raw.pachito);
        buenfrio = MediaPlayer.create(this, R.raw.pishinto);
        buenatarde = MediaPlayer.create(this, R.raw.mawan);
        buenanoche = MediaPlayer.create(this, R.raw.yemkon);




    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgsaludosoleado:
                imgtraduccionsaludos.setImageResource(R.drawable.diaed);
                buencalido.start();
                break;

            case R.id.imgsaludofrio:
                imgtraduccionsaludos.setImageResource(R.drawable.lluviaed);
                buenfrio.start();
                break;

            case R.id.imgsaludotarde:
                imgtraduccionsaludos.setImageResource(R.drawable.tardeed);
                buenatarde.start();
                break;

            case R.id.imgsaludonoche:
                imgtraduccionsaludos.setImageResource(R.drawable.nocheed);
                buenanoche.start();
                break;


        }


    }






}