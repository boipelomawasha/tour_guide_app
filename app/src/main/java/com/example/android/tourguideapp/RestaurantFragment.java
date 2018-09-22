package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.details_list_view, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();

        // Add the details for the tour
        tours.add(new Tour(R.drawable.quintos_pizza, R.string.restaurant_address, R.string.restaurant_highlights, R.string.restaurant_details));

        // Create an adaptor and set the background
        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.app_background);

        // Find the {@link ListView} object
        ListView listView = rootView.findViewById(R.id.tlList);

        // Make the {@link ListView} use the {@link TourAdapter} we created above
        listView.setAdapter(adapter);

        return rootView;
    }

}
