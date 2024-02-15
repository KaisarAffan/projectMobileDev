package com.example.appschool1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class kalkulator extends AppCompatActivity {

    EditText number1;
    EditText number2;
    Spinner aritmatik;
    TextView hasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        number1= findViewById(R.id.num1);
        number2= findViewById(R.id.num2);
        aritmatik= findViewById(R.id.dropdown_choose);
        hasil= findViewById(R.id.tvHasil);
        btnHitung= findViewById(R.id.sum);


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1= Integer.parseInt(number1.getText().toString());
                int angka2= Integer.parseInt(number2.getText().toString());
                int hasilArit=0;
                switch (aritmatik.getSelectedItem().toString()){
                    case "tambah":
                       hasilArit= angka1+angka2;
                        hasil.setText(hasilArit+"");
                       break;
                    case "kurang":
                        hasilArit= angka1-angka2;
                        hasil.setText(hasilArit+"");
                        break;
                    case "kali":
                        hasilArit= angka1*angka2;
                        hasil.setText(hasilArit+"");
                        break;
                    case "bagi":
                        double hasilsrit= (double)angka1/(double) angka2;
                        hasil.setText(hasilsrit+"");
                        break;
                }





            }
        });
    }
}