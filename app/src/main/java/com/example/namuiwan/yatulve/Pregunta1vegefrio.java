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

public class Pregunta1vegefrio extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer correcto, incorrecto,pregunta1repollo,ulluco,papacolorada,papaamarilla,repollo,pregunta2papacolorada;
    ImageView imgUlluco,imgPapaColorada,imgPapaAmarilla,imgRepollo,imgParlanteve;
    TextView txtPuntos;
    int puntos = Habilidadesnew.puntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1vegefriove);
        referenciar();

    }

    private void referenciar() {
        correcto = MediaPlayer.create(this, R.raw.correctove);
        incorrecto = MediaPlayer.create(this,R.raw.incorrectove);
        imgParlanteve = findViewById(R.id.imgParlanteve);
        imgParlanteve.setOnClickListener(this);
        imgUlluco = findViewById(R.id.imgUlluco);
        imgUlluco.setOnClickListener(this);
        imgPapaColorada = findViewById(R.id.imgPapaColorada);
        imgPapaColorada.setOnClickListener(this);
        imgPapaAmarilla   = findViewById(R.id.imgPapaAmarilla);
        imgPapaAmarilla.setOnClickListener(this);
        imgRepollo    = findViewById(R.id.imgRepollo);
        imgRepollo.setOnClickListener(this);
        //almacena sonido en las variables
        ulluco    = MediaPlayer.create(this,R.raw.lau);
        papacolorada  = MediaPlayer.create(this,R.raw.pikoye);
        papaamarilla       = MediaPlayer.create(this,R.raw.maiye);
        repollo      = MediaPlayer.create(this,R.raw.tulurmon);
        pregunta1repollo = MediaPlayer.create(this,R.raw.pregunta1vegetcualesrepollo);
        pregunta2papacolorada = MediaPlayer.create(this,R.raw.pregunta2vegetcualespapacoloradave);

        txtPuntos=findViewById(R.id.txtPuntos);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgParlanteve:
                Toast.makeText(Pregunta1vegefrio.this, "¿Cual es el repollo...?", Toast.LENGTH_SHORT).show();
                pregunta1repollo.start();
                break;

            case R.id.imgPapaColorada:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                TimerTask esperar1 = new TimerTask() {
                    @Override
                    public void run() {

                        papacolorada.start();

                    }
                };
                Timer timer1 = new Timer();
                timer1.schedule(esperar1,1000);

                break;
            case R.id.imgPapaAmarilla:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                TimerTask esperar2 = new TimerTask() {
                    @Override
                    public void run() {

                        papaamarilla.start();

                    }
                };
                Timer timer2 = new Timer();
                timer2.schedule(esperar2,1000);

                break;
            case R.id.imgUlluco:
                puntos = puntos - 1;
                txtPuntos.setText(" "+puntos);
                incorrecto.start();
                TimerTask esperar3 = new TimerTask() {
                    @Override
                    public void run() {

                        ulluco.start();

                    }
                };
                Timer timer3 = new Timer();
                timer3.schedule(esperar3,1000);

                break;
            case R.id.imgRepollo:
                puntos = puntos + 2;
                txtPuntos.setText(" "+puntos);
                correcto.start();
                Habilidadesnew.puntos = puntos;
                TimerTask esperar4 = new TimerTask() {
                    @Override
                    public void run() {
                        //repollo.start();
                        Intent intent1 = new Intent(Pregunta1vegefrio.this, Pregunta2vegefrio.class);
                        startActivity(intent1);
                        pregunta2papacolorada.start();
                    }
                };
                Timer timer4 = new Timer();
                timer4.schedule(esperar4,1400);
                break;
        }
    }
}