package com.android.atkffapp.Events;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.android.atkffapp.R;

public class AboutATKFF_MembersTab {
    private Activity mActivity;
    private ListView lv_members;

    public AboutATKFF_MembersTab(Activity mActivity) {
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
                inflater.inflate((R.layout.inflater_members), null),
                params);

        initView();
    }

    private void initView() {
        lv_members  = (ListView)mActivity.findViewById(R.id.lv_members);
        AboutMemberAdapter mAboutMemberAdapter = new AboutMemberAdapter(mActivity);
        lv_members.setAdapter(mAboutMemberAdapter);
    }
}
