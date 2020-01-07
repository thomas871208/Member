package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity {
  EditText edage;
  int age;
  String sex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        edage = findViewById(R.id.edage);
        Intent intent = new Intent();
        sex = intent.getStringExtra("sex");
        if(sex ==null){
            startActivity(intent);
        }else{
            Intent intent1 = new Intent(AgeActivity.this,NicknameActivity.class);
            startActivity(intent1);

        }

    }
    public void next(View view){
        age = Integer.parseInt(edage.getText().toString());
        Intent intent2 = new Intent(AgeActivity.this,GenderActivity.class);
        intent2.putExtra("age",age);
        startActivity(intent2);
    }
}
