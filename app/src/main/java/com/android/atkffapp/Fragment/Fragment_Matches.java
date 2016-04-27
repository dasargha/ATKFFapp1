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

import com.android.atkffapp.CustomTab.MatchesFixtureTab;
import com.android.atkffapp.CustomTab.MatchesResultsTab;
import com.android.atkffapp.CustomTab.MatchesStandingsTab;
import com.android.atkffapp.Mainactivity.MainActivity;
import com.android.atkffapp.R;

public class Fragment_Matches extends Fragment implements OnClickListener, TabLayout.OnTabSelectedListener {

    private Activity mActivityMain;
    private TabLayout tabLayout;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_matches, container, false);

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mActivityMain =  activity;
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

    private void initViews(View rootView) {

        tabLayout = (TabLayout) rootView.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Fixture"));
        tabLayout.addTab(tabLayout.newTab().setText("Standings"));
        tabLayout.addTab(tabLayout.newTab().setText("Results"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        loadFixture();
    }

    private void loadFixture() {
        MatchesFixtureTab mMatchesFixtureTab = new MatchesFixtureTab(mActivityMain);
        mMatchesFixtureTab.addView();
    }

    private void loadStandings() {
        MatchesStandingsTab mMatchesStandingsTab = new MatchesStandingsTab(mActivityMain);
        mMatchesStandingsTab.addView();
    }


    private void loadResults() {
        MatchesResultsTab mMatchesResultsTab = new MatchesResultsTab(mActivityMain);
        mMatchesResultsTab.addView();
    }

    private void initClickListener() {
        tabLayout.setOnTabSelectedListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
        }
    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        switch (tab.getPosition()) {
            case 0:
                loadFixture();
                break;
            case 1:
                loadStandings();
                break;
            case 2:
                loadResults();
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