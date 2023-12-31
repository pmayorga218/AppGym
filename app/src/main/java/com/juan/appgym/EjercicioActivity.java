package com.juan.appgym;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class EjercicioActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    private Button mBtnAñadir;
    private ListView mListView;
    private EditText mEditText;
    private List<String> mLista = new ArrayList<>();
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

        mBtnAñadir = findViewById(R.id.btnAgregar);
        mBtnAñadir.setOnClickListener(this);
        mListView = findViewById(R.id.listView);
        mListView.setOnItemClickListener(this);
        mEditText = findViewById(R.id.etLista);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnAgregar) {
            String texto = mEditText.getText().toString().trim();
            if (!texto.isEmpty()) {
                mLista.add(texto);
                mEditText.getText().clear();
                mAdapter.notifyDataSetChanged();
            } else {
                Toast.makeText(this, "Please enter a valid item", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
        Toast.makeText(this, "Item Clicked: " + position, Toast.LENGTH_SHORT).show();
    }
}