package com.example.splashscreensample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class graph3 extends AppCompatActivity {
    TextView detail31,detail32,detail33,detail34;
    LinearLayout layout31,layout32,layout33,layout34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph3);

        detail31 = findViewById(R.id.detail31);
        detail32 = findViewById(R.id.detail32);
        detail33 = findViewById(R.id.detail33);
        detail34 = findViewById(R.id.detail34);
        layout31 = findViewById(R.id.layout31);
        layout32 = findViewById(R.id.layout32);
        layout33 = findViewById(R.id.layout33);
        layout34 = findViewById(R.id.layout34);

    }

    public void expand31(View view) {

        int v = (detail31.getVisibility() == view.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout31, new AutoTransition());
        detail31.setVisibility(v);

    }

    public void expand32(View view) {

        int v = (detail32.getVisibility() == view.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout32, new AutoTransition());
        detail32.setVisibility(v);
    }

    public void expand33(View view) {
        int v = (detail33.getVisibility() == view.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout33, new AutoTransition());
        detail33.setVisibility(v);
    }

    public void expand34(View view) {
        int v = (detail34.getVisibility() == view.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout34, new AutoTransition());
        detail34.setVisibility(v);
    }
}