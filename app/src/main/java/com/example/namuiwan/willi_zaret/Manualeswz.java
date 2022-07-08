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

public class Manualeswz extends AppCompatActivity implements View.OnClickListener {
    ImageButton imgBtnMochila, imgBtnChumbe, imgBtnSombrero;
    ImageView imgtraduccionmanuales;
    MediaPlayer mochilawz,chumbewz,sombrerowz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manualeswz);
        references();
    }

    public void references(){
        imgBtnChumbe=findViewById(R.id.imgBtnChumbe);
        imgBtnChumbe.setOnClickListener(this);
        imgBtnMochila=findViewById(R.id.imgBtnMochila);
        imgBtnMochila.setOnClickListener(this);
        imgBtnSombrero=findViewById(R.id.imgBtnSombrero);
        imgBtnSombrero.setOnClickListener(this);
        imgtraduccionmanuales=findViewById(R.id.imgtraduccionmanuales);
        imgtraduccionmanuales.setOnClickListener(this);



        mochilawz=MediaPlayer.create(this,R.raw.mochila);
        chumbewz=MediaPlayer.create(this,R.raw.chumbe);
        sombrerowz=MediaPlayer.create(this,R.raw.sombrerowx);
    }

    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgBtnChumbe:
                imgtraduccionmanuales.setImageResource(R.drawable.btnchumbewz);
                chumbewz.start();
                break;
            case R.id.imgBtnMochila:
                imgtraduccionmanuales.setImageResource(R.drawable.btnmochilawz);
                mochilawz.start();
                break;
            case R.id.imgBtnSombrero:
                imgtraduccionmanuales.setImageResource(R.drawable.btnsombrerowz);
                sombrerowz.start();
                break;


        }


    }
}