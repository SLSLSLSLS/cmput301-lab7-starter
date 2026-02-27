package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_CITY_NAME = "CITY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityText = findViewById(R.id.text_city);
        Button backButton = findViewById(R.id.button_back);

        String city = getIntent().getStringExtra(EXTRA_CITY_NAME);
        if (city == null) city = "";

        cityText.setText(city);

        backButton.setOnClickListener(v -> finish());
    }
}