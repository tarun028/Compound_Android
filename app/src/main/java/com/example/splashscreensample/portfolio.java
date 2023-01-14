package com.example.splashscreensample;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class portfolio extends AppCompatActivity {

    TextView largeCapDetail;
    TextView govtBondDetail;
    TextView commoditiesDetail;
    TextView mutualFundDetail;
    LinearLayout largeCapTitle;
    LinearLayout govtBondTitle;
    LinearLayout commoditiesTitle;
    LinearLayout mutualFundTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        largeCapDetail = findViewById(R.id.largeCapDetail);
        govtBondDetail = findViewById(R.id.govtBondDetail);
        commoditiesDetail = findViewById(R.id.commoditiesDetail);
        mutualFundDetail = findViewById(R.id.mutualFundDetail);
        largeCapTitle = findViewById(R.id.largeCapTitle);
        govtBondTitle = findViewById(R.id.govtBondTitle);
        commoditiesTitle = findViewById(R.id.commoditiesTitle);
        mutualFundTitle = findViewById(R.id.mutualFundTitle);
        largeCapTitle.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        govtBondTitle.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        commoditiesTitle.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        mutualFundTitle.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

    }

    public void expand1(View view) {
        int v = (largeCapDetail.getVisibility()==View.GONE)?View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(largeCapTitle, new AutoTransition());
        largeCapDetail.setVisibility(v);
    }
    public void expand2(View view) {
        int v = (govtBondDetail.getVisibility()==View.GONE)?View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(govtBondTitle, new AutoTransition());
        govtBondDetail.setVisibility(v);
    }
    public void expand3(View view) {
        int v = (commoditiesDetail.getVisibility()==View.GONE)?View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(commoditiesTitle, new AutoTransition());
        commoditiesDetail.setVisibility(v);
    }
    public void expand4(View view) {
        int v = (mutualFundDetail.getVisibility()==View.GONE)?View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(mutualFundTitle, new AutoTransition());
        mutualFundDetail.setVisibility(v);
    }
}