package com.example.pet_shop;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4500);
                    // sau bao nhiêu lâu nhảy vào login
                    startActivity(new Intent(StartActivity.this, com.example.pet_shop.RegisterActivity.class));
                    finish();
                }catch (Exception e){

                }
            }
        };
        thread.start();
    }
}