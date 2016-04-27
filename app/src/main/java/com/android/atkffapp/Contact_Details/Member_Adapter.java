package com.android.atkffapp.Contact_Details;


import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.android.atkffapp.R;

import java.util.HashMap;
import java.util.List;

public class Member_Adapter extends BaseExpandableListAdapter{
    private Context ctx;
    private HashMap<String,List<String>> Members_name;
    private List<String> Member_list;

    public Member_Adapter(Context ctx, HashMap<String, List<String>> Members_name, List<String> Member_list)
    {
        this.ctx=ctx;
        this.Members_name= Members_name;
        this.Member_list= Member_list;
    }
    @Override
    public int getGroupCount()
    {
        return Member_list.size();
    }

    @Override
    public int getChildrenCount(int arg0)
    {
        return Members_name.get(Member_list.get(arg0)).size();//it'll return the number of subtitles available in each list
    }

    @Override
    public Object getGroup(int arg0)
    {
        return Member_list.get(arg0);//this will return the current title available in the list
    }

    @Override
    public Object getChild(int parent, int child)
    {
        return Members_name.get(Member_list.get(parent)).get(child);
    }

    @Override
    public long getGroupId(int arg0)
    {
        return arg0;
    }

    @Override
    public long getChildId(int parent, int child)
    {
        return child;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int parent, boolean isExpanded, View convertView, ViewGroup parentview)
    {
        String group_title= (String) getGroup(parent);
        if (convertView==null)
        {
            LayoutInflater inflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.contact_parent_layout,parentview,false);
        }
        TextView parent_textview= (TextView) convertView.findViewById(R.id.parent_txt);
        parent_textview.setTypeface(null, Typeface.BOLD);
        parent_textview.setText(group_title);
        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean LastChild, View convertView, ViewGroup parentview)
    {
        String child_title= (String) getChild(parent,child);
        if (convertView==null)//If no current convertview is proceed for the child then it will execute
        {
            LayoutInflater inflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.contact_child_layout,parentview,false);//thread argument is false
        }
        TextView child_textview= (TextView) convertView.findViewById(R.id.child_txt);
        child_textview.setText(child_title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
