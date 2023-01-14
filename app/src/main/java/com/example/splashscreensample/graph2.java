package com.example.splashscreensample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class graph2 extends AppCompatActivity {
    TextView detail21,detail22,detail23,detail24;
    LinearLayout layout21,layout22,layout23,layout24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph2);

        detail21 = findViewById(R.id.detail21);
        detail22 = findViewById(R.id.detail22);
        detail23 = findViewById(R.id.detail23);
        detail24 = findViewById(R.id.detail24);
        layout21 = findViewById(R.id.layout21);
        layout22 = findViewById(R.id.layout22);
        layout23 = findViewById(R.id.layout23);
        layout24 = findViewById(R.id.layout24);


    }

    public void expand21(View view) {

        int v = (detail21.getVisibility() == view.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout21, new AutoTransition());
        detail21.setVisibility(v);

    }

    public void expand22(View view) {

        int v = (detail22.getVisibility() == view.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout22, new AutoTransition());
        detail22.setVisibility(v);
    }

    public void expand23(View view) {
        int v = (detail23.getVisibility() == view.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout23, new AutoTransition());
        detail23.setVisibility(v);
    }

    public void expand24(View view) {
        int v = (detail24.getVisibility() == view.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout24, new AutoTransition());
        detail24.setVisibility(v);
    }
}