package com.android.atkffapp.Gallery;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.atkffapp.R;

/**
 * Created by Argha on 05-04-2016.
 */
public class GalleryPhotoAdapter extends BaseAdapter {
    private Activity mActivity;

    public GalleryPhotoAdapter(Activity mActivityMain) {
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
            convertView = inflater.inflate(R.layout.gallery_photo_item, parent, false);

            // well set up the ViewHolder
            viewHolder = new ViewHolderItem();
            viewHolder.gal_pic = (ImageView) convertView.findViewById(R.id.gal_pic);

            // store the holder with the view.
            convertView.setTag(viewHolder);

        } else {
            // we've just avoided calling findViewById() on resource everytime
            // just use the viewHolder
            viewHolder = (ViewHolderItem) convertView.getTag();
        }

        viewHolder.gal_pic.getLayoutParams().height = getScreenDisplay(mActivity).heightPixels/4;
      //TODO set thumb image using picasso library
        return convertView;
    }

    // caches our TextView
    static class ViewHolderItem {
       ImageView gal_pic;
    }

    public static DisplayMetrics getScreenDisplay(Activity mActivity) {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        (mActivity).getWindowManager().getDefaultDisplay()
                .getMetrics(displaymetrics);
        return displaymetrics;
    }
}
