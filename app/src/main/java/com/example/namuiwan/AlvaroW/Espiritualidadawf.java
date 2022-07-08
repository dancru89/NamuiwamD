package com.example.namuiwan.AlvaroW;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Espiritualidadawf extends AppCompatActivity implements View.OnClickListener {

    ImageView imglaguna,imgmontana,imgpetroglifo,imgojoagua, imgtraduccionsitios;
    MediaPlayer ojoawf,lagunaawf,montanaawf,petroawf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.espiritualidadawf);
        referenciar();
    }

    private void referenciar() {

        imgojoagua = findViewById(R.id.imgojoagua);
        imgojoagua.setOnClickListener(this);
        imglaguna = findViewById(R.id.imglaguna);
        imglaguna.setOnClickListener(this);
        imgmontana = findViewById(R.id.imgmontana);
        imgmontana.setOnClickListener(this);
        imgpetroglifo = findViewById(R.id.imgpetroglifo);
        imgpetroglifo.setOnClickListener(this);
        imgtraduccionsitios = findViewById(R.id.imgtraduccionsitios);
        imgtraduccionsitios.setOnClickListener(this);


        // almacenar sonidos
        ojoawf = MediaPlayer.create(this, R.raw.ojoawf);
        lagunaawf = MediaPlayer.create(this, R.raw.lagunaawf);
        montanaawf = MediaPlayer.create(this, R.raw.montanaawf);
        petroawf = MediaPlayer.create(this, R.raw.petroawf);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgojoagua:
                imgtraduccionsitios.setImageResource(R.drawable.ojodeaguaed);
                ojoawf.start();
                break;

            case R.id.imglaguna:
                imgtraduccionsitios.setImageResource(R.drawable.lagunaed);
                lagunaawf.start();
                break;

            case R.id.imgmontana:
                imgtraduccionsitios.setImageResource(R.drawable.montanaed);
                montanaawf.start();
                break;

            case R.id.imgpetroglifo:
                imgtraduccionsitios.setImageResource(R.drawable.petroglifosed);
                petroawf.start();
                break;



        }


    }
}