package com.example.kalkulator10pplg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class KalkulatorAritmatika extends AppCompatActivity {

    EditText txtAngka1, txtAngka2;
    Button btnplus, btnmines, btnkali, btnbagi;
    double angka1, angka2, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_aritmatika);
        //
        txtAngka1 = (EditText) findViewById(R.id.txtAngka1);
        txtAngka2 = (EditText) findViewById(R.id.txtAngka2);
        btnplus = (Button) findViewById(R.id.btnplus);
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((txtAngka1.getText().length()>0) && (txtAngka2.getText().length()>0)) {
                    angka1 = Double.parseDouble(txtAngka1.getText().toString());
                    angka2 = Double.parseDouble(txtAngka2.getText().toString());
                    hasil = angka1 + angka2;
                    Toast.makeText(getApplicationContext(), "Hasil : " + new DecimalFormat("##.##").format(hasil), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnmines = (Button) findViewById(R.id.btnmines);
        btnmines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((txtAngka1.getText().length()>0) && (txtAngka2.getText().length()>0)) {
                    angka1 = Double.parseDouble(txtAngka1.getText().toString());
                    angka2 = Double.parseDouble(txtAngka2.getText().toString());
                    hasil = angka1 - angka2;
                    Toast.makeText(getApplicationContext(), "Hasil : " + new DecimalFormat("##.##").format(hasil), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnkali = (Button) findViewById(R.id.btnkali);
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((txtAngka1.getText().length()>0) && (txtAngka2.getText().length()>0)) {
                    angka1 = Double.parseDouble(txtAngka1.getText().toString());
                    angka2 = Double.parseDouble(txtAngka2.getText().toString());
                    hasil = angka1 * angka2;
                    Toast.makeText(getApplicationContext(), "Hasil : " + new DecimalFormat("##.##").format(hasil), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnbagi = (Button) findViewById(R.id.btnbagi);
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((txtAngka1.getText().length()>0) && (txtAngka2.getText().length()>0)) {
                    angka1 = Double.parseDouble(txtAngka1.getText().toString());
                    angka2 = Double.parseDouble(txtAngka2.getText().toString());
                    hasil = angka1 / angka2;
                    Toast.makeText(getApplicationContext(), "Hasil : " + new DecimalFormat("##.##").format(hasil), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}