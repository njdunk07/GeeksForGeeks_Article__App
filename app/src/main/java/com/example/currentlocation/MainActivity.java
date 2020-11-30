package com.example.currentlocation;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar =  findViewById(R.id.toolbar);

        // Custom title
        TextView textCustomTitle = (TextView) findViewById(R.id.custom_title);

        // Custom font
        Typeface customFont = Typeface.createFromAsset(this.getAssets(), "fonts/Pacifico.ttf");

        // Set
        textCustomTitle.setTypeface(customFont);

        setSupportActionBar(toolbar);
    }
}