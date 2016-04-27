package com.android.atkffapp.Events;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.atkffapp.R;

/**
 * Created by user on 23-Apr-16.
 */
public class AboutEventsAdaper extends RecyclerView
        .Adapter<AboutEventsAdaper
        .DataObjectHolder> {
    private static ItemClickListener mItemClickListener;
    private Context mContext;

    public static class DataObjectHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView eventsname;
        TextView eventsdate;

        public DataObjectHolder(View itemView) {
            super(itemView);
            eventsname = (TextView) itemView.findViewById(R.id.eventsname);
            eventsdate = (TextView) itemView.findViewById(R.id.eventsdate);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mItemClickListener.onItemClick(getPosition(), v);
        }
    }

    public void setOnItemClickListener(ItemClickListener myClickListener) {
        this.mItemClickListener = myClickListener;
    }

    public AboutEventsAdaper(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.events_new_item, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
       /* holder.eventsdate.setText("");*/
    }

    public void addItem(/*DataObject dataObj,*/ int index) {
//        mDataset.add(dataObj);
        notifyItemInserted(index);
    }

    public void deleteItem(int index) {
//        mDataset.remove(index);
        notifyItemRemoved(index);
    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public interface ItemClickListener {
        public void onItemClick(int position, View v);
    }
}
