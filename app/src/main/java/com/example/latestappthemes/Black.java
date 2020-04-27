package com.example.latestappthemes;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Black extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black); TextView textView = (TextView)findViewById(R.id.text1);
        TextView textView2 = (TextView)findViewById(R.id.text2);
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");
        Typeface MrDeHaviland = Typeface.createFromAsset(getAssets(), "fonts/MrDeHaviland-Regular.ttf");

        textView.setTypeface(MrDeHaviland);
        textView2.setTypeface(MrDeHaviland);
    }
}
