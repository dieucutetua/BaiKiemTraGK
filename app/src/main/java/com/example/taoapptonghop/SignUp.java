package com.example.taoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SignUp extends AppCompatActivity {

    ImageView buttonSign2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();


        buttonSign2 = (ImageView) findViewById(R.id.btnSignin2);
        buttonSign2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignUp.this, SignIn.class);
                startActivity(i);
            }
        });
    }
}