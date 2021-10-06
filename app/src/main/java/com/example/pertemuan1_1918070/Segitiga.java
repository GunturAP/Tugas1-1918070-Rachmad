package com.example.pertemuan1_1918070;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {
    EditText alas,tinggi;
    Button proses;
    TextView hasil1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        alas = (EditText)findViewById(R.id.input_alas);
        tinggi = (EditText) findViewById(R.id.input_tinggi);
        proses = (Button) findViewById(R.id.btn_proses);
        hasil1 = (TextView) findViewById(R.id.hasil);
        proses.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String alas1 = alas.getText().toString();
                String tinggi1 = tinggi.getText().toString();
                double alas = Double.parseDouble(alas1);
                double tinggi = Double.parseDouble(tinggi1);
                double hasilakhir = (alas * tinggi)/2;
                String output = String.valueOf(hasilakhir);
                hasil1.setText(output.toString());
            }

        });
    }
}


