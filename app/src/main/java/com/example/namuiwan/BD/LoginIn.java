package com.example.namuiwan.BD;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.namuiwan.BD.DBHELPER.DBhelper;
import com.example.namuiwan.Menued;
import com.example.namuiwan.R;

public class LoginIn extends AppCompatActivity {
    EditText Nick2;
    Button Iniciar,Registro;
    DBhelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_in);
        referenciar();
        DBhelper dBhelper = new DBhelper(LoginIn.this);
        SQLiteDatabase db = dBhelper.getWritableDatabase();
        if(db != null){
            Toast.makeText(LoginIn.this, "se creo la base de datos", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(LoginIn.this, "ERROR AL CREAR BASE DE DATOS", Toast.LENGTH_SHORT).show();
        }

        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nick = Nick2.getText().toString();
                if(TextUtils.isEmpty(nick)){
                    Toast.makeText(LoginIn.this, "EL CAMPO ES REQUERIDO", Toast.LENGTH_SHORT).show();
                } else{
                    if(DB.checkusername(nick) == true){
                        Toast.makeText(LoginIn.this, "Bienvenido: "+nick, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), Menued.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(LoginIn.this, "USUARIO NO ENCONTRADO", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }
        });
    }
    public void referenciar(){
        Nick2 = findViewById(R.id.Nick2);
        Iniciar = findViewById(R.id.Iniciar);
        Registro = findViewById(R.id.Registro);
        DB = new DBhelper(this);
    }
}