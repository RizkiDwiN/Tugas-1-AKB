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

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    /** method untuk memberi event onclik pada button Register agar berpindah ke halaman login **/
    public void Back(View view){
        Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
        startActivity(intent);
    }
}