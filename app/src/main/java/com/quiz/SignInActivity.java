package com.quiz; // Ganti dengan package name Anda

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    private Button emailButton;
    private Button usernameButton;
    private Button passwordButton;
    private Button createAccountButton;
    private TextView registerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in); // Pastikan nama layout sesuai

        // Menghubungkan elemen UI dengan variabel Java
        emailButton = findViewById(R.id.emailBut);
        usernameButton = findViewById(R.id.usernameBut);
        passwordButton = findViewById(R.id.passwordBut);
        createAccountButton = findViewById(R.id.creatBut);
        registerTextView = findViewById(R.id.register);

        // Mengatur onClickListener untuk tombol "Create account"
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ganti dengan activity tujuan Anda
                Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk tombol "Register"
        registerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ganti dengan activity tujuan Anda
                Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        // Anda juga bisa menambahkan onClickListener untuk tombol lainnya jika diperlukan
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logika untuk email button
            }
        });

        usernameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logika untuk username button
            }
        });

        passwordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logika untuk password button
            }
        });
    }
}