package com.example.splashscreensample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
CardView card1 , card2, graph1, graph2 , graph3 ;
Button help,start;
String whatsappUser ="+919818941865";
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card1= findViewById(R.id.card1);
        card2= findViewById(R.id.card2);
        graph1= findViewById(R.id.graph1);
        graph2= findViewById(R.id.graph2);
        graph3= findViewById(R.id.graph3);
        help = findViewById(R.id.help);
        start = findViewById(R.id.start);

        card1.setOnClickListener((View.OnClickListener) this);
        card2.setOnClickListener((View.OnClickListener) this);
        graph1.setOnClickListener((View.OnClickListener) this);
        graph2.setOnClickListener((View.OnClickListener) this);
        graph3.setOnClickListener((View.OnClickListener) this);
        start.setOnClickListener((View.OnClickListener) this);
        help.setOnClickListener(view -> {
            String url = "https://api.whatsapp.com/send?phone=" + whatsappUser;
            try {
                PackageManager pm = getApplicationContext().getPackageManager();
                pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            } catch (PackageManager.NameNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });





    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.card1:i=new Intent(this,portfolio.class);startActivity(i); break;
            case R.id.card2:i=new Intent(this,why.class);startActivity(i); break;
            case R.id.graph1:i=new Intent(this,graph1.class);startActivity(i); break;
            case R.id.graph2:i=new Intent(this,graph2.class);startActivity(i); break;
            case R.id.graph3:i=new Intent(this,graph3.class);startActivity(i); break;
            case R.id.start:i=new Intent(this,tabmain.class);startActivity(i); break;
        }

    }
}
