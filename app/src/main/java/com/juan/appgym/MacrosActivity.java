package com.juan.appgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MacrosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macros);
    }
    public void irperfilc(View view){
        Intent myintent4 = new Intent(this, PerfilActivity.class);
        startActivity(myintent4);
    }
}