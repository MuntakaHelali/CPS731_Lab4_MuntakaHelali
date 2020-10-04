package com.example.carrecyclerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CarInformation extends AppCompatActivity {

    TextView carInformation;
    ImageView carImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_information);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        carInformation = (TextView) findViewById(R.id.txtInformation);
        carImage = (ImageView) findViewById(R.id.imageViewImage2);

        Bundle carBundle = getIntent().getExtras();
        if(carBundle != null){
            carInformation.setText(carBundle.getString("Information"));
            carImage.setImageResource(carBundle.getInt("Image"));
        }
    }
}