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
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private TextView tVUsername;
    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setData();
    }

    public void initView() {
        tVUsername = findViewById(R.id.txt_user);
    }

    public void setData() {
        Intent intent = getIntent();
        username = intent.getStringExtra("username");

        tVUsername.setText(username);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.profile){
            startActivity(new Intent(this, ProfileActivity.class));
        } else if (item.getItemId() == R.id.logout) {
            startActivity(new Intent(this, LoginActivity.class));
        }

        return true;
    }
}

