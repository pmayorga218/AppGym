package com.juan.appgym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculadorarmActivity extends AppCompatActivity {

    EditText pesoEditText, repeticionesEditText;
    TextView resultadoTextView;
    Button calcularButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadorarm);

        // Vincula las vistas con sus elementos del layout
        pesoEditText = findViewById(R.id.editTextNumberDecimal);
        repeticionesEditText = findViewById(R.id.editTextNumberDecimal2);
        resultadoTextView = findViewById(R.id.textView10);
        calcularButton = findViewById(R.id.button6);

        // Agrega un listener al botón para escuchar el evento de clic
        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularRM(); // Llama a una función para calcular el RM
            }
        });

    }

    private void calcularRM() {
        // Obtén los valores ingresados en los EditText
        String pesoString = pesoEditText.getText().toString();
        String repeticionesString = repeticionesEditText.getText().toString();

        // Verifica si los campos no están vacíos
        if (!pesoString.isEmpty() && !repeticionesString.isEmpty()) {
            // Convierte los valores a números
            double peso = Double.parseDouble(pesoString);
            int repeticiones = Integer.parseInt(repeticionesString);

            // Realiza el cálculo del RM (aquí puedes usar las fórmulas que desees)
            double RM = peso / (1.0278 - (0.0278 * repeticiones));

            // Muestra el resultado en el TextView
            resultadoTextView.setText("Tú 1 de RM es" + RM);
        } else {
            resultadoTextView.setText("Por favor, completa todos los campos");
        }
    }

}