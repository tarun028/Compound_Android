package com.example.splashscreensample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity implements View.OnClickListener{
    Button next2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        next2 = (Button) findViewById(R.id.next2);
        next2.setOnClickListener((View.OnClickListener) this);

    }
    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.next2:i=new Intent(this,page3.class);startActivity(i); break;

        }


    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.in_left,R.anim.out_right);
    }
}