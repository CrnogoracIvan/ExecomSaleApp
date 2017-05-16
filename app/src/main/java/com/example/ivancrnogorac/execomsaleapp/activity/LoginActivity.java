package com.example.ivancrnogorac.execomsaleapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ivancrnogorac.execomsaleapp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // click on No account yet...
        TextView signUp = (TextView) findViewById(R.id.link_signup);
        signUp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent (LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        // click on Try app...
        TextView tryApp = (TextView) findViewById(R.id.link_try_app);
        tryApp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent (LoginActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        }
}

