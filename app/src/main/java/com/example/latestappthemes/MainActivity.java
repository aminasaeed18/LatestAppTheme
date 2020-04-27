package com.example.latestappthemes;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button bPink, bGreen, bOrange, bBlack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.text);
        bPink = (Button)findViewById(R.id.pink);
        bGreen = (Button)findViewById(R.id.green);
        bOrange = (Button)findViewById(R.id.orange);
        bBlack =(Button)findViewById(R.id.black);

        bPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(),Pink.class);
                startActivity(intent);
            }
        });
        bGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(),Green.class);
                startActivity(intent);
            }
        });
        bOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(),Orange.class);
                startActivity(intent);
            }
        });
        bBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(),Black.class);
                startActivity(intent);
            }
        });
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");
        Typeface MrDeHaviland = Typeface.createFromAsset(getAssets(), "fonts/MrDeHaviland-Regular.ttf");
        textView.setTypeface(Vidaloka);
    }
}
