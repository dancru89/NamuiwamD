package com.example.namuiwan.Josue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.namuiwan.Josue.carlos.Adivina;
import com.example.namuiwan.Josue.carlos.Adivina1;
import com.example.namuiwan.R;

public class MenuAdivina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_adivina);
    }
    public void play(View view){
        Intent intent = new Intent(this, Adivina.class);
        startActivity(intent);
    }
    public void play_animales(View view){
        Intent intent = new Intent(this, Adivina1.class);
        startActivity(intent);
    }
    public void play_palabras(View view){
        Intent intent = new Intent(this,Adivina1.class);
        startActivity(intent);
    }
}
