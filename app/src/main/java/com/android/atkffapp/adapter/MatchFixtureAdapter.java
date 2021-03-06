package com.android.atkffapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.atkffapp.R;

/**
 * Created by Argha on 05-04-2016.
 */
public class MatchFixtureAdapter extends BaseAdapter {
    private Activity mActivity;

    public MatchFixtureAdapter(Activity mActivityMain) {
        this.mActivity = mActivityMain;
    }

    @Override
    public int getCount() {
        return 50;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolderItem viewHolder;

        if (convertView == null) {

            // inflate the layout
            LayoutInflater inflater = (mActivity).getLayoutInflater();
            convertView = inflater.inflate(R.layout.match_fixture_item, parent, false);

            // well set up the ViewHolder
            viewHolder = new ViewHolderItem();
            viewHolder.matches_count = (TextView) convertView.findViewById(R.id.matches_count);

            // store the holder with the view.
            convertView.setTag(viewHolder);

        } else {
            // we've just avoided calling findViewById() on resource everytime
            // just use the viewHolder
            viewHolder = (ViewHolderItem) convertView.getTag();
        }

        viewHolder.matches_count.setText(String.valueOf(position+1));
        return convertView;
    }

    // caches our TextView
    static class ViewHolderItem {
        TextView matches_count;
    }
}
