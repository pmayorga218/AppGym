package com.juan.appgym;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActividadActivity extends AppCompatActivity {

    private static final String PREFS_NAME = "MyPrefsFile";
    private static final String CHECKBOX1_KEY = "CheckBox1";
    private static final String CHECKBOX2_KEY = "CheckBox2";
    private static final String CHECKBOX3_KEY = "CheckBox3";
    private static final String CHECKBOX4_KEY = "CheckBox4";
    private static final String CHECKBOX5_KEY = "CheckBox5";

    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);

        // Lee el estado de los CheckBox y marca los CheckBox correspondientes
        restoreCheckBoxState(checkBox1, CHECKBOX1_KEY);
        restoreCheckBoxState(checkBox2, CHECKBOX2_KEY);
        restoreCheckBoxState(checkBox3, CHECKBOX3_KEY);
        restoreCheckBoxState(checkBox4, CHECKBOX4_KEY);
        restoreCheckBoxState(checkBox5, CHECKBOX5_KEY);
    }

    public void irperfilc(View view) {
        // Guarda el estado de los CheckBox al hacer clic en "Confirmar"
        saveCheckBoxState(checkBox1, CHECKBOX1_KEY);
        saveCheckBoxState(checkBox2, CHECKBOX2_KEY);
        saveCheckBoxState(checkBox3, CHECKBOX3_KEY);
        saveCheckBoxState(checkBox4, CHECKBOX4_KEY);
        saveCheckBoxState(checkBox5, CHECKBOX5_KEY);

        // Vuelve al xml de perfil
        Intent intent = new Intent(this, PerfilActivity.class);
        startActivity(intent);
    }

    private void saveCheckBoxState(CheckBox checkBox, String key) {
        SharedPreferences.Editor editor = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE).edit();
        editor.putBoolean(key, checkBox.isChecked());
        editor.apply();
    }

    private void restoreCheckBoxState(CheckBox checkBox, String key) {
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        checkBox.setChecked(prefs.getBoolean(key, false));
    }
}



