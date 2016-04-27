package com.android.atkffapp.Gallery;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.android.atkffapp.R;

/**
 * Created by Argha on 05-04-2016.
 */
public class GalleryVideoTab {
    private Activity mActivity;
    private ListView lv_video;

    public GalleryVideoTab(Activity mActivity) {
        this.mActivity = mActivity;

    }

    public void addView() {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        LayoutInflater inflater = (LayoutInflater) mActivity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ((RelativeLayout) mActivity
                .findViewById(R.id.inflter_gallery_sub_tab)).removeAllViews();
        ((RelativeLayout) mActivity
                .findViewById(R.id.inflter_gallery_sub_tab)).addView(
                inflater.inflate((R.layout.inflater_gallery_video), null),
                params);

        // setAnimation();
        initView();
    }

    private void initView() {

        lv_video = (ListView)mActivity.findViewById(R.id.lv_video);
        GalleryVideoAdapter mGalleryVideoAdapter = new GalleryVideoAdapter(mActivity);
        lv_video.setAdapter(mGalleryVideoAdapter);
    }
}
