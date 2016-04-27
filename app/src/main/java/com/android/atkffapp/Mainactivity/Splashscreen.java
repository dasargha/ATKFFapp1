package com.android.atkffapp.Mainactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.android.atkffapp.R;


public class Splashscreen extends Activity {  //extends give us to access the activity class

        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.splasscreen);

            Handler x= new Handler();
            x.postDelayed(new SplashscreenHandler(), 2500);
        }

        class SplashscreenHandler implements Runnable{	//implements give us to access the interface
            public void run() {
                startActivity(new Intent(getApplication(), MainActivity.class));
                Splashscreen.this.finish();
            }
        }
    }