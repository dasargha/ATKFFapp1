package com.android.atkffapp.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.android.atkffapp.R;

public class Fragment_IndianFootballZone extends Fragment {

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_indianfootball, container, false);
        //return rootView; //return statement always use at the end

        // Getting an instance of the button button1 defined in main.xml
        button1 = (Button) rootView.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(), "i-league", Toast.LENGTH_LONG).show();
            }
        });

        button2 = (Button) rootView.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(), "fed cup", Toast.LENGTH_LONG).show();
            }
        });

        button3 = (Button) rootView.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(), "durand cup", Toast.LENGTH_LONG).show();
            }
        });

        button4 = (Button) rootView.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(), "national tournaments", Toast.LENGTH_LONG).show();
            }
        });

        return rootView;
    }
}