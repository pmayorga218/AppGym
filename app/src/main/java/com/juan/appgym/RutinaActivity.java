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
}