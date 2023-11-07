package com.juan.appgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    public void irrutina(View view){
        Intent myintent3 = new Intent(this, RutinaActivity.class);
        startActivity(myintent3);
    }
    public void irperfilc(View view){
        Intent myintent4 = new Intent(this, PerfilActivity.class);
        startActivity(myintent4);
    }
    public void iranuncio(View view){
        Intent myintent9 = new Intent(this, AnuncioCalculadoraActivity.class);
        startActivity(myintent9);
    }

}