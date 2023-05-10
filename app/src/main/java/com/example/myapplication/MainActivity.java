package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.activities.InicioReportero;

public class MainActivity extends AppCompatActivity {

    Button btnInicioReportero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        btnInicioReportero = (Button)findViewById(R.id.btnRerportero);

        btnInicioReportero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, InicioReportero.class);
                startActivity(intent);
            }
        });
    }

}