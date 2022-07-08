package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Familiaed extends AppCompatActivity implements View.OnClickListener{


    ImageView  imgabuela, imgabuelo, imgpapa, imgmama, imgnina, imgnino, imgtraduccionfamilia/*imgbtnabuela, imgbtnabuelo, imgbtnpapa, imgbtnmama, imgbtnnino, imgbtnnina*/ ;
    //TextView txfamiliar, txparentesco;

    MediaPlayer abuela, abuelo, papa, mama, hijo, hija;
    int valor=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familiaed);
        referenciar();
    }

    private void referenciar(){


        imgabuela = findViewById(R.id.imgabuela);
        imgabuela.setOnClickListener(this);
        imgabuelo = findViewById(R.id.imgabuelo);
        imgabuelo.setOnClickListener(this);
        imgpapa = findViewById(R.id.imgpapa);
        imgpapa.setOnClickListener(this);
        imgmama = findViewById(R.id.imgmama);
        imgmama.setOnClickListener(this);
        imgnino = findViewById(R.id.imgnino);
        imgnino.setOnClickListener(this);
        imgnina = findViewById(R.id.imgnina);
        imgnina.setOnClickListener(this);

        imgtraduccionfamilia = findViewById(R.id.imgtraduccionfamilia);
        imgtraduccionfamilia.setOnClickListener(this);
        /*
        imgbtnabuelo = findViewById(R.id.imgbtnabuelo);
        imgbtnabuelo.setOnClickListener(this);
        imgbtnpapa = findViewById(R.id.imgbtnpapa);
        imgbtnpapa.setOnClickListener(this);
        imgbtnmama = findViewById(R.id.imgbtnmama);
        imgbtnmama.setOnClickListener(this);
        imgbtnnino = findViewById(R.id.imgbtnnino);
        imgbtnnino.setOnClickListener(this);
        imgbtnnina = findViewById(R.id.imgbtnnina);
        imgbtnnina.setOnClickListener(this);*/






        //almacenamiento de sonidos en variables
        abuela= MediaPlayer.create(this,R.raw.abuelaed);
        abuelo= MediaPlayer.create(this,R.raw.abueloed);
        mama= MediaPlayer.create(this,R.raw.mamaed);
        papa= MediaPlayer.create(this,R.raw.papaed);
        hija= MediaPlayer.create(this,R.raw.hijaed);
        hijo= MediaPlayer.create(this,R.raw.hijoed);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgabuela:
                  switch (valor){
                      case 1:
                          imgabuela.setImageResource(R.drawable.abuelaedg);
                         // imgtraduccionfamilia.setImageResource(R.drawable.btnabuelaed);
                          valor = 0;
                          break;
                      case 0:
                          imgabuela.setImageResource(R.drawable.abuelaed);
                          imgtraduccionfamilia.setImageResource(R.drawable.btnabuelaed);
                          abuela.start();
                          valor = 1;
                          break;
                  }
                break;
            case R.id.imgabuelo:
                switch (valor) {
                    case 1:
                        imgabuelo.setImageResource(R.drawable.abueloedg);
                       // imgtraduccionfamilia.setImageResource(R.drawable.btnabueloed);
                        valor = 0;
                        break;
                    case 0:
                        imgabuelo.setImageResource(R.drawable.abueloed);
                        imgtraduccionfamilia.setImageResource(R.drawable.btnabueloed);
                        abuelo.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgmama:
                switch (valor) {
                    case 1:
                        imgmama.setImageResource(R.drawable.mamaedg);
                       // imgtraduccionfamilia.setImageResource(R.drawable.btnmamaed);
                        valor = 0;
                        break;
                    case 0:
                        imgmama.setImageResource(R.drawable.mamaed);
                        imgtraduccionfamilia.setImageResource(R.drawable.btnmamaed);
                        valor = 1;
                        mama.start();
                        break;
                }
                break;
            case R.id.imgpapa:
                switch (valor) {
                    case 1:
                        imgpapa.setImageResource(R.drawable.papaedg);
                        //imgtraduccionfamilia.setImageResource(R.drawable.btnpapaed);
                        valor = 0;
                        break;
                    case 0:
                        imgpapa.setImageResource(R.drawable.papaed);
                        imgtraduccionfamilia.setImageResource(R.drawable.btnpapaed);
                        papa.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgnino:
                switch (valor) {
                    case 1:
                        imgnino.setImageResource(R.drawable.ninoedg);
                       // imgtraduccionfamilia.setImageResource(R.drawable.btnhijoed);
                        valor = 0;
                        break;
                    case 0:
                        imgnino.setImageResource(R.drawable.ninoed);
                        imgtraduccionfamilia.setImageResource(R.drawable.btnhijoed);
                        valor = 1;
                        hijo.start();
                        break;
                }
                break;
            case R.id.imgnina:
                switch (valor) {
                    case 1:
                        imgnina.setImageResource(R.drawable.ninaedg);
                        //imgtraduccionfamilia.setImageResource(R.drawable.btnhijaed);
                        valor = 0;
                        break;
                    case 0:
                        imgnina.setImageResource(R.drawable.ninaed);
                        imgtraduccionfamilia.setImageResource(R.drawable.btnhijaed);
                        valor = 1;
                        hija.start();
                        break;
                }
                break;

        }


    }
}