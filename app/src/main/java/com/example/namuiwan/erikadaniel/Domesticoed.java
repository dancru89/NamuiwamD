package com.example.namuiwan.erikadaniel;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Domesticoed extends AppCompatActivity implements View.OnClickListener {

    ImageView imgcuy, imgconejo, imggallina, imggato, imgperro, imgcaballo, imgvaca, imgovejo, imgbtnconejo, imgTraduccion, imgbtngallina, imgbtngato, imgbtnovejo, imgbtnperro, imgbtnvaca, imgbtncaballo;
    MediaPlayer caballo, conejo, cuy, gallina, gato, ovejo, perro, vaca;
    int valor=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domesticoed);
        referenciar();
    }


    private void referenciar() {
        imgcuy = findViewById(R.id.imgcuy);
        imgcuy.setOnClickListener(this);
        imgconejo = findViewById(R.id.imgconejo);
        imgconejo.setOnClickListener(this);
        imggallina = findViewById(R.id.imggallina);
        imggallina.setOnClickListener(this);
        imggato = findViewById(R.id.imggato);
        imggato.setOnClickListener(this);
        imgperro = findViewById(R.id.imgperro);
        imgperro.setOnClickListener(this);
        imgvaca = findViewById(R.id.imgvaca);
        imgvaca.setOnClickListener(this);
        imgovejo = findViewById(R.id.imgovejo);
        imgovejo.setOnClickListener(this);
        imgcaballo = findViewById(R.id.imgcaballo);
        imgTraduccion = findViewById(R.id.imgtraduccion);
        imgTraduccion.setOnClickListener(this);
        imgcaballo.setOnClickListener(this);
        //almacenar sonido en la variables
        caballo = MediaPlayer.create(this, R.raw.caballoed);
        conejo = MediaPlayer.create(this, R.raw.conejoed);
        cuy = MediaPlayer.create(this, R.raw.cuyed);
        gallina = MediaPlayer.create(this, R.raw.gallinaed);
        gato = MediaPlayer.create(this, R.raw.gatoed);
        ovejo = MediaPlayer.create(this, R.raw.ovejoed);
        perro = MediaPlayer.create(this, R.raw.perroed);
        vaca = MediaPlayer.create(this, R.raw.vacaed);

    }
    @Override
        public void onClick (View view){
            switch (view.getId()) {
                case R.id.imgcuy:
                    switch (valor) {
                        case 1:
                            imgcuy.setImageResource(R.drawable.cuyedg);
                            //imgTraduccion.setImageResource(R.drawable.btncuy);
                            valor = 0;
                            break;
                        case 0:
                            imgcuy.setImageResource(R.drawable.cuyed);
                            imgTraduccion.setImageResource(R.drawable.btncuy);
                            valor = 1;
                            cuy.start();
                            break;
                            }
                    break;

                case R.id.imgconejo:
                    switch (valor) {
                        case 1:
                            imgconejo.setImageResource(R.drawable.conejoedg);
                          //  imgTraduccion.setImageResource(R.drawable.btnconejo);
                            valor = 0;
                            break;
                        case 0:
                            imgconejo.setImageResource(R.drawable.conejoed);
                            imgTraduccion.setImageResource(R.drawable.btnconejo);
                            valor = 1;
                            conejo.start();
                            break;
                            }
                    break;

                case R.id.imggallina:
                    switch (valor) {
                        case 1:
                            imggallina.setImageResource(R.drawable.gallinaedg);
                         //   imgTraduccion.setImageResource(R.drawable.btngallina);
                            valor = 0;
                            break;
                        case 0:
                            imggallina.setImageResource(R.drawable.gallinaed);
                            imgTraduccion.setImageResource(R.drawable.btngallina);
                            valor = 1;
                            gallina.start();
                            break;
                            }
                    break;

                case R.id.imgperro:
                    switch (valor) {
                        case 1:
                            imgperro.setImageResource(R.drawable.perroedg);
                            //imgTraduccion.setImageResource(R.drawable.btncuy);
                            valor = 0;
                            break;
                        case 0:
                            imgperro.setImageResource(R.drawable.perroed);
                            imgTraduccion.setImageResource(R.drawable.btnperro);
                            valor = 1;
                            perro.start();
                            break;
                            }
                    break;

                case R.id.imgovejo:
                    switch (valor) {
                        case 1:
                            imgovejo.setImageResource(R.drawable.ovejoedg);
                            //imgTraduccion.setImageResource(R.drawable.btncuy);
                            valor = 0;
                            break;
                        case 0:
                            imgovejo.setImageResource(R.drawable.ovejoed);
                            imgTraduccion.setImageResource(R.drawable.btnovejo);
                            valor = 1;
                            ovejo.start();
                            break;
                            }
                    break;

                case R.id.imgvaca:
                    switch (valor) {
                        case 1:
                            imgvaca.setImageResource(R.drawable.vacaedg);
                            //imgTraduccion.setImageResource(R.drawable.btncuy);
                            valor = 0;
                            break;
                        case 0:
                            imgvaca.setImageResource(R.drawable.vacaed);
                            imgTraduccion.setImageResource(R.drawable.btnvaca);
                            valor = 1;
                            vaca.start();
                            break;
                            }
                    break;

                case R.id.imgcaballo:
                    switch (valor) {
                        case 1:
                            imgcaballo.setImageResource(R.drawable.caballoedg);
                            //imgTraduccion.setImageResource(R.drawable.btncuy);
                            valor = 0;
                            break;
                        case 0:
                            imgcaballo.setImageResource(R.drawable.caballoed);
                            imgTraduccion.setImageResource(R.drawable.btncaballo);
                            valor = 1;
                            caballo.start();
                            break;
                    }
                    break;
                case R.id.imggato:
                    switch (valor) {
                        case 1:
                            imggato.setImageResource(R.drawable.gatoedg);
                            //imgTraduccion.setImageResource(R.drawable.btncuy);
                            valor = 0;
                            break;
                        case 0:
                            imggato.setImageResource(R.drawable.gatoed);
                            imgTraduccion.setImageResource(R.drawable.btngato);
                            valor = 1;
                            gato.start();
                            break;
                    }
                    break;


            }
        }
}