package com.tina.tugas_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtHasil,txtkali,txtbagi,txtkurang;
    EditText edtNilaiA, edtNilaiB;
    Button btnHitung,btnkali,btnbagi,btnkurang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNilaiA = (EditText) findViewById(R.id.NilaiA);
        edtNilaiB = (EditText) findViewById(R.id.NilaiB);

        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnHitung = (Button) findViewById(R.id.btnHitung);
        btnkali = (Button) findViewById(R.id.btnkali);
        btnbagi = (Button) findViewById(R.id.btnbagi);
        btnkurang = (Button) findViewById(R.id.btnkurang);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int NilaiA = Integer.parseInt(
                        edtNilaiA.getText().toString());
                int NilaiB = Integer.parseInt(
                        edtNilaiB.getText().toString());

                int Hasil = NilaiA + NilaiB;

                txtHasil.setText(String.valueOf(Hasil));
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int NilaiA = Integer.parseInt(
                        edtNilaiA.getText().toString());
                int NilaiB = Integer.parseInt(
                        edtNilaiB.getText().toString());

                int Hasil = NilaiA * NilaiB;

                txtHasil.setText(String.valueOf(Hasil));
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int NilaiA = Integer.parseInt(
                        edtNilaiA.getText().toString());
                int NilaiB = Integer.parseInt(
                        edtNilaiB.getText().toString());

                int Hasil = NilaiA / NilaiB;

                txtHasil.setText(String.valueOf(Hasil));
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int NilaiA = Integer.parseInt(
                        edtNilaiA.getText().toString());
                int NilaiB = Integer.parseInt(
                        edtNilaiB.getText().toString());

                int Hasil = NilaiA - NilaiB;

                txtHasil.setText(String.valueOf(Hasil));
            }
        });
    }
}