package com.sistempakarparuparu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sertifikat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sertifikat);

        // Menetapkan listener klik untuk tombol kelompok
        Button Pakar = findViewById(R.id.btnpakar);
        Pakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pindahKePakar();
            }
        });

        // Menetapkan listener klik untuk tombol sertifikat
        Button btnSertifikat = findViewById(R.id.klmpk);
        btnSertifikat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pindahKeSertifikat();
            }
        });
    }

    // Metode untuk pindah ke halaman kelompok
    public void pindahKePakar() {
        Intent intent = new Intent(this, TentangActivity.class);
        startActivity(intent);
    }

    // Metode untuk pindah ke halaman sertifikat
    public void pindahKeSertifikat() {
        Intent intent = new Intent(this, kelompok14.class);
        startActivity(intent);
    }
}