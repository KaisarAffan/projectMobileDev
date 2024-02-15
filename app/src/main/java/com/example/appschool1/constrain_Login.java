package com.example.appschool1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class constrain_Login extends AppCompatActivity {

    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constrain_login);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);


        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (txtUsername.getText().toString().equals("admin") && txtPassword.getText().toString().equals("admin")) {
                    Toast.makeText(constrain_Login.this, "login berhasil", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(constrain_Login.this, "login gagal", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    }
