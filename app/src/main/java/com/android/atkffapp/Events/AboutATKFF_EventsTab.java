package com.android.atkffapp.Events;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.android.atkffapp.R;

public class AboutATKFF_EventsTab {
    private Activity mActivity;
    private ListView lv_events;


    /*23/04/2016*/

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public AboutATKFF_EventsTab(Activity mActivity) {
        this.mActivity = mActivity;

    }

    public void addView() {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        LayoutInflater inflater = (LayoutInflater) mActivity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ((RelativeLayout) mActivity
                .findViewById(R.id.inflter_aboutatkff_sub_tab)).removeAllViews();
        ((RelativeLayout) mActivity
                .findViewById(R.id.inflter_aboutatkff_sub_tab)).addView(
                inflater.inflate((R.layout.inflater_events), null),
                params);

        initView();
    }

    private void initView() {
        /*lv_events  = (ListView)mActivity.findViewById(R.id.lv_events);
        About_AtkffEventsAdapter mAbout_atkffEventsAdapter = new About_AtkffEventsAdapter(mActivity);
        lv_events.setAdapter(mAbout_atkffEventsAdapter);*/

        mRecyclerView = (RecyclerView) mActivity.findViewById(R.id.rv_events);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(mActivity ,2);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new AboutEventsAdaper((Context)mActivity);
        mRecyclerView.setAdapter(mAdapter);

        int spanCount = 2; // 3 columns
        int spacing = 20; // 50px
        boolean includeEdge = true;
        RecyclerView.ItemDecoration itemDecoration =
                new GridSpacingItemDecoration(spanCount, spacing, includeEdge);
        mRecyclerView.addItemDecoration(itemDecoration);
    }
}
