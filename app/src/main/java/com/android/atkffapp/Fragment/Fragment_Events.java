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

import com.android.atkffapp.Events.AboutATKFF_TeamsTab;
import com.android.atkffapp.Events.AboutATKFF_MembersTab;
import com.android.atkffapp.Events.AboutATKFF_EventsTab;
import com.android.atkffapp.R;

public class Fragment_Events extends Fragment implements OnClickListener, TabLayout.OnTabSelectedListener {

    private TabLayout tabLayout;
    private Activity mActivityMain;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_aboutatkff, container, false);

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mActivityMain = activity;
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
        tabLayout.addTab(tabLayout.newTab().setText("Teams"));
        tabLayout.addTab(tabLayout.newTab().setText("Members"));
        tabLayout.addTab(tabLayout.newTab().setText("Events"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        loadTeams();
    }

    private void loadTeams() {
        AboutATKFF_TeamsTab mAboutATKFF_TeamsTab = new AboutATKFF_TeamsTab(mActivityMain);
        mAboutATKFF_TeamsTab.addView();
    }

    private void loadMembers() {
        AboutATKFF_MembersTab mAboutATKFF_MembersTab = new AboutATKFF_MembersTab(mActivityMain);
        mAboutATKFF_MembersTab.addView();
    }


    private void loadEvents() {
        AboutATKFF_EventsTab mAboutATKFF_EventsTab = new AboutATKFF_EventsTab(mActivityMain);
        mAboutATKFF_EventsTab.addView();
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
                loadTeams();
                break;
            case 1:
                loadMembers();
                break;
            case 2:
                loadEvents();
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