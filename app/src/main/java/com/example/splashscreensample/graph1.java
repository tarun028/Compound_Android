package com.example.splashscreensample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class graph1 extends AppCompatActivity {
TextView detail1,detail2,detail3,detail4;
LinearLayout layout1,layout2,layout3,layout4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph1);

        detail1 = findViewById(R.id.detail1);
        detail2 = findViewById(R.id.detail2);
        detail3 = findViewById(R.id.detail3);
        detail4 = findViewById(R.id.detail4);
        layout1 = findViewById(R.id.layout1);
        layout2 = findViewById(R.id.layout2);
        layout3 = findViewById(R.id.layout3);
        layout4 = findViewById(R.id.layout4);
    }


    public void expand1(View view) {

        int v = (detail1.getVisibility() == view.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        detail1.setVisibility(v);

    }

    public void expand2(View view) {

        int v = (detail2.getVisibility() == view.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout2, new AutoTransition());
        detail2.setVisibility(v);
    }

    public void expand3(View view) {
        int v = (detail3.getVisibility() == view.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout3, new AutoTransition());
        detail3.setVisibility(v);
    }

    public void expand4(View view) {
        int v = (detail4.getVisibility() == view.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout4, new AutoTransition());
        detail4.setVisibility(v);
    }
}
