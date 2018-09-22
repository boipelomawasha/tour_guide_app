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
public class WeBackHomeFragment extends Fragment {


    public WeBackHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.details_list_view, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();

        tours.add(new Tour(R.drawable.we_back_home, R.string.we_back_home_address, R.string.we_back_home_highlights, R.string.we_back_home_details));

        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.app_background);

        ListView listView = rootView.findViewById(R.id.tlList);

        listView.setAdapter(adapter);

        return rootView;
    }

}