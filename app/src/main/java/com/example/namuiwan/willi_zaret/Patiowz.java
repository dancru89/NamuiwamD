package com.example.namuiwan.willi_zaret;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Patiowz extends AppCompatActivity implements View.OnClickListener {
    ImageButton imgBtnAlfareria, imgBtnManualesTelar, imgBtnManuales;
    MediaPlayer patiowz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patiowz);
        references();
    }


    public void references(){
        imgBtnAlfareria=findViewById(R.id.imgBtnAlfareria);
        imgBtnAlfareria.setOnClickListener(this);

        imgBtnManuales=findViewById(R.id.imgBtnManuales);
        imgBtnManuales.setOnClickListener(this);

        imgBtnManualesTelar=findViewById(R.id.imgBtnManualesTelar);
        imgBtnManualesTelar.setOnClickListener(this);

        patiowz=MediaPlayer.create(this,R.raw.patiowz);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.imgBtnAlfareria:
                Toast.makeText(Patiowz.this, "A selecionado Alfareria", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Patiowz.this, Alfareriawz.class);
                startActivity(intent);
                break;
            case R.id.imgBtnManuales:
                Toast.makeText(Patiowz.this, "A selecionado Manuales", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Patiowz.this, Manualeswz.class);
                startActivity(intent2);
                break;

            case R.id.imgBtnManualesTelar:
                Toast.makeText(Patiowz.this, "A selecionado Manuales en telar", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Patiowz.this, ManualesTelarwz.class);
                startActivity(intent3);
                break;
        }
    }
}