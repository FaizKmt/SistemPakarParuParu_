package com.sistempakarparuparu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TentangActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        // Menetapkan listener klik untuk tombol kelompok
        Button kelompok = findViewById(R.id.kelompok);
        kelompok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pindahKeKelompok();
            }
        });

        // Menetapkan listener klik untuk tombol sertifikat
        Button btnSertifikat = findViewById(R.id.sertifikat);
        btnSertifikat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pindahKeSertifikat();
            }
        });
    }

    // Metode untuk pindah ke halaman kelompok
    public void pindahKeKelompok() {
        Intent intent = new Intent(this, kelompok14.class);
        startActivity(intent);
    }

    // Metode untuk pindah ke halaman sertifikat
    public void pindahKeSertifikat() {
        Intent intent = new Intent(this, sertifikat.class);
        startActivity(intent);
    }
}
