package com.example.facultycalendarscheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Userlogin extends AppCompatActivity implements View.OnClickListener {
    ImageButton b1,b2;

    Bundle extras;

    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);
        b1=findViewById(R.id.imageButton);
        b2=findViewById(R.id.imageButton1);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        extras=getIntent().getExtras();
        s =extras.getString("STRING_I_NEED");
    }

    @Override
    public void onClick(View view) {
        if(view==b1){
            Intent i= new Intent(this,calendar_view.class);

            i.putExtra("STRING_I_NEED", s);
            startActivity(i);
        }
        if(view==b2){
            Intent i=new Intent(this,Timetable.class);
            startActivity(i);
        }
    }
}
