package com.android.atkffapp.Mainactivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.android.atkffapp.Fragment.Fragment_AboutUs;
import com.android.atkffapp.Fragment.Fragment_ContactDetails;
import com.android.atkffapp.Fragment.Fragment_Events;
import com.android.atkffapp.Fragment.Fragment_Gallery;
import com.android.atkffapp.Fragment.Fragment_IndianFootballZone;
import com.android.atkffapp.Fragment.Fragment_Matches;
import com.android.atkffapp.Fragment.Fragment_Stories;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Fragment_Stories tab1 = new Fragment_Stories();
                return tab1;
            case 1:
                Fragment_Matches tab2 = new Fragment_Matches();
                return tab2;
            case 2:
                Fragment_Gallery tab3 = new Fragment_Gallery();
                return tab3;
            case 3:
                Fragment_IndianFootballZone tab4 = new Fragment_IndianFootballZone();
                return tab4;
            case 4:
                Fragment_Events tab5 = new Fragment_Events();
                return tab5;
            case 5:
                Fragment_AboutUs tab6 = new Fragment_AboutUs();
                return tab6;
            case 6:
                Fragment_ContactDetails tab7 = new Fragment_ContactDetails();
                return tab7;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
