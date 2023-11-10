package com.juan.appgym;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraIMCActivity extends AppCompatActivity {

    private EditText editTextPeso, editTextAltura;
    private Button btnCalcularIMC;
    private TextView textViewResultado, textViewCategoria;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcactivity);

        editTextPeso = findViewById(R.id.editTextPeso);
        editTextAltura = findViewById(R.id.editTextAltura);
        btnCalcularIMC = findViewById(R.id.btnCalcularIMC);
        textViewResultado = findViewById(R.id.textViewResultado);
        textViewCategoria = findViewById(R.id.textViewCategoria);

        btnCalcularIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularIMC();
            }
        });
    }

    private void calcularIMC() {
        String pesoStr = editTextPeso.getText().toString();
        String alturaStr = editTextAltura.getText().toString();

        if (TextUtils.isEmpty(pesoStr) || TextUtils.isEmpty(alturaStr)) {
            Toast.makeText(this, R.string.error_campos_vacios, Toast.LENGTH_SHORT).show();
            textViewResultado.setText("");
            textViewCategoria.setText("");
            return;
        }

        try {
            double peso = Double.parseDouble(pesoStr);
            double altura = Double.parseDouble(alturaStr);

            if (altura == 0) {
                Toast.makeText(this, R.string.error_altura_cero, Toast.LENGTH_SHORT).show();
                textViewResultado.setText("");
                textViewCategoria.setText("");
                return;
            }

            // Fórmula del IMC: peso / (altura * altura)
            double imc = peso / (altura * altura);

            // Muestra el resultado en el TextView
            textViewResultado.setText(getString(R.string.resultado_imc, imc));

            // Determina la categoría de IMC y muestra la información correspondiente
            mostrarInformacionCategorias(imc);

        } catch (NumberFormatException e) {
            Toast.makeText(this, R.string.error_formato_invalido, Toast.LENGTH_SHORT).show();
            textViewResultado.setText("");
            textViewCategoria.setText("");
        }
    }

    private void mostrarInformacionCategorias(double imc) {
        String categoria;

        if (imc < 18.5) {
            categoria = getString(R.string.bajo_peso);
        } else if (imc >= 18.5 && imc <= 24.9) {
            categoria = getString(R.string.peso_normal);
        } else if (imc >= 25 && imc <= 29.9) {
            categoria = getString(R.string.sobrepeso);
        } else {
            categoria = getString(R.string.obesidad);
        }

        // Muestra la categoría en un TextView
        textViewCategoria.setText(getString(R.string.categoria_imc, categoria));
    }
}
