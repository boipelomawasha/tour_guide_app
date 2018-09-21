package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the location
        TextView location = findViewById(R.id.location);

        // Set a click listener on that View
        location.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the location is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LocationActivity}
                Intent locationIntent = new Intent(MainActivity.this, LocationActivity.class);

                // Start the new activity
                startActivity(locationIntent);
            }
        });

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the historical site
        TextView historical_site = findViewById(R.id.historical_site);

        // Set a click listener on that View
        historical_site.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the historical site is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HistoricalSiteActivity}
                Intent historicalSiteIntent = new Intent(MainActivity.this, HistoricalSiteActivity.class);

                // Start the new activity
                startActivity(historicalSiteIntent);
            }
        });

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the restaurant
        TextView restaurant = findViewById(R.id.restaurant);

        // Set a click listener on that View
        restaurant.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the restaurant is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantActivity}
                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);

                // Start the new activity
                startActivity(restaurantIntent);
            }
        });

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Thaba Nchu Easter Festival
        TextView easterFestival = findViewById(R.id.easter_festival);

        // Set a click listener on that View
        easterFestival.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when Thaba Nchu Easter Festival is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ThabaNchuEasterFestivalActivity}
                Intent easterFestivalIntent = new Intent(MainActivity.this, ThabaNchuEasterFestivalActivity.class);

                // Start the new activity
                startActivity(easterFestivalIntent);
            }
        });

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows We Back Home
        TextView weBackHome = findViewById(R.id.we_back_home);

        // Set a click listener on that View
        weBackHome.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when We Back Home is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link WeBackHomeActivity}
                Intent weBackHomeIntent = new Intent(MainActivity.this, WeBackHomeActivity.class);

                // Start the new activity
                startActivity(weBackHomeIntent);
            }
        });

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the pictures
        TextView pictures = findViewById(R.id.pictures);

        // Set a click listener on that View
        pictures.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the pictures is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LocationActivity}
                Intent picturesIntent = new Intent(MainActivity.this, PicturesActivity.class);

                // Start the new activity
                startActivity(picturesIntent);
            }
        });

    }
}
