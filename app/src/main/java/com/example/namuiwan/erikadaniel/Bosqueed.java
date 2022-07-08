package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Bosqueed extends AppCompatActivity implements View.OnClickListener {

    ImageView imgflores, imguchuva, imgrosa, imgsuculenta, imgaliso, imgchilco, imgsalvia, imgtraducciontierra/*imgbtnflores, imgbtnrosa, imgbtnsuculenta, imgbtnaliso, imgbtnchilco, imgbtnsalvia, imgbtnuchuva*/;
    MediaPlayer aliso,chilco,salvia, uchuva, rosa, suculenta,flores ;
    int valor=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosqueed);

        referenciar();
    }


    private void referenciar(){

        imgflores= findViewById(R.id.imgflores);
        imgflores.setOnClickListener(this);
        imguchuva= findViewById(R.id.imguchuva);
        imguchuva.setOnClickListener(this);
        imgrosa= findViewById(R.id.imgrosa);
        imgrosa.setOnClickListener(this);
        imgsuculenta= findViewById(R.id.imgsuculenta);
        imgsuculenta.setOnClickListener(this);
        imgaliso= findViewById(R.id.imgaliso);
        imgaliso.setOnClickListener(this);
        imgchilco= findViewById(R.id.imgchilco);
        imgchilco.setOnClickListener(this);
        imgsalvia= findViewById(R.id.imgsalvia);
        imgsalvia.setOnClickListener(this);
        imgtraducciontierra= findViewById(R.id.imgtraducciontierra);
        imgtraducciontierra.setOnClickListener(this);

             //almacenar sonido en la variables

        aliso= MediaPlayer.create(this,R.raw.alisoed);
        chilco= MediaPlayer.create(this,R.raw.chilcoed);
        salvia= MediaPlayer.create(this,R.raw.salviaed);
        uchuva= MediaPlayer.create(this,R.raw.uchuvaed);
        rosa= MediaPlayer.create(this,R.raw.rosaed);
        suculenta = MediaPlayer.create(this,R.raw.suculentased);
        flores= MediaPlayer.create(this,R.raw.flored);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgflores:
                switch (valor){
                    case 1:
                        imgflores.setImageResource(R.drawable.floresed4g);
                        //imgtraducciontierra.setImageResource(R.drawable.btnflores);
                        valor = 0;
                        break;
                    case 0:
                        imgflores.setImageResource(R.drawable.floresed4);
                        imgtraducciontierra.setImageResource(R.drawable.btnflores);
                        flores.start();
                        valor = 1;
                        break;
                }
                break;


            case R.id.imguchuva:
                switch (valor){
                    case 1:
                        imguchuva.setImageResource(R.drawable.uchuvaedg);
                      //  imgtraducciontierra.setImageResource(R.drawable.btnuchuva);
                        valor = 0;
                        break;
                    case 0:
                        imguchuva.setImageResource(R.drawable.uchuvaed);
                        imgtraducciontierra.setImageResource(R.drawable.btnuchuva);
                        uchuva.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgrosa:
                switch (valor){
                    case 1:
                        imgrosa.setImageResource(R.drawable.rosaedg);
                      //  imgtraducciontierra.setImageResource(R.drawable.btnrosa);
                        valor = 0;
                        break;
                    case 0:
                        imgrosa.setImageResource(R.drawable.rosaed);
                        imgtraducciontierra.setImageResource(R.drawable.btnrosa);
                        rosa.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgsuculenta:
                switch (valor){
                    case 1:
                        imgsuculenta.setImageResource(R.drawable.suculentasedg);
                       // imgtraducciontierra.setImageResource(R.drawable.btnsuculenta);
                        valor = 0;
                        break;
                    case 0:
                        imgsuculenta.setImageResource(R.drawable.suculentased);
                        imgtraducciontierra.setImageResource(R.drawable.btnsuculenta);
                        suculenta.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgaliso:
                switch (valor){
                    case 1:
                        imgaliso.setImageResource(R.drawable.alisoedg);
                      //  imgtraducciontierra.setImageResource(R.drawable.btnaliso);
                        valor = 0;
                        break;
                    case 0:
                        imgaliso.setImageResource(R.drawable.alisoed);
                        imgtraducciontierra.setImageResource(R.drawable.btnaliso);
                        aliso.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgchilco:
                switch (valor){
                    case 1:
                        imgchilco.setImageResource(R.drawable.chilcoedg);
                       // imgtraducciontierra.setImageResource(R.drawable.btnchilco);
                        valor = 0;
                        break;
                    case 0:
                        imgchilco.setImageResource(R.drawable.chilcoed1);
                        imgtraducciontierra.setImageResource(R.drawable.btnchilco);
                        chilco.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgsalvia:
                switch (valor){
                    case 1:
                        imgsalvia.setImageResource(R.drawable.salviaedg);
                      //  imgtraducciontierra.setImageResource(R.drawable.btnsalvia);
                        valor = 0;
                        break;
                    case 0:
                        imgsalvia.setImageResource(R.drawable.salviaed);
                        imgtraducciontierra.setImageResource(R.drawable.btnsalvia);
                        salvia.start();
                        valor = 1;
                        break;
                }
                break;




        }

    }











}