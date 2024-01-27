package com.sistempakarparuparu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ProgressBar pgsBar = findViewById(R.id.pBar);

        final int[] i = {0};
        Handler handler = new Handler();

        new Thread(() -> {
            while (i[0] < 50) {
                i[0] += 1;
                // Update the progress bar
                handler.post(() -> {
                    pgsBar.setProgress(i[0]);
                });

                try {
                    // Sleep for 100 milliseconds to show the progress slowly.
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Setelah selesai, pindah ke MainActivity
            runOnUiThread(() -> {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            });
        }).start();
    }
}
