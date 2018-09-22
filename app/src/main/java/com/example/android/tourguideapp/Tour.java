package com.example.android.tourguideapp;

public class Tour {

    /** Image resource ID for the word */
    private int mImageResourceId;

    /** String resource ID for the Address */
    private int mAddressId;

    /** String resource ID for the Highlights */
    private int mHighlightsId;

    /** String resource ID for the Details */
    private int mDetailsId;

    /**
     * Create new Tour object
     *
     * @param imageResourceId is the drawable resource ID for the image associated with the tour
     * @param addressId is the string resource ID for the Address
     * @param highlightsId is the string resource ID for the Highlights
     * @param detailsID is the string resource ID for the Details
     */

    public Tour(int imageResourceId, int addressId, int highlightsId, int detailsID){
        mImageResourceId = imageResourceId;
        mAddressId = addressId;
        mHighlightsId = highlightsId;
        mDetailsId = detailsID;
    }

    /**
     * Return the image resource ID of the tour.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the string resource ID for the Address
     */
    public int getAddressId(){
        return mAddressId;
    }

    /**
     * Get the string resource ID for the Highlights
     */
    public int getHighlightsId(){
        return mHighlightsId;
    }

    /**
     * Get the string resource ID for the Details
     */
    public int getDetailsId(){
        return mDetailsId;
    }
}
