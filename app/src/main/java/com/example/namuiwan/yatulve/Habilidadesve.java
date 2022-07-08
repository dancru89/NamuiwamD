package com.example.namuiwan.yatulve;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.namuiwan.R;

public class Habilidadesve extends AppCompatActivity implements View.OnClickListener{
    ImageView imgNumeros, imgtitlealimentosfrios,imgFrutas;
    MediaPlayer pregunta1;
    public static  int  puntos=4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habilidades);
        referenciar();
    }

    private void referenciar() {
        imgNumeros = findViewById(R.id.imgNumeros);
        imgNumeros.setOnClickListener(this);
        imgtitlealimentosfrios = findViewById(R.id.imgtitlealimentosfrios);
        imgtitlealimentosfrios.setOnClickListener(this);
        imgFrutas = findViewById(R.id.imgFrutas);
        imgFrutas.setOnClickListener(this);
        pregunta1 = MediaPlayer.create(this, R.raw.pregunta1frutascualesuchuvave);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgFrutas:

                break;
            case R.id.imgtitlealimentosfrios:

                break;
            case R.id.imgNumeros:
                puntos = 0;
                break;

        }

    }
}