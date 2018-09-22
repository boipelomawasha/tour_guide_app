package com.example.android.tourguideapp;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourItemsAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link TourItemsAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public TourItemsAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LocationFragment();
        } else if (position == 1) {
            return new HistoricalSiteFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else {
            return new WeBackHomeFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.location);
        } else if (position == 1) {
            return mContext.getString(R.string.historical_site);
        } else if (position == 2) {
            return mContext.getString(R.string.restaurant);
        } else {
            return mContext.getString(R.string.we_back_home);
        }
    }

}