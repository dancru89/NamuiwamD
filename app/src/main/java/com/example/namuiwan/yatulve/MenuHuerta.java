package com.example.namuiwan.yatulve;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;
public class MenuHuerta extends AppCompatActivity implements View.OnClickListener {
    //declarar botones
    ImageView imgVideo, imgHerramientas, imgFrutas, imgVerduras, imgNumeros, imgAlimentos;
    MediaPlayer herramienta,video, clasificacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_huertave);

        referenciar();
    }
    private void referenciar(){

        imgHerramientas = findViewById(R.id.imgHerramientas);
        imgHerramientas.setOnClickListener(this);
        imgFrutas = findViewById(R.id.imgFrutas);
        imgFrutas.setOnClickListener(this);
        imgVerduras = findViewById(R.id.imgVerduras);
        imgVerduras.setOnClickListener(this);
        imgNumeros=findViewById(R.id.imgNumeros);
        imgNumeros.setOnClickListener(this);
        imgAlimentos=findViewById(R.id.imgAlimentos);
        imgAlimentos.setOnClickListener(this);

        herramienta = MediaPlayer.create(this,R.raw.trausro_chitoka_kualamik);
        video = MediaPlayer.create(this,R.raw.ashomosr);
        clasificacion = MediaPlayer.create(this,R.raw.namui_mamikmera);
}

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgHerramientas:
                Toast.makeText(MenuHuerta.this, "A seleccionado Herramientas", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(MenuHuerta.this,Herramientas.class);
                startActivity(intent2);
                herramienta.start();

                break;

            case R.id.imgFrutas:
                Toast.makeText(MenuHuerta.this, "A seleccionado Frutas",Toast.LENGTH_SHORT).show();
                Intent intent3= new Intent(MenuHuerta.this,Frutas.class);
                startActivity(intent3);

                break;

            case R.id.imgVerduras:
                Toast.makeText(MenuHuerta.this, "A seleccionado Vegetales", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MenuHuerta.this,Verduras.class);
                startActivity(intent4);

                break;

            case  R.id.imgNumeros:
                Toast.makeText(MenuHuerta.this, "A seleccionado Números", Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(MenuHuerta.this,Numeros.class);
                startActivity(intent5);

                break;

            case  R.id.imgAlimentos:
                Toast.makeText(MenuHuerta.this, "A seleccionado Alimentos", Toast.LENGTH_SHORT).show();
                Intent intent6 = new Intent(MenuHuerta.this,Trueque.class);
                startActivity(intent6);
                clasificacion.start();

                break;


        }
    }
}