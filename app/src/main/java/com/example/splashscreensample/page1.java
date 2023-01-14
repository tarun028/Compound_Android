package com.example.splashscreensample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page1 extends AppCompatActivity implements View.OnClickListener {
Button next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        next1 = (Button) findViewById(R.id.next1);
        next1.setOnClickListener((View.OnClickListener) this);

    }
    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.next1:i=new Intent(this,page2.class);startActivity(i); break;



        }
        overridePendingTransition(R.anim.in_right,R.anim.out_left);
    }
}