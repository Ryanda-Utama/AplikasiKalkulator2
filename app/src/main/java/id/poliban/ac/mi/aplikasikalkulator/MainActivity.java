package id.poliban.ac.mi.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etAngka1 = findViewById(R.id.etAngka1);
        EditText etAngka2 = findViewById(R.id.etAngka2);
        EditText etHasil = findViewById(R.id.etHasil);
        Button btTambah = findViewById(R.id.btTambah);
        Button btKurang = findViewById(R.id.btKurang);
        Button btKali = findViewById(R.id.btKali);
        Button btBagi = findViewById(R.id.btBagi);
        Button btBersih = findViewById(R.id.btBersih);

        btTambah.setOnClickListener(v -> {
           int aPertama = Integer.parseInt(etAngka1.getText().toString());
            int aKedua = Integer.parseInt(etAngka2.getText().toString());
            int hasil = aPertama + aKedua;
            etHasil.setText(Integer.toString(hasil));
        });

        btKurang.setOnClickListener(v -> {
            int aPertama = Integer.parseInt(etAngka1.getText().toString());
            int aKedua = Integer.parseInt(etAngka2.getText().toString());
            int hasil = aPertama - aKedua;
            etHasil.setText(Integer.toString(hasil));
        });

        btKali.setOnClickListener(v -> {
            int aPertama = Integer.parseInt(etAngka1.getText().toString());
            int aKedua = Integer.parseInt(etAngka2.getText().toString());
            int hasil = aPertama * aKedua;
            etHasil.setText(Integer.toString(hasil));
        });

        btBagi.setOnClickListener(v -> {
            Double aPertama = Double.parseDouble(etAngka1.getText().toString());
            Double aKedua = Double.parseDouble(etAngka2.getText().toString());
            Double hasil = aPertama/aKedua;
            etHasil.setText(String.format(hasil.toString()));
        });

        btBersih.setOnClickListener(v -> {
            etAngka1.setText("");
            etAngka2.setText("");
            etHasil.setText("");
        });
    }
}
