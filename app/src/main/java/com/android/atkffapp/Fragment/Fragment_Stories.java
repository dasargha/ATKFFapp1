package com.android.atkffapp.Fragment;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.OnTabSelectedListener;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;

import com.android.atkffapp.Mainactivity.MainActivity;
import com.android.atkffapp.R;
import com.android.atkffapp.Stories.StoriesIndianfootballAdapter;
import com.android.atkffapp.Stories.StoriesIndianfootballTab;
import com.android.atkffapp.Stories.StoriesIslTab;

public class Fragment_Stories extends Fragment implements OnClickListener, OnTabSelectedListener {


    private Button btn_Isl, btn_IndianFootball;
    private MainActivity mActivityMain;
    private TabLayout tabLayout;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_stories, container, false);
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

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        initClickListener();
    }


    private void initViews(View view) {
        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("ISL"));
        tabLayout.addTab(tabLayout.newTab().setText("Indian Football"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        loadStoriesIsl();
    }

    private void loadStoriesIsl() {
        StoriesIslTab mStoriesIslTab = new StoriesIslTab(mActivityMain);
        mStoriesIslTab.addView();
    }

    private void loadStoriesIndianfootball() {
        StoriesIndianfootballTab mStoriesIndianfootballTab = new StoriesIndianfootballTab(mActivityMain);
        mStoriesIndianfootballTab.addView();
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
        switch (tab.getPosition()){
            case 0:
                loadStoriesIsl();
                break;
            case 1 :
                loadStoriesIndianfootball();
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