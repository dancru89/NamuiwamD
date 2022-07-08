package com.example.namuiwan.AlvaroW;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class JuegoAlvaroWilf extends AppCompatActivity implements View.OnClickListener {

    ImageView imgopcion1, imgopcion2, imgopcion3,imgopcion4,imgpregunta,imgjuepregunta;
    MediaPlayer correctoawf,incorrectoawf,preguntaawf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_alvaro_wilf);

        referenciar(); // llamo al metodo referenciar
    }

    private void referenciar() {

        imgopcion1 = findViewById(R.id.imgopcion1);
        imgopcion1.setOnClickListener(this);

        imgopcion2 = findViewById(R.id.imgopcion2);
        imgopcion2.setOnClickListener(this);

        imgopcion3 = findViewById(R.id.imgopcion3);
        imgopcion3.setOnClickListener(this);

        imgopcion4 = findViewById(R.id.imgopcion4);
        imgopcion4.setOnClickListener(this);



        imgpregunta = findViewById(R.id.imgpregunta);
        imgpregunta.setOnClickListener(this);

        imgjuepregunta = findViewById(R.id.imgjuepregunta);
        imgjuepregunta.setOnClickListener(this);



        preguntaawf = MediaPlayer.create(this, R.raw.preguntaawf); //creo sonido
        correctoawf = MediaPlayer.create(this, R.raw.correctoawf);
        incorrectoawf= MediaPlayer.create (this, R.raw.incorrectoawf);




    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {


            case R.id.imgpregunta:
                preguntaawf.start();
                break;


            case R.id.imgopcion1:
                incorrectoawf.start();
                break;

            case R.id.imgopcion2:
                incorrectoawf.start();

                break;

            case R.id.imgopcion3:
                incorrectoawf.start();
                break;

            case R.id.imgopcion4:
                correctoawf.start();



        }
    }
}
