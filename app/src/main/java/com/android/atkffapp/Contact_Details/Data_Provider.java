package com.android.atkffapp.Contact_Details;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Data_Provider {
    public static HashMap<String, List<String>> getInfo() {
        HashMap<String, List<String>> Member_Details = new HashMap<String, List<String>>();
        //Here Member_Details is the HashMap
        List<String> PRADIP_CHAKROBARTY = new ArrayList<String>();
        PRADIP_CHAKROBARTY.add("Designation   : President");
        PRADIP_CHAKROBARTY.add("Hello         : 8013456238");
        PRADIP_CHAKROBARTY.add("Location      : Bagmari,Kolkata");
        PRADIP_CHAKROBARTY.add("Facebook link : Self-Employee");

        List<String> ABIR_SAHA = new ArrayList<String>();
        ABIR_SAHA.add("Designation   : General Secretary");
        ABIR_SAHA.add("Hello         : 8013456238");
        ABIR_SAHA.add("Location      : Bagmari,Kolkata");
        ABIR_SAHA.add("Facebook link : Self-Employee");

        List<String> ARITRA_DUTTA = new ArrayList<String>();
        ARITRA_DUTTA.add("Designation   : Treasurer");
        ARITRA_DUTTA.add("Hello         : 8013456238");
        ARITRA_DUTTA.add("Location      : Bagmari,Kolkata");
        ARITRA_DUTTA.add("Facebook link : Self-Employee");

        List<String> ANSUMAN_CHATTERJEE = new ArrayList<String>();
        ANSUMAN_CHATTERJEE.add("Designation   : Vice President");
        ANSUMAN_CHATTERJEE.add("Hello         : 8013456238");
        ANSUMAN_CHATTERJEE.add("Location      : Bagmari,Kolkata");
        ANSUMAN_CHATTERJEE.add("Facebook link : Self-Employee");

        List<String> ANJALI_CHAKRABORTY = new ArrayList<String>();
        ANJALI_CHAKRABORTY.add("Designation   : Assistant General Secretary");
        ANJALI_CHAKRABORTY.add("Hello         : 8013456238");
        ANJALI_CHAKRABORTY.add("Location      : Bagmari,Kolkata");
        ANJALI_CHAKRABORTY.add("Facebook link : Self-Employee");

        List<String> SOUVIK_DUTTA = new ArrayList<String>();
        SOUVIK_DUTTA.add("Designation   : Cultural Secretary");
        SOUVIK_DUTTA.add("Hello         : 8013456238");
        SOUVIK_DUTTA.add("Location      : Bagmari,Kolkata");
        SOUVIK_DUTTA.add("Facebook link : Self-Employee");

        List<String> PAYEL_SENGUPTA = new ArrayList<String>();
        PAYEL_SENGUPTA.add("Designation   : Public Relation");
        PAYEL_SENGUPTA.add("Hello         : 8013456238");
        PAYEL_SENGUPTA.add("Location      : Bagmari,Kolkata");
        PAYEL_SENGUPTA.add("Facebook link : Self-Employee");

        List<String> SANJOY_DAS = new ArrayList<String>();
        SANJOY_DAS.add("Designation   : Game Secretary");
        SANJOY_DAS.add("Hello         : 8013456238");
        SANJOY_DAS.add("Location      : Bagmari,Kolkata");
        SANJOY_DAS.add("Facebook link : Self-Employee");

        List<String> PRATIK_BOSE = new ArrayList<String>();
        PRATIK_BOSE.add("Designation   : Media Co-Ordinator");
        PRATIK_BOSE.add("Hello         : 8013456238");
        PRATIK_BOSE.add("Location      : Bagmari,Kolkata");
        PRATIK_BOSE.add("Facebook link : Self-Employee");

        List<String> SAYAN_CHAKRABORTY = new ArrayList<String>();
        SAYAN_CHAKRABORTY.add("Designation   : Executive Committee Head");
        SAYAN_CHAKRABORTY.add("Hello         : 8013456238");
        SAYAN_CHAKRABORTY.add("Location      : Bagmari,Kolkata");
        SAYAN_CHAKRABORTY.add("Facebook link : Self-Employee");


        Member_Details.put("PRADIP CHAKROBARTY", PRADIP_CHAKROBARTY );
        Member_Details.put("ABIR SAHA", ABIR_SAHA);
        Member_Details.put("ARITRA DUTTA", ARITRA_DUTTA);
        Member_Details.put("ANSUMAN CHATTERJEE", ANSUMAN_CHATTERJEE);
        Member_Details.put("ANJALI CHAKRABORTY", ANJALI_CHAKRABORTY);
        Member_Details.put("SOUVIK DUTTA", SOUVIK_DUTTA);
        Member_Details.put("PAYEL SENGUPTA", PAYEL_SENGUPTA);
        Member_Details.put("SANJOY DAS", SANJOY_DAS);
        Member_Details.put("PRATIK BOSE", PRATIK_BOSE);
        Member_Details.put("SAYAN CHAKRABORTY", SAYAN_CHAKRABORTY);

        return Member_Details;

    }
}
