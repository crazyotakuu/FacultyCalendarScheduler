package com.example.facultycalendarscheduler;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Adminlogin extends AppCompatActivity implements View.OnClickListener{
    private EditText usernameEditText;
    private EditText passwordEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.loginv);
        loginButton.setEnabled(true);
        loginButton.setOnClickListener(this);
    }
    private void signIn(String username, String password) {
        Log.d("das",username+password,null);
        if(username.equals("admin@gmail.com")&& password.equals("admin01")){
            Intent adminlayout = new Intent(this, admin_layout.class);
            this.startActivity(adminlayout);
        }
        else{
            Toast.makeText(Adminlogin.this,"Login Failed",Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void onClick(View v) {
        int i = v.getId();
        if(i==R.id.loginv){
            signIn(usernameEditText.getText().toString(), passwordEditText.getText().toString());

        }
    }

}
