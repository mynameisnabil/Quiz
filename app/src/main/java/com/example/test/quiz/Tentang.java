package com.example.test.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_tentang);
    }

    public void btn_main(View view) {
        Intent main = new Intent(Tentang.this, MainActivity.class);
        startActivity(main);
    }
}
