package com.rizki.myapp;
/**
 * Tanggal Pengerjaan : 19 April 2022 , 20.35 WIB
 * NIM : 10119052
 * Nama : Rizki Dwi Nugraha
 * Kelas : IF-2
 **/
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    /** Ini merupakan waktu loading splash saat menuju activity login **/
    private int waktu_splash = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                /**setelah loading splash selesai maka akan di teruskan ke activity login**/
                Intent login=new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(login);
                finish();

            }
        },waktu_splash);
    }
}