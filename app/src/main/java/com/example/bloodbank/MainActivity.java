package com.example.bloodbank;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password) ;

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.login);

        loginbtn.setOnClickListener(view -> {
            if(username.getText().toString().equals("admin")&& password.getText().toString().equals("admin"))
            { //correct
                Toast.makeText(MainActivity.this,"Login Successfull",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this,admin_panel.class);
                startActivity(intent);
            }else {
                //incorrect
                Toast.makeText(MainActivity.this,"Login Faild!!",Toast.LENGTH_SHORT).show();
            }
        });

    }
}