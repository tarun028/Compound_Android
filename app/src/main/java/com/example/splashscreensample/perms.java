package com.example.splashscreensample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class perms extends AppCompatActivity {
Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perms);
        TextView deny = (TextView) findViewById(R.id.deny);
        deny.setPaintFlags(deny.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(view -> openActivityM());



    }
    public void openActivityM(){
        Intent intent= new Intent(perms.this,MainActivity.class);
        startActivity(intent);
    }
}