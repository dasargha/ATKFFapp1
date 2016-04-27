package com.android.atkffapp.Events;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.android.atkffapp.R;

public class AboutATKFF_TeamsTab implements View.OnClickListener{
    private Activity mActivity;
    private RelativeLayout rl_cricket_team , rl_football_team;

    public AboutATKFF_TeamsTab(Activity mActivity) {
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
                inflater.inflate((R.layout.inflater_teams), null),
                params);
        initView();
    }

    private void initView() {
        rl_cricket_team  = (RelativeLayout)mActivity.findViewById(R.id.rl_cricket_team);
        rl_football_team = (RelativeLayout)mActivity.findViewById(R.id.rl_football_team);

        rl_cricket_team.setOnClickListener(this);
        rl_football_team.setOnClickListener(this);
    }


    @Override

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rl_cricket_team:
                Intent intent = new Intent(mActivity,Aboutatkff_Cricket_Team.class);
                mActivity.startActivity(intent);
                break;

            case R.id.rl_football_team:
                intent = new Intent(mActivity,Aboutatkff_Football_Team.class);
                mActivity.startActivity(intent);
                break;
        }
    }
}
