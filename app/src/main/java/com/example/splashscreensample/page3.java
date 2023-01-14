package com.example.splashscreensample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page3 extends AppCompatActivity {
    Button next3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        next3 = (Button) findViewById(R.id.next3);
        next3.setOnClickListener(view -> openActivityM());


    }
    public void openActivityM(){
        Intent intent= new Intent(page3.this,MainActivity.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.in_left,R.anim.out_right);
    }
}

