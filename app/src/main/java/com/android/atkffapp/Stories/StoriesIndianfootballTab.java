package com.android.atkffapp.Stories;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.android.atkffapp.Gallery.GalleryPhotoAdapter;
import com.android.atkffapp.R;

public class StoriesIndianfootballTab implements AdapterView.OnItemClickListener {
    private Activity mActivity;
    private ListView lv_indfootball;

    public StoriesIndianfootballTab(Activity mActivity) {
        this.mActivity = mActivity;

    }

    public void addView() {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        LayoutInflater inflater = (LayoutInflater) mActivity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ((RelativeLayout) mActivity
                .findViewById(R.id.inflter_stories_sub_tab)).removeAllViews();
        ((RelativeLayout) mActivity
                .findViewById(R.id.inflter_stories_sub_tab)).addView(
                inflater.inflate((R.layout.inflater_storiesindianfootball), null),
                params);

        // setAnimation();
        initView();
    }

    private void initView() {

        lv_indfootball = (ListView) mActivity.findViewById(R.id.lv_indfootball);
        StoriesIndianfootballAdapter mStoriesIndianfootballAdapter = new StoriesIndianfootballAdapter(mActivity);
        lv_indfootball.setAdapter(mStoriesIndianfootballAdapter);

        lv_indfootball.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent mIntent = new Intent(mActivity, NewsDetails.class);
        mActivity.startActivity(mIntent);
    }
}
