package com.example.namuiwan.AlvaroW;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;


public class Autoridadawf extends AppCompatActivity implements View.OnClickListener {

    ImageView imgautoridad, imgpadre, imgmadre, imgtata, imgmama;
    TextView txtni, txtna;
    MediaPlayer naa, niaa, tata, mama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autoridadawf);

        referenciar();
    }
    private void referenciar() {

        imgautoridad = findViewById(R.id.imgautoridad);
        imgautoridad.setOnClickListener(this);
        imgpadre = findViewById(R.id.imgpadre);
        imgpadre.setOnClickListener(this);
        imgmadre = findViewById(R.id.imgmadre);
        imgmadre.setOnClickListener(this);
        imgtata = findViewById(R.id.imgtata);
        imgtata.setOnClickListener(this);
        imgmama = findViewById(R.id.imgmama);
        imgmama.setOnClickListener(this);

        // almacenar sonidos

        naa = MediaPlayer.create(this, R.raw.naawf);
        niaa = MediaPlayer.create(this, R.raw.niaawf);
        tata = MediaPlayer.create(this,R.raw.tataawf);
        mama = MediaPlayer.create(this,R.raw.mamawf);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {


                    case R.id.imgpadre:
                        imgautoridad.setImageResource(R.drawable.autoridadpadreed);
                        naa.start();
                        break;

                    case R.id.imgmadre:
                        imgautoridad.setImageResource(R.drawable.autoridadmadreed);
                        niaa.start();
                        break;

                    case R.id.imgmama:
                        imgautoridad.setImageResource(R.drawable.autoridadmamaed);
                        mama.start();
                        break;

                    case R.id.imgtata:
                        imgautoridad.setImageResource(R.drawable.autoridadtataed);
                        tata.start();
                        break;



                }


            }
        }

