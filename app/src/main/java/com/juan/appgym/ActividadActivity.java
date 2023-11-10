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

    private static final String CHECKBOX_PREFS = "CheckBoxPrefs";
    private static final String CHECKBOX_KEYS[] = {"CheckBox1", "CheckBox2", "CheckBox3", "CheckBox4", "CheckBox5"};

    private CheckBox checkBox[] = new CheckBox[CHECKBOX_KEYS.length];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad);

        for (int i = 0; i < CHECKBOX_KEYS.length; i++) {
            checkBox[i] = findViewById(getResources().getIdentifier("checkBox" + (i + 1), "id", getPackageName()));
            restoreCheckBoxState(checkBox[i], CHECKBOX_KEYS[i]);
        }
    }

    public void irperfilc(View view) {
        // Guarda el estado de los CheckBox al hacer clic en "Confirmar"
        for (int i = 0; i < CHECKBOX_KEYS.length; i++) {
            saveCheckBoxState(checkBox[i], CHECKBOX_KEYS[i]);
        }

        // Vuelve al xml de perfil
        Intent intent = new Intent(this, PerfilActivity.class);
        startActivity(intent);
    }

    private void saveCheckBoxState(CheckBox checkBox, String key) {
        SharedPreferences.Editor editor = getSharedPreferences(CHECKBOX_PREFS, Context.MODE_PRIVATE).edit();
        editor.putBoolean(key, checkBox.isChecked());
        editor.apply();
    }

    private void restoreCheckBoxState(CheckBox checkBox, String key) {
        SharedPreferences prefs = getSharedPreferences(CHECKBOX_PREFS, Context.MODE_PRIVATE);
        checkBox.setChecked(prefs.getBoolean(key, false));
    }
}




