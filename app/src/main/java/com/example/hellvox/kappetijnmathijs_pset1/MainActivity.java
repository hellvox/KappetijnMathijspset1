package com.example.hellvox.kappetijnmathijs_pset1;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox checkBox_arms = (CheckBox) findViewById(R.id.checkBox_arms);
        final CheckBox checkBox_ears = (CheckBox) findViewById(R.id.checkBox_ears);
        final CheckBox checkBox_eyebrows = (CheckBox) findViewById(R.id.checkBox_eyebrows);
        final CheckBox checkBox_eyes = (CheckBox) findViewById(R.id.checkBox_eyes);
        final CheckBox checkBox_glasses = (CheckBox) findViewById(R.id.checkBox_glasses);
        final CheckBox checkBox_hat = (CheckBox) findViewById(R.id.checkBox_hat);
        final CheckBox checkBox_mouth = (CheckBox) findViewById(R.id.checkBox_mouth);
        final CheckBox checkBox_mustache = (CheckBox) findViewById(R.id.checkBox_mustache);
        final CheckBox checkBox_nose = (CheckBox) findViewById(R.id.checkBox_nose);
        final CheckBox checkBox_shoes = (CheckBox) findViewById(R.id.checkBox_shoes);
        final LinearLayout Arms=(LinearLayout)this.findViewById(R.id.Arms);
        final LinearLayout Ears=(LinearLayout)this.findViewById(R.id.Ears);
        final LinearLayout Eyebrows=(LinearLayout)this.findViewById(R.id.Eyebrows);
        final LinearLayout Eyes=(LinearLayout)this.findViewById(R.id.Eyes);
        final LinearLayout Glasses=(LinearLayout)this.findViewById(R.id.Glasses);
        final LinearLayout Hat=(LinearLayout)this.findViewById(R.id.Hat);
        final LinearLayout Mouth=(LinearLayout)this.findViewById(R.id.Mouth);
        final LinearLayout Mustache=(LinearLayout)this.findViewById(R.id.Mustache);
        final LinearLayout Nose=(LinearLayout)this.findViewById(R.id.Nose);
        final LinearLayout Shoes=(LinearLayout)this.findViewById(R.id.Shoes);
        checkBox_arms.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox_arms.isChecked()) {
                    Arms.setVisibility(View.VISIBLE);
                } else {
                    Arms.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_ears.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox_ears.isChecked()) {
                    Ears.setVisibility(View.VISIBLE);
                } else {
                    Ears.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_eyebrows.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox_eyebrows.isChecked()) {
                    Eyebrows.setVisibility(View.VISIBLE);
                } else {
                    Eyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_eyes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox_eyes.isChecked()) {
                    Eyes.setVisibility(View.VISIBLE);
                } else {
                    Eyes.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_glasses.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox_glasses.isChecked()) {
                    Glasses.setVisibility(View.VISIBLE);
                } else {
                    Glasses.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_hat.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox_hat.isChecked()) {
                    Hat.setVisibility(View.VISIBLE);
                } else {
                    Hat.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_mouth.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox_mouth.isChecked()) {
                    Mouth.setVisibility(View.VISIBLE);
                } else {
                    Mouth.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_mustache.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox_mustache.isChecked()) {
                    Mustache.setVisibility(View.VISIBLE);
                } else {
                    Mustache.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_nose.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox_nose.isChecked()) {
                    Nose.setVisibility(View.VISIBLE);
                } else {
                    Nose.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_shoes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox_shoes.isChecked()) {
                    Shoes.setVisibility(View.VISIBLE);
                } else {
                    Shoes.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
