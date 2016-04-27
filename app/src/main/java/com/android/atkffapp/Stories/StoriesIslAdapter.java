package com.android.atkffapp.Stories;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.android.atkffapp.R;


public class StoriesIslAdapter extends BaseAdapter {
    private Activity mActivity;

    public StoriesIslAdapter(Activity mActivityMain) {
        this.mActivity = mActivityMain;
    }

    @Override
    public int getCount() {
        return 15;
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
            convertView = inflater.inflate(R.layout.stories_islitem, parent, false);

            // well set up the ViewHolder
            viewHolder = new ViewHolderItem();
            viewHolder.story_pic = (ImageView) convertView.findViewById(R.id.story_isl);

            // store the holder with the view.
            convertView.setTag(viewHolder);

        } else {
            // we've just avoided calling findViewById() on resource everytime
            // just use the viewHolder
            viewHolder = (ViewHolderItem) convertView.getTag();
        }

        viewHolder.story_pic.getLayoutParams().height = getScreenDisplay(mActivity).heightPixels/4;
      //TODO set thumb image using picasso library
        return convertView;
    }

    // caches our TextView
    static class ViewHolderItem {
       ImageView story_pic;
    }

    public static DisplayMetrics getScreenDisplay(Activity mActivity) {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        (mActivity).getWindowManager().getDefaultDisplay()
                .getMetrics(displaymetrics);
        return displaymetrics;
    }
}
