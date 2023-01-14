package com.example.splashscreensample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class perms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perms);
        TextView deny = (TextView) findViewById(R.id.deny);
        deny.setPaintFlags(deny.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

    }
}