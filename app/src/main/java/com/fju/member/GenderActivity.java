package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GenderActivity extends AppCompatActivity {
    String sex= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }
    public void boy(View view){
        sex = "男";
        Intent intent = new Intent(GenderActivity.this,AgeActivity.class);
        intent.putExtra("sex",sex);
    }    public void girl(View view){
        sex = "女";
        Intent intent = new Intent(GenderActivity.this,AgeActivity.class);
        intent.putExtra("sex",sex);
    }
}
