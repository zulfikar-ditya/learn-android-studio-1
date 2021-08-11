package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button Check
        Button btnCheck = findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText AngkaPertama = findViewById(R.id.angkaPertama);
                EditText AngkaKedua = findViewById(R.id.angkaKedua);

                String angkaPertamaString = AngkaPertama.getText().toString();
                String angkaKeduaString = AngkaKedua.getText().toString();
                int angkaPertama = 0;
                int angkaKedua = 0;
                try {
                    angkaPertama = Integer.parseInt(angkaPertamaString);
                    angkaKedua = Integer.parseInt(angkaKeduaString);
                } catch (Exception) {
                    Toast.makeText(MainActivity.this, "Masukkan angka dengan benar!!!", Toast.LENGTH_SHORT).show();
                }

                TextView result = findViewById(R.id.result);
                int res = angkaPertama + angkaKedua;
                String resultString = String.valueOf(res);
                result.setText(resultString);
            }
        });

//        button help
        Button btnHelp = findViewById(R.id.btnHelp);
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Aplikasi untuk menambahkan 2 bilangan", Toast.LENGTH_SHORT).show();
            }
        });

//        button reset
        Button btnReset = findViewById(R.id.btnReset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText angkaPertama = findViewById(R.id.angkaPertama);
                EditText angkaKedua = findViewById(R.id.angkaKedua);
                angkaPertama.setText("0");
                angkaKedua.setText("0");

                TextView result = findViewById(R.id.result);
                result.setText("0");
            }
        });

    }
}