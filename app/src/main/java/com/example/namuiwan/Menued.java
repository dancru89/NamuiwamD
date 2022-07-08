package com.example.namuiwan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.AlvaroW.Cocinaawf;
import com.example.namuiwan.Josue.JuegosCJ;
import com.example.namuiwan.erikadaniel.Casaed;
import com.example.namuiwan.willi_zaret.Patiowz;
import com.example.namuiwan.yatulve.MenuHuerta;


public class Menued extends AppCompatActivity  implements View.OnClickListener  {

    ImageView btncasa, btncocina, btnhuerta, btnartesania, btnjugar, btninfo;
    MediaPlayer artesania, casa, cocina, huerta, juegos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menued);
        referenciar();
    }

    private void referenciar() {
        btncasa = findViewById(R.id.btncasa);
        btncasa.setOnClickListener(this);
        btncocina = findViewById(R.id.btncocina);
        btncocina.setOnClickListener(this);
        btnhuerta = findViewById(R.id.btnhuerta);
        btnhuerta.setOnClickListener(this);
        btnartesania = findViewById(R.id.btnartesania);
        btnartesania.setOnClickListener(this);
        btnjugar = findViewById(R.id.btnjugar);
        btnjugar.setOnClickListener(this);
        btninfo = findViewById(R.id.btninfo);
        btninfo.setOnClickListener(this);


        //almacenar sonidos en las variables
        artesania = MediaPlayer.create(this,R.raw.patiowz);
        casa = MediaPlayer.create(this,R.raw.casaed);
        cocina = MediaPlayer.create(this,R.raw.cocinaed);
        huerta = MediaPlayer.create(this,R.raw.huertaed);
        juegos = MediaPlayer.create(this,R.raw.juegosed);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btncasa:
                Intent intent1 = new Intent(Menued.this, Casaed.class);
                startActivity(intent1);
                casa.start();
                break;

            case R.id.btnhuerta:
                Intent intent2 = new Intent(Menued.this, MenuHuerta.class);
                startActivity(intent2);
                huerta.start();
                break;

            case R.id.btnartesania:
                Intent intent3 = new Intent(Menued.this, Patiowz.class);
                startActivity(intent3);
                artesania.start();
                break;

            case R.id.btncocina:
                Intent intent4 = new Intent(Menued.this, Cocinaawf.class);
                startActivity(intent4);
                cocina.start();
                break;

            case R.id.btnjugar:
                Intent intent5 = new Intent(Menued.this, JuegosCJ.class);
                startActivity(intent5);
                juegos.start();
                break;

            case R.id.btninfo:
                Intent intent6 = new Intent(Menued.this, Acercade.class);
                startActivity(intent6);
                break;







        }
    }






}
