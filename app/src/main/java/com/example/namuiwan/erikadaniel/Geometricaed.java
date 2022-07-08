package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;
public class Geometricaed extends AppCompatActivity implements View.OnClickListener {

    ImageView imggrande, imgmediano, imgpequeno, imgcuadrado, imgrectangulo, imgtriangulo, imgcirculo, imgtraduccionorientacion, imgtraduccionorientacion1 /*, imgbtnmediano, imgbtnpequeno, imgbtncuadrado, imgbtncirculo, imgbtntriangulo, imgbtnrectangulo*/;
    MediaPlayer circulo, rectangulo, triangulo, cuadrado, grande, media, peque;
    int valor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometricaed);

        referenciar();
    }

    private void referenciar() {
        imgcirculo = findViewById(R.id.imgcirculo);
        imgcirculo.setOnClickListener(this);
        imgcuadrado = findViewById(R.id.imgcuadrado);
        imgcuadrado.setOnClickListener(this);
        imgrectangulo = findViewById(R.id.imgrectangulo);
        imgrectangulo.setOnClickListener(this);
        imgtriangulo = findViewById(R.id.imgtriangulo);
        imgtriangulo.setOnClickListener(this);
        imggrande = findViewById(R.id.imggrande);
        imggrande.setOnClickListener(this);
        imgmediano = findViewById(R.id.imgmediano);
        imgmediano.setOnClickListener(this);
        imgpequeno = findViewById(R.id.imgpequeno);
        imgpequeno.setOnClickListener(this);
        imgtraduccionorientacion = findViewById(R.id.imgtraduccionorientacion);
        imgtraduccionorientacion.setOnClickListener(this);
        imgtraduccionorientacion1 = findViewById(R.id.imgtraduccionorientacion1);
        imgtraduccionorientacion1.setOnClickListener(this);


        //almacenar sonido en la variables


        circulo = MediaPlayer.create(this, R.raw.circuloed);
        rectangulo = MediaPlayer.create(this, R.raw.rectanguloed);
        triangulo = MediaPlayer.create(this, R.raw.trianguloed);
        cuadrado = MediaPlayer.create(this, R.raw.cuadradoed);
        grande = MediaPlayer.create(this, R.raw.grandeed);
        media = MediaPlayer.create(this, R.raw.mediaed);
        peque = MediaPlayer.create(this, R.raw.pequeed);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgtraduccionorientacion1: {
                imggrande.setVisibility(view.VISIBLE);
                imgmediano.setVisibility(view.VISIBLE);
                imgpequeno.setVisibility(view.VISIBLE);

                imgcuadrado.setVisibility(view.INVISIBLE);
                imgrectangulo.setVisibility(view.INVISIBLE);
                imgtriangulo.setVisibility(view.INVISIBLE);
                imgcirculo.setVisibility(view.INVISIBLE);
                switch (view.getId()) {
                    case R.id.imggrande:
                        switch (valor) {
                            case 1:
                                imggrande.setImageResource(R.drawable.grandeedg);
                                //imgtraduccionorientacion.setImageResource(R.drawable.btngrande);
                                valor = 0;
                                break;
                            case 0:
                                imggrande.setImageResource(R.drawable.grandeed);
                                imgtraduccionorientacion.setImageResource(R.drawable.btngrande);
                                valor = 1;
                                grande.start();
                                break;
                        }
                        break;
                    case R.id.imgmediano:
                        switch (valor) {
                            case 1:
                                imgmediano.setImageResource(R.drawable.medianoedg);
                                // imgtraduccionorientacion.setImageResource(R.drawable.btnmediano);
                                valor = 0;
                                break;
                            case 0:
                                imgmediano.setImageResource(R.drawable.medianoed);
                                imgtraduccionorientacion.setImageResource(R.drawable.btnmediano);
                                valor = 1;
                                media.start();
                                break;
                        }
                        break;
                    case R.id.imgpequeno:
                        switch (valor) {
                            case 1:
                                imgpequeno.setImageResource(R.drawable.pequenoedg);
                                // imgtraduccionorientacion.setImageResource(R.drawable.btnpequeno);
                                valor = 0;
                                break;
                            case 0:
                                imgpequeno.setImageResource(R.drawable.pequenoed);
                                imgtraduccionorientacion.setImageResource(R.drawable.btnpequeno);
                                valor = 1;
                                peque.start();
                                break;
                        }

                }
                break;
            }


            case R.id.imgtraduccionorientacion: {
                imgcuadrado.setVisibility(view.VISIBLE);
                imgrectangulo.setVisibility(view.VISIBLE);
                imgtriangulo.setVisibility(view.VISIBLE);
                imgcirculo.setVisibility(view.VISIBLE);

                imggrande.setVisibility(view.INVISIBLE);
                imgmediano.setVisibility(view.INVISIBLE);
                imgpequeno.setVisibility(view.INVISIBLE);
                switch (view.getId()) {
                    case R.id.imgcuadrado:
                        switch (valor) {
                            case 1:
                                imgcuadrado.setImageResource(R.drawable.cuadradoedg);
                                // imgtraduccionorientacion.setImageResource(R.drawable.btncuadrado);
                                valor = 0;
                                break;
                            case 0:
                                imgcuadrado.setImageResource(R.drawable.cuadradoed);
                                imgtraduccionorientacion.setImageResource(R.drawable.btncuadrado);
                                valor = 1;
                                cuadrado.start();
                                break;
                        }
                        break;
                    case R.id.imgrectangulo:
                        switch (valor) {
                            case 1:
                                imgrectangulo.setImageResource(R.drawable.rectanguloedg);
                                //  imgtraduccionorientacion.setImageResource(R.drawable.btnrectanculo);
                                valor = 0;
                                break;
                            case 0:
                                imgrectangulo.setImageResource(R.drawable.rectanguloed);
                                imgtraduccionorientacion.setImageResource(R.drawable.btnrectanculo);
                                valor = 1;
                                rectangulo.start();
                                break;
                        }
                        break;
                    case R.id.imgtriangulo:
                        switch (valor) {
                            case 1:
                                imgtriangulo.setImageResource(R.drawable.trianguloedg);
                                //  imgtraduccionorientacion.setImageResource(R.drawable.btntriangulo);
                                valor = 0;
                                break;
                            case 0:
                                imgtriangulo.setImageResource(R.drawable.trianguloed);
                                imgtraduccionorientacion.setImageResource(R.drawable.btntriangulo);
                                valor = 1;
                                triangulo.start();
                                break;
                        }
                        break;
                    case R.id.imgcirculo:
                        switch (valor) {
                            case 1:
                                imgcirculo.setImageResource(R.drawable.circuloedg);
                                // imgtraduccionorientacion.setImageResource(R.drawable.btncirculo);
                                valor = 0;
                                break;
                            case 0:
                                imgcirculo.setImageResource(R.drawable.circuloed);
                                imgtraduccionorientacion.setImageResource(R.drawable.btncirculo);
                                valor = 1;
                                circulo.start();
                                break;
                        }

                    }
                }
            }
        }
    }