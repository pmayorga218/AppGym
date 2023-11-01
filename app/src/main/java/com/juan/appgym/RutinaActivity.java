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
    public void irinicio(View view){
        Intent myintent4 = new Intent(this, InicioActivity.class);
        startActivity(myintent4);
    }
    public void ircrearrut(View view){
        Intent myintentt = new Intent(this, CrearRutActivity.class);
        startActivity(myintentt);

    }
    public void irejercicios(View view){
        Intent myintentt1 = new Intent(this, EjerciciosActivity.class);
        startActivity(myintentt1);

    }
}