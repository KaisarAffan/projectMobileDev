package com.example.appschool1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;
    Button btnRegister;
    Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);
        btnMove = findViewById(R.id.btnMove);


            btnLogin.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if (txtUsername.getText().toString().equals("admin") && txtPassword.getText().toString().equals("admin")) {
                        Toast.makeText(MainActivity.this, "login berhasil", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this,kalkulator.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "login gagal", Toast.LENGTH_LONG).show();
                    }
                }
            });

            btnMove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,constrain_Login.class);
                    startActivity(intent);

                }
            });

        }
    }
