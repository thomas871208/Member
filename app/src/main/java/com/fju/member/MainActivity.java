package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String nk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
            nk = intent.getStringExtra("nickname");
            if(nk == null){
                setContentView(R.layout.activity_nickname);
            }else {
                setContentView(R.layout.activity_main);
            }


        }



}
