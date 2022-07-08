package com.example.namuiwan.Josue.carlos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.namuiwan.R;

import java.util.Random;

public class Adivina extends AppCompatActivity {
    ImageView imagen;
    MediaPlayer gallina;

    private String []fruit;
    private Random random;
    private String currWord;
    String newWord;
    private TextView[] charViews;
    private LinearLayout wordLayout;
    private Adivina1 adapter;
    private GridView gridView;
    private int numCorr;
    private int numChars;
    private ImageView[]parts;
    private int sizeParts=6;
    private int currPart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adivina);
        imagen = findViewById(R.id.imageView25);
        fruit=getResources().getStringArray(R.array.fruit);
        wordLayout=findViewById(R.id.fruit);
        gridView=findViewById(R.id.letters);
        random=new Random();

        parts=new ImageView[sizeParts];
        parts[0] = findViewById(R.id.head);
        parts[1] = findViewById(R.id.body);
        parts[2] = findViewById(R.id.armLeft);
        parts[3] = findViewById(R.id.armRight);
        parts[4] = findViewById(R.id.legLeft);
        parts[5] = findViewById(R.id.legRight);

        playGame();
    }
    public void referenciar(){
        gallina = MediaPlayer.create(this, R.raw.gallinaed);
    }
    private void playGame(){
        newWord=fruit[random.nextInt(fruit.length)];

        cargarimagen(newWord);
        while(newWord.equals(currWord))newWord =fruit[random.nextInt(fruit.length)];

        currWord=newWord;

        charViews=new TextView[currWord.length()];

        wordLayout.removeAllViews();
        for(int i=0; i<currWord.length();i++){
            charViews[i]=new TextView(this);
            charViews[i].setText(""+currWord.charAt(i));
            charViews[i].setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            charViews[i].setGravity(Gravity.CENTER);
            charViews[i].setTextColor(Color.WHITE);
            charViews[i].setBackgroundResource(R.drawable.letter_bg);
            wordLayout.addView(charViews[i]);

        }
        adapter=new Adivina1(this);
        gridView.setAdapter(adapter);
        numCorr=0;
        currPart=0;
        numChars=currWord.length();

        for(int i=0;i<sizeParts;i++){
            parts[i].setVisibility(View.INVISIBLE);
        }
    }

    private void cargarimagen(String palabra) {

        switch (palabra){

            case "YE":

                imagen.setImageResource(R.drawable.papaguatave);
                imagen.setImageResource(R.drawable.gallinaedg);
                gallina.start();

                break;

            case "KALTRUL":
                imagen.setImageResource(R.drawable.morave);

                break;

            case "NITAK":
                imagen.setImageResource(R.drawable.platowz);

                break;

            case "KAULLI":
                imagen.setImageResource(R.drawable.caballoed);

                break;

            case "KACHULL":
                imagen.setImageResource(R.drawable.palave);

                break;

            case "YASKAP":
                imagen.setImageResource(R.drawable.puertacarlos);

                break;

            case "AWINCHI":
                imagen.setImageResource(R.drawable.macheteve);

                break;

        }
    }

    public void letterPressed(View view){
        String letter=((TextView)view).getText().toString();
        char letterChar=letter.charAt(0);

        view.setEnabled(false);

        boolean correct=false;

        for(int i=0; i<currWord.length();i++){
            if(currWord.charAt(i)==letterChar){
                correct=true;
                numCorr++;
                charViews[i].setTextColor(Color.BLACK);
            }
        }
        if(correct){
            if(numCorr==numChars){
                disableButtons();
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Ganaste");
                builder.setMessage("Felicitaciones!\n\nLa respuesta es \n\n"+currWord);
                builder.setPositiveButton("Jugar de nuevo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Adivina.this.playGame();
                    }
                });

                builder.setNegativeButton("Salir", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Adivina.this.finish();
                    }
                });
                builder.show();
            }
        }else if(currPart<sizeParts){
            parts[currPart].setVisibility(View.VISIBLE);
            currPart++;
        }else{
            disableButtons();
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("Perdiste");
            builder.setMessage("Tu no lograste \n\nadivinar la palabra!\n\nLa respuesta es \n\n"+currWord);
            builder.setPositiveButton("Jugar de nuevo", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Adivina.this.playGame();
                }
            });

            builder.setNegativeButton("Salir",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Adivina.this.finish();
                }
            });
            builder.show();
        }
    }
    public void disableButtons(){
        for(int i =0;i<gridView.getChildCount();i++){
            gridView.getChildAt(i).setEnabled(false);
        }
    }
}