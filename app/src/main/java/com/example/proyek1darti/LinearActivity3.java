package com.example.proyek1darti;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LinearActivity3 extends AppCompatActivity {
    String kepada;
    String subyek;
    String pesan;
    EditText ekepada;
    EditText epesan;
    EditText esubyek;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear3);

        kepada = getIntent().getExtras().getString("kepada");
        subyek = getIntent().getExtras().getString("subyek");
        pesan = getIntent().getExtras().getString("pesan");
        ekepada = findViewById(R.id.eKepada);
        esubyek = findViewById(R.id.eSubyek);
        epesan = findViewById(R.id.pesn);
        ekepada.setText(kepada);
        esubyek.setText(subyek);
        epesan.setText(pesan);
    }
}