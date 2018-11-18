package com.example.ages.portocredapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("PortoCred");


        Button extrato = findViewById(R.id.extrato);
        Button parcela = findViewById(R.id.parcela);
        Button transacao = findViewById(R.id.transacao);






        extrato.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Extrato.class);
                startActivity(intent);
            }
        });
        parcela.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Parcelas.class);
                startActivity(intent);
            }
        });
        transacao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Transacao.class);
                startActivity(intent);
            }
        });
    }
}
