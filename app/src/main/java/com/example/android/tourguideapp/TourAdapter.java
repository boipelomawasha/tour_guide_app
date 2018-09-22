package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {

    /** Resource ID for the background color */
    private int mColorResourceId;

    /**
     *
     * @param context this is the current context
     * @param tours the list of items to be displayed
     * @param colorResourceId is the resource ID for the background color
     */
    public TourAdapter(Context context, ArrayList<Tour> tours, int colorResourceId){
        super(context, 0 , tours);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Check if an existing view is being reused, otherwise inflate the view
        if (null == convertView) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        Tour currentTour = getItem(position);

        // Find the TextView in the item_list.xml layout with the ID address_text_view.
        TextView addressTextView = convertView.findViewById(R.id.address_text_view);
        // Get the address from the currentTour object and set this text on
        // the Address TextView.
        addressTextView.setText(currentTour.getAddressId());

        // Find the TextView in the item_list.xml layout with the ID highlights_text_view.
        TextView highlightsTextView = convertView.findViewById(R.id.highlights_text_view);
        // Get the address from the currentTour object and set this text on
        // the Highlights TextView.
        highlightsTextView.setText(currentTour.getHighlightsId());

        // Find the TextView in the item_list.xml layout with the ID details_text_view.
        TextView detailsTextView = convertView.findViewById(R.id.details_text_view);
        // Get the address from the currentTour object and set this text on
        // the Details TextView.
        detailsTextView.setText(currentTour.getDetailsId());

        // Find and set the image
        ImageView imageView = convertView.findViewById(R.id.picture);

        imageView.setImageResource(currentTour.getImageResourceId());

        // Set the theme color for the list item
        View fragmentContainer = convertView.findViewById(R.id.fragment_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        fragmentContainer.setBackgroundColor(color);

        return convertView;
    }
}
