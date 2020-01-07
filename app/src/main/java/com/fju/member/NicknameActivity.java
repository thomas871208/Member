package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class NicknameActivity extends AppCompatActivity {
    EditText nickname;
    String nk;
    SharedPreferences pres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        nickname = findViewById(R.id.nickname);
        nk = nickname.getText().toString();
        pres = getSharedPreferences("example", MODE_PRIVATE);
        pres.edit()
                .putString("nickname", nk)
                .commit();
        Intent intent = new Intent();
        intent.putExtra("nickname","0");
        startActivity(intent);

    }
    public void next(View view) {
        //Intent intent1 = new Intent(NicknameActivity.this, AgeActivity.class);
        //intent1.putExtra("nickname", nk);
        //startActivity(intent1);
        Log.d("haha", "aaaaa ");
    }


    }
