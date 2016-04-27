package com.android.atkffapp.Fragment;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.atkffapp.Gallery.GalleryPhotoTab;
import com.android.atkffapp.Gallery.GalleryVideoTab;
import com.android.atkffapp.Mainactivity.MainActivity;
import com.android.atkffapp.R;

public class Fragment_Gallery extends Fragment implements OnClickListener, TabLayout.OnTabSelectedListener {

    private TabLayout tabLayout;
    private MainActivity mActivityMain;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gallary, container, false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mActivityMain = (MainActivity) activity;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        initClickListener();
    }


    private void initViews(View view) {
        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Photos"));
        tabLayout.addTab(tabLayout.newTab().setText("Videos"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        loadGalleryPhoto();
    }

    private void loadGalleryPhoto() {
        GalleryPhotoTab mGalleryPhotoTab = new GalleryPhotoTab(mActivityMain);
        mGalleryPhotoTab.addView();
    }

    private void loadGalleryVideo() {
        GalleryVideoTab mGalleryVideoTab = new GalleryVideoTab(mActivityMain);
        mGalleryVideoTab.addView();
    }


    private void initClickListener() {
        tabLayout.setOnTabSelectedListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        switch (tab.getPosition()) {
            case 0:
                loadGalleryPhoto();
                break;
            case 1:
                loadGalleryVideo();
                break;
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}