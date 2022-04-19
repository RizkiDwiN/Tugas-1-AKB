package com.rizki.myapp;

/**
 * Tanggal Pengerjaan : 19 April 2022 , 20.35 WIB
 * NIM : 10119052
 * Nama : Rizki Dwi Nugraha
 * Kelas : IF-2
 **/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btn_login;
    private EditText etUser;
    private String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setData();
    }

    public void initView(){
        //untuk deklarasi id xml ke java
        btn_login = findViewById(R.id.btn_login);
        etUser = findViewById(R.id.etUser);
    }

    public void setData(){
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                username = etUser.getText().toString();
                //aksi
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("username", username);
                startActivity(intent);
            }
        });
    }

    /** method untuk memberi event onclik pada button Register agar berpindah ke halaman register **/
    public void Regist(View view){
        Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }


}