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

public class ManualesTelarwz extends AppCompatActivity implements View.OnClickListener {
    ImageButton imgBtnRuana, imgBtnAnanco, imgBtnBufanda;
    ImageView imgtraducciontelar;
    MediaPlayer anaco,ruana,bufanda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manuales_telarwz);
        references();
    }
    public void references(){
        imgBtnAnanco=findViewById(R.id.imgBtnAnaco);
        imgBtnAnanco.setOnClickListener(this);
        imgBtnBufanda=findViewById(R.id.imgBtnBufanda);
        imgBtnBufanda.setOnClickListener(this);
        imgBtnRuana=findViewById(R.id.imgBtnRuana);
        imgBtnRuana.setOnClickListener(this);

        imgtraducciontelar=findViewById(R.id.imgtraducciontelar);
        imgtraducciontelar.setOnClickListener(this);

        anaco=MediaPlayer.create(this,R.raw.anaco);
        ruana=MediaPlayer.create(this,R.raw.bufanda);
        bufanda=MediaPlayer.create(this,R.raw.turi);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgBtnAnaco:
                imgtraducciontelar.setImageResource(R.drawable.btnrebosowz);
                anaco.start();
                break;
            case R.id.imgBtnBufanda:
                imgtraducciontelar.setImageResource(R.drawable.btnbufandawz);
                ruana.start();
                break;
            case R.id.imgBtnRuana:
                imgtraducciontelar.setImageResource(R.drawable.btnruanawz);
                bufanda.start();
                break;


        }


    }
}