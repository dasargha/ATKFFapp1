package com.android.atkffapp.CustomTab;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.android.atkffapp.R;
import com.android.atkffapp.adapter.MatchFixtureAdapter;
import com.android.atkffapp.adapter.MatchStandingsAdapter;

/**
 * Created by Argha on 05-04-2016.
 */
public class MatchesStandingsTab {
    private Activity mActivity;
    private ListView lv_standing;

    public MatchesStandingsTab(Activity mActivity) {
        this.mActivity = mActivity;

    }

    public void addView() {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        LayoutInflater inflater = (LayoutInflater) mActivity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ((RelativeLayout) mActivity
                .findViewById(R.id.inflter_matches_sub_tab)).removeAllViews();
        ((RelativeLayout) mActivity
                .findViewById(R.id.inflter_matches_sub_tab)).addView(
                inflater.inflate((R.layout.inflater_matches_standing), null),
                params);

        // setAnimation();
        initView();
    }

    private void initView() {

        lv_standing = (ListView)mActivity.findViewById(R.id.lv_standing);
        MatchStandingsAdapter mMatchStandingsAdapter = new MatchStandingsAdapter(mActivity);
        lv_standing.setAdapter(mMatchStandingsAdapter);
    }
}
