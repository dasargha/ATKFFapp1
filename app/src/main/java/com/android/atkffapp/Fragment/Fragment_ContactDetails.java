package com.android.atkffapp.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.android.atkffapp.Contact_Details.Data_Provider;
import com.android.atkffapp.Contact_Details.Member_Adapter;
import com.android.atkffapp.Mainactivity.MainActivity;
import com.android.atkffapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fragment_ContactDetails extends Fragment {

    private MainActivity mActivityMain;
    private HashMap<String, List<String>> Members_name;
    private List<String> Members_list;
    private ExpandableListView Exp_List;
    private Member_Adapter adapter; //initialise the object of Member_Adapter class

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contactdetails, container, false);

        return rootView;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mActivityMain = (MainActivity) activity;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Exp_List = (ExpandableListView) view.findViewById(R.id.expandableListView);
        Members_name = Data_Provider.getInfo();
        Members_list = new ArrayList<String>(Members_name.keySet()); //get all the value from HashMap
        adapter = new Member_Adapter(mActivityMain, Members_name, Members_list); //initialise the object,"this" is the context object
        Exp_List.setAdapter(adapter); //expandable listview set the adapter class

    }
}