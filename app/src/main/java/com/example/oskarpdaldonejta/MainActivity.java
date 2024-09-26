package com.example.oskarpdaldonejta;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonDisable; // Deklaracja przycisku

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicjalizacja przycisku poprzez ID z pliku XML
        buttonDisable = findViewById(R.id.buttonDisable);

        // Ustawienie nasłuchiwania na kliknięcie przycisku
        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Po kliknięciu przycisk zostaje dezaktywowany
                buttonDisable.setEnabled(false);
                Toast.makeText(MainActivity.this, "Przycisk został wyłączony", Toast.LENGTH_SHORT).show();
            }
        });
    }
}