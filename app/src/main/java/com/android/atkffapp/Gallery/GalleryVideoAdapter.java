package com.android.atkffapp.Gallery;

import android.app.Activity;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.atkffapp.R;

/**
 * Created by Argha on 05-04-2016.
 */
public class GalleryVideoAdapter extends BaseAdapter implements View.OnClickListener {
    private Activity mActivity;

    public GalleryVideoAdapter(Activity mActivityMain) {
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
            convertView = inflater.inflate(R.layout.gallery_video_item, parent, false);

            // well set up the ViewHolder
            viewHolder = new ViewHolderItem();
            viewHolder.gal_video_thmb = (ImageView) convertView.findViewById(R.id.gal_video_thmb);
            viewHolder.play = (ImageButton) convertView.findViewById(R.id.play);
            viewHolder.ic_gal_share = (ImageView) convertView.findViewById(R.id.ic_gal_share);

            viewHolder.play.setOnClickListener(this);
            viewHolder.ic_gal_share.setOnClickListener(this);
            // store the holder with the view.
            convertView.setTag(viewHolder);

        } else {
            // we've just avoided calling findViewById() on resource everytime
            // just use the viewHolder
            viewHolder = (ViewHolderItem) convertView.getTag();


        }

        viewHolder.gal_video_thmb.getLayoutParams().height = getScreenDisplay(mActivity).heightPixels / 4;
        //TODO set thumb image using picasso library
        return convertView;
    }

    private void shareIntent() {

        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Here is the share content body";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        mActivity.startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }

    // caches our TextView
    static class ViewHolderItem {
        ImageView gal_video_thmb, ic_gal_share;
        ImageButton play;
    }

    public static DisplayMetrics getScreenDisplay(Activity mActivity) {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        (mActivity).getWindowManager().getDefaultDisplay()
                .getMetrics(displaymetrics);
        return displaymetrics;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.play:
                Toast.makeText(mActivity, "PLay video", Toast.LENGTH_SHORT).show();

                break;
            case R.id.ic_gal_share:
                shareIntent();
                break;
        }
    }

}
