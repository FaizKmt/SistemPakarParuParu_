package com.sistempakarparuparu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private SessionHandler session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Menu Utama User");

        session = new SessionHandler(getApplicationContext());

        TextView btn_diagnosa_cf = findViewById(R.id.btn_diagnosa_cf);
        TextView btn_riwayat = findViewById(R.id.btn_riwayat);
        TextView btn_penyakit = findViewById(R.id.btn_penyakit);
        TextView btn_tentang = findViewById(R.id.btn_tentang);

        btn_diagnosa_cf.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DiagnosaCfActivity.class);
            startActivity(intent);
        });

        btn_riwayat.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RiwayatActivity.class);
            startActivity(intent);
        });

        btn_penyakit.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PenyakitActivity.class);
            startActivity(intent);
        });

        btn_tentang.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TentangActivity.class);
            startActivity(intent);
        });

    }

}