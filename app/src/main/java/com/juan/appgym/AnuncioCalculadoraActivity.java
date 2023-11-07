package com.juan.appgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnuncioCalculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncio_calculadora);
    }

    public void ircalculadora(View view){
        Intent myintent10 = new Intent(this, CalculadorarmActivity.class);
        startActivity(myintent10);
    }
}