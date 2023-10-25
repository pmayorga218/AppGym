package com.juan.appgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
    public void irregistro(View view){
        Intent myintent = new Intent(this, RegisterActivity.class);
        startActivity(myintent);
    }
    public void irmenu(View view){
        Intent myintentt = new Intent(this, InicioActivity.class);
        startActivity(myintentt);
    }


}









