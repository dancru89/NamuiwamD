package com.example.namuiwan.yatulve;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Trueque extends AppCompatActivity implements View.OnClickListener {
    ImageView imgFrio, imgCalientes;
    MediaPlayer frio, caliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truequeve);
        referenciar();
    }
    private void referenciar() {
        imgFrio = findViewById(R.id.imgFrio);
        imgFrio.setOnClickListener(this);
        imgCalientes = findViewById(R.id.imgCalientes);
        imgCalientes.setOnClickListener(this);

        frio = MediaPlayer.create(this,R.raw.pishi_mamikmera);
        caliente = MediaPlayer.create(this,R.raw.pachik_mamikmera);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgFrio:
                Toast.makeText(Trueque.this, "A seleccionado Alimentos Frios", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Trueque.this,Frio.class);
                startActivity(intent);

                break;

            case R.id.imgCalientes:
                Toast.makeText(Trueque.this, "A seleccionado Alimentos Calientes", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Trueque.this,Calido.class);
                startActivity(intent2);

                break;
        }
        switch (v.getId()){
            case R.id.imgFrio:

                frio.start();
                break;
            case R.id.imgCalientes:

                caliente.start();
                break;
        }
    }
}