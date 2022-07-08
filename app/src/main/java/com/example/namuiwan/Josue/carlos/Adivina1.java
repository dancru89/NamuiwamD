package com.example.namuiwan.Josue.carlos;


import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.example.namuiwan.R;

public class Adivina1 extends BaseAdapter {
    private String[]letters;
    private LayoutInflater letterInf;
    public Adivina1(Context context){
        letters= new String[26];
        for(int i=0;i<letters.length;i++){
            letters[i]=""+(char)(i+'A');
        }
        letterInf=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return letters.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Button btnLetter;
        if(view==null){
            btnLetter=(Button)letterInf.inflate(R.layout.adivina1,viewGroup,false);
        }else{
            btnLetter=(Button)view;
        }
        btnLetter.setText(letters[i]);

        return btnLetter;
    }
}