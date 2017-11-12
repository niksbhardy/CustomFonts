package com.example.customfonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface helvetica = Typeface.createFromAsset(getAssets(), "fonts/helvetica_35.ttf");
        Typeface geosans = Typeface.createFromAsset(getAssets(), "fonts/geosans_light.ttf");

        TextView tvHelvetica = (TextView)findViewById(R.id.tv_helvetica);
        tvHelvetica.setTypeface(helvetica);

        TextView tvGeosans = (TextView)findViewById(R.id.tv_geosans);
        tvGeosans.setTypeface(geosans);
    }
}
