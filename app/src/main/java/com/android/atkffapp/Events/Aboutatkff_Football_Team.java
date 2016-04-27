package com.android.atkffapp.Events;

/**
 * Created by Agnish on 4/9/2016.
 */

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.android.atkffapp.R;
import com.android.atkffapp.adapter.AboutFTAdapter;


public class Aboutatkff_Football_Team extends Activity {

    private ListView lv_footbalteam;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutatkff_ft_intent);

        initView();
    }

    private void initView() {
        Toolbar   mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("About Football Team");
        mToolbar.setTitleTextColor(Color.WHITE);

        lv_footbalteam = (ListView) findViewById(R.id.lv_footbalteam);
        AboutFTAdapter mAboutFTAdapter = new AboutFTAdapter(this);
        lv_footbalteam.setAdapter(mAboutFTAdapter);
    }
}
