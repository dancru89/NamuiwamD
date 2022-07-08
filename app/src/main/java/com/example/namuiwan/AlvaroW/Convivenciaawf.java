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

public class Convivenciaawf extends AppCompatActivity implements View.OnClickListener{

    ImageView imgbtndiscreto, imgbtnintegridad, imgbtnlealtad, imgbtnresponsabilidad, imgtraduccionconvivencia, imgtraduccioncovivencia1;
    TextView txtdis,txtres,txtamor,txtleal,txtconsejos;
    MediaPlayer isuawaminchip,isuamorop, isuaaship,isuaunip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.convivenciaawf);

        referenciar();

    }
    private void referenciar() {

        imgbtndiscreto = findViewById(R.id.imgbtndiscreto);
        imgbtndiscreto.setOnClickListener(this);
        imgbtnintegridad = findViewById(R.id.imgbtnintegridad);
        imgbtnintegridad.setOnClickListener(this);
        imgbtnlealtad = findViewById(R.id.imgbtnlealtad);
        imgbtnlealtad.setOnClickListener(this);
        imgbtnresponsabilidad = findViewById(R.id.imgbtnresponsabilidad);
        imgbtnresponsabilidad.setOnClickListener(this);
        imgtraduccionconvivencia = findViewById(R.id.imgtraduccionconvivencia);
        imgtraduccionconvivencia.setOnClickListener(this);
        imgtraduccioncovivencia1 = findViewById(R.id.imgtraduccioncovivencia1);
        imgtraduccioncovivencia1.setOnClickListener(this);

        // almacenar sonidos

        isuawaminchip = MediaPlayer.create(this, R.raw.isuawaminchip);
        isuamorop = MediaPlayer.create(this, R.raw.isuamorop);
        isuaaship = MediaPlayer.create(this, R.raw.isuaaship);
        isuaunip = MediaPlayer.create(this, R.raw.isuaunip);




    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgbtndiscreto:
                imgtraduccionconvivencia.setImageResource(R.drawable.discretohonestoed);
                imgtraduccioncovivencia1.setImageResource(R.drawable.btndiscretoed1);
                isuawaminchip.start();
                break;

            case R.id.imgbtnintegridad:
                imgtraduccionconvivencia.setImageResource(R.drawable.integridadamistaded);
                imgtraduccioncovivencia1.setImageResource(R.drawable.btnintegridaded1);
                isuaaship.start();
                break;

            case R.id.imgbtnlealtad:
                imgtraduccionconvivencia.setImageResource(R.drawable.lealtadrespetoed);
                imgtraduccioncovivencia1.setImageResource(R.drawable.btnlealtad1);
                isuamorop.start();
                break;

            case R.id.imgbtnresponsabilidad:
                imgtraduccionconvivencia.setImageResource(R.drawable.responsabilidaded);
                imgtraduccioncovivencia1.setImageResource(R.drawable.btnresponsabilidaded1);
                isuaunip.start();
                break;



        }


    }



}