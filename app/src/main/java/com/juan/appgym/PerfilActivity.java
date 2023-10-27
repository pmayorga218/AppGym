package com.juan.appgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }
    public void irregistro(View view){
        Intent myintent = new Intent(this, RegisterActivity.class);
        startActivity(myintent);
    }
    public void iractividad(View view){
        Intent myintent5 = new Intent(this, ActividadActivity.class);
        startActivity(myintent5);

    }
    public void irobjetivo(View view){
        Intent myintent6 = new Intent(this, ObjetivoActivity.class);
        startActivity(myintent6);
    }
    public void irmacros(View view){
        Intent myintent7 = new Intent(this, MacrosActivity.class);
        startActivity(myintent7);
    }
}