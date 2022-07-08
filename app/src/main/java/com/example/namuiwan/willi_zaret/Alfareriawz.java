package com.example.namuiwan.willi_zaret;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.namuiwan.R;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Alfareriawz extends AppCompatActivity implements View.OnClickListener {
ImageButton imgBtnOlla, imgBtnPlato, imgBtntnPaila;
ImageView imgtraduccionalfareria;
MediaPlayer olla,plato,paila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfareriawz);
        references();

    }

    public void references(){
        imgBtnOlla=findViewById(R.id.imgBtnOlla);
        imgBtnOlla.setOnClickListener(this);

        imgBtntnPaila=findViewById(R.id.imgBtntnPaila);
        imgBtntnPaila.setOnClickListener(this);

        imgBtnPlato=findViewById(R.id.imgBtnPlato);
        imgBtnPlato.setOnClickListener(this);

        imgtraduccionalfareria = findViewById(R.id.imgtraduccionalfareria);
        imgtraduccionalfareria.setOnClickListener(this);


        olla=MediaPlayer.create(this,R.raw.olla);
        paila=MediaPlayer.create(this,R.raw.paila);
        plato=MediaPlayer.create(this,R.raw.nintak);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgBtnOlla:
                imgtraduccionalfareria.setImageResource(R.drawable.btnollawz);
                olla.start();
                break;

            case R.id.imgBtntnPaila:
                imgtraduccionalfareria.setImageResource(R.drawable.btnpailawz);
                paila.start();
                break;
            case R.id.imgBtnPlato:
                imgtraduccionalfareria.setImageResource(R.drawable.btnplatowz);
                plato.start();
                break;


        }


    }
}
