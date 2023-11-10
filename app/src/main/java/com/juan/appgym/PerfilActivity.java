package com.juan.appgym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    private EditText alturaEditText, pesoEditText, sexoEditText, edadEditText;
    private int actividadSeleccionada = -1;
    private int objetivoSeleccionado = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        // Inicializar elementos de entrada
        alturaEditText = findViewById(R.id.tv_altura);
        pesoEditText = findViewById(R.id.tv_peso);
        sexoEditText = findViewById(R.id.tv_sexo);
        edadEditText = findViewById(R.id.tv_edad);
    }

    public void iractividad(View view) {
        // Lanzar la actividad de ActividadActivity
        startActivityForResult(new Intent(this, ActividadActivity.class), 1);
    }

    public void irobjetivo(View view) {
        // Lanzar la actividad de ObjetivoActivity
        startActivityForResult(new Intent(this, ObjetivoActivity.class), 2);
    }

    public void irmacros(View view) {
        // Obtener datos del usuario
        double altura = Double.parseDouble(alturaEditText.getText().toString());
        double peso = Double.parseDouble(pesoEditText.getText().toString());
        int edad = Integer.parseInt(edadEditText.getText().toString());

        // Calcular calorías basado en objetivos (usar tus propias fórmulas)
        double caloriasDiarias = calcularCalorias(altura, peso, edad, actividadSeleccionada, objetivoSeleccionado);

        // Lanzar la actividad de MacrosActivity con la información calculada
        Intent intent = new Intent(this, MacrosActivity.class);
        intent.putExtra("caloriasDiarias", caloriasDiarias);
        startActivity(intent);
    }

    // Función para calcular calorías basado en objetivos
    private double calcularCalorias(double altura, double peso, int edad, int actividad, int objetivo) {
        // Implementa tu lógica de cálculo aquí según los objetivos y las fórmulas recomendadas.
        // Utiliza los valores de altura, peso, edad, actividad y objetivo según sea necesario.
        // Retorna el resultado del cálculo.
        return 0.0; // Cambia esto con tu fórmula de cálculo real.
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && data != null) {
            // Recuperar la selección de actividad u objetivo de las actividades secundarias
            int seleccion = data.getIntExtra("seleccion", -1);

            if (requestCode == 1) {
                // Actividad seleccionada
                actividadSeleccionada = seleccion;
            } else if (requestCode == 2) {
                // Objetivo seleccionado
                objetivoSeleccionado = seleccion;
            }
        }
    }
}

