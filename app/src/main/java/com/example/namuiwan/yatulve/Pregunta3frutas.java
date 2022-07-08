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

public class Pregunta3frutas extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer correcto, incorrecto, fresa, mora, uchuva, mortino, pregunta3mora;
    ImageView imgUchuvas, imgMora, imgMortino, imgFresas, imgParlanteve;
    TextView txtPuntos;
    int puntos =Habilidadesnew.puntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3frutasve);
        txtPuntos =findViewById(R.id.txtPuntos);
        txtPuntos.setText(""+puntos);
        referenciar();
    }

    private void referenciar() {
        correcto = MediaPlayer.create(this, R.raw.correctove);
        incorrecto = MediaPlayer.create(this,R.raw.incorrectove);
        fresa = MediaPlayer.create(this, R.raw.fresasve);
        mora = MediaPlayer.create(this,R.raw.morave);
        uchuva =  MediaPlayer.create(this,R.raw.uchuvave);
        mortino = MediaPlayer.create(this,R.raw.mortinove);
        pregunta3mora = MediaPlayer.create(this,R.raw.pregunta3frutascualesmorave);

        imgUchuvas = findViewById(R.id.imgUchuvas);
        imgUchuvas.setOnClickListener(this);
        imgMora = findViewById(R.id.imgMora);
        imgMora.setOnClickListener(this);
        imgMortino = findViewById(R.id.imgMortino);
        imgMortino.setOnClickListener(this);
        imgFresas = findViewById(R.id.imgFresas);
        imgFresas.setOnClickListener(this);
        imgParlanteve = findViewById(R.id.imgParlanteve);
        imgParlanteve.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgParlanteve:
                Toast.makeText(Pregunta3frutas.this, "¿ Cual es la mora?", Toast.LENGTH_SHORT).show();
                pregunta3mora.start();
                break;

            case R.id.imgUchuvas:
                //txtPregunta1.setText("no como se te ocurre!!!");
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                TimerTask esperar1 = new TimerTask() {
                    @Override
                    public void run() {

                        uchuva.start();

                    }
                };
                Timer timer1 = new Timer();
                timer1.schedule(esperar1,1000);

                break;

            case R.id.imgMora:
                //txtPregunta1.setText("no como se te ocurre!!!");
                correcto.start();
                puntos = puntos + 2;
                txtPuntos.setText(" "+puntos);
                Habilidadesnew.puntos = puntos;
                TimerTask esperar2 = new TimerTask() {
                    @Override
                    public void run() {
                        mora.start();
                        Intent intent1 = new Intent(Pregunta3frutas.this, Resultado.class);
                        startActivity(intent1);
                    }
                };
                Timer timer2 = new Timer();
                timer2.schedule(esperar2,1400);
                break;

            case R.id.imgMortino:
                incorrecto.start();
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                TimerTask esperar3 = new TimerTask() {
                    @Override
                    public void run() {

                        mora.start();

                    }
                };
                Timer timer3 = new Timer();
                timer3.schedule(esperar3,1000);
                break;

            case R.id.imgFresas:
                //txtPregunta1.setText("no como se te ocurre!!!");
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                TimerTask esperar4 = new TimerTask() {
                    @Override
                    public void run() {

                        fresa.start();

                    }
                };
                Timer timer4 = new Timer();
                timer4.schedule(esperar4,1000);
                break;

        }
    }
}