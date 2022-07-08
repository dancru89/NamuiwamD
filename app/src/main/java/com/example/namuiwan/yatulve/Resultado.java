package com.example.namuiwan.yatulve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.namuiwan.R;

public class Resultado extends AppCompatActivity implements View.OnClickListener{

    TextView txtPuntos,txttotalpuntos;
    int puntos = Habilidadesnew.puntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultadove);
        txtPuntos =findViewById(R.id.txtPuntos);
        txtPuntos.setText(""+puntos);
        txttotalpuntos = findViewById(R.id.txttotalpuntos);
        txttotalpuntos.setOnClickListener(this);
        Habilidadesnew.puntos =0;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.txttotalpuntos:
                Intent intent1 = new Intent(Resultado.this, Habilidadesnew.class);
                startActivity(intent1);
                break;

        }

    }
}