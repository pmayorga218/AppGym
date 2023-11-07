package com.juan.appgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RutinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina);
    }

    public void ircrearrut(View view){
        Intent myintent11 = new Intent(this, CrearActivity.class);
        startActivity(myintent11);

    }
    public void irejercicios(View view){
        Intent myintent12 = new Intent(this, EjerciciosActivity.class);
        startActivity(myintent12);

    }
}