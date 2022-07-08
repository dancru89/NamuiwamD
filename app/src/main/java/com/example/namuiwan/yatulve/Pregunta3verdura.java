package com.example.namuiwan.yatulve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.namuiwan.R;

import java.util.Timer;
import java.util.TimerTask;

public class Pregunta3verdura extends AppCompatActivity implements View.OnClickListener {

    ImageView imgCebolla,imgZanahoria,imgTomate,imgPimiento, imgParlanteve;
    MediaPlayer cebolla,zanahoria,tomate,pimiento,pregunta3,incorrecto,correcto;
    TextView txtPuntos;
    int puntos = Habilidadesnew.puntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3verdurave);
        txtPuntos=findViewById(R.id.txtPuntos);
        txtPuntos.setText(""+puntos);
        referenciar();
    }

    private void referenciar() {

        imgCebolla = findViewById(R.id.imgCebolla);
        imgCebolla.setOnClickListener(this);
        imgZanahoria = findViewById(R.id.imgZanahoria);
        imgZanahoria.setOnClickListener(this);
        imgTomate   = findViewById(R.id.imgTomate);
        imgTomate.setOnClickListener(this);
        imgPimiento    = findViewById(R.id.imgPimiento);
        imgPimiento.setOnClickListener(this);
        imgParlanteve = findViewById(R.id.imgParlanteve);
        imgParlanteve.setOnClickListener(this);

        //almacena sonido en las variable
        correcto = MediaPlayer.create(this,R.raw.correctove);
        incorrecto = MediaPlayer.create(this,R.raw.incorrectove);
        cebolla    = MediaPlayer.create(this,R.raw.cebollave);
        zanahoria  = MediaPlayer.create(this,R.raw.zanahoriave);
        tomate       = MediaPlayer.create(this,R.raw.gatoaa);
        pimiento      = MediaPlayer.create(this,R.raw.perroaa);
        pregunta3 = MediaPlayer.create(this,R.raw.pregunta1vegetcualeszanahoriave);

        txtPuntos=findViewById(R.id.txtPuntos);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgParlanteve:
                Toast.makeText(Pregunta3verdura.this, "¿ Cual es la zanahoria...?", Toast.LENGTH_SHORT).show();
                pregunta3.start();
                break;
            case R.id.imgCebolla:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                TimerTask esperar1 = new TimerTask() {
                    @Override
                    public void run() {

                        cebolla.start();

                    }
                };
                Timer timer1 = new Timer();
                timer1.schedule(esperar1,1000);
                break;

            case R.id.imgZanahoria:
                puntos = puntos + 2;
                txtPuntos.setText(" "+puntos);
                correcto.start();
                Habilidadesnew.puntos = puntos;
                TimerTask esperar2 = new TimerTask() {
                    @Override
                    public void run() {
                        Intent intent1 = new Intent(Pregunta3verdura.this, Resultado.class);
                        startActivity(intent1);
                        zanahoria.start();

                    }
                };
                Timer timer2 = new Timer();
                timer2.schedule(esperar2,1000);
                break;

            case R.id.imgTomate:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                TimerTask esperar3 = new TimerTask() {
                    @Override
                    public void run() {

                        tomate.start();

                    }
                };
                Timer timer3 = new Timer();
                timer3.schedule(esperar3,1000);

                break;
            case R.id.imgPimiento:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                TimerTask esperar4 = new TimerTask() {
                    @Override
                    public void run() {

                        cebolla.start();

                    }
                };
                Timer timer4 = new Timer();
                timer4.schedule(esperar4,1000);
                pimiento.start();
                break;
        }

    }
}