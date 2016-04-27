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
import com.android.atkffapp.adapter.AboutCTAdapter;


public class Aboutatkff_Cricket_Team extends Activity {
    private ListView lv_cricket_team;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_atkff_ct_intent);
        initView();
    }

    private void initView() {
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("About Cricket Team");
        mToolbar.setTitleTextColor(Color.WHITE);

        lv_cricket_team = (ListView) findViewById(R.id.lv_cricket_team);
        AboutCTAdapter aboutCTAdapter = new AboutCTAdapter(this);
        lv_cricket_team.setAdapter(aboutCTAdapter);
    }
}
