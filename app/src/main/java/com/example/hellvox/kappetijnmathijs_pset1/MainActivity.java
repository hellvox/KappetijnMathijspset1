package com.example.hellvox.kappetijnmathijs_pset1;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    // Initiate all variables
    CheckBox checkBox_arms,checkBox_ears,checkBox_eyebrows,checkBox_eyes,checkBox_glasses,checkBox_hat,
            checkBox_mouth,checkBox_mustache,checkBox_nose,checkBox_shoes;
    LinearLayout Arms,Ears,Eyebrows,Eyes,Glasses,Hat,Mouth,Mustache,Nose,Shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Give the variables the correct value.
        checkBox_arms = (CheckBox) findViewById(R.id.checkBox_arms);
        checkBox_ears = (CheckBox) findViewById(R.id.checkBox_ears);
        checkBox_eyebrows = (CheckBox) findViewById(R.id.checkBox_eyebrows);
        checkBox_eyes = (CheckBox) findViewById(R.id.checkBox_eyes);
        checkBox_glasses = (CheckBox) findViewById(R.id.checkBox_glasses);
        checkBox_hat = (CheckBox) findViewById(R.id.checkBox_hat);
        checkBox_mouth = (CheckBox) findViewById(R.id.checkBox_mouth);
        checkBox_mustache = (CheckBox) findViewById(R.id.checkBox_mustache);
        checkBox_nose = (CheckBox) findViewById(R.id.checkBox_nose);
        checkBox_shoes = (CheckBox) findViewById(R.id.checkBox_shoes);
        Arms=(LinearLayout)this.findViewById(R.id.Arms);
        Ears=(LinearLayout)this.findViewById(R.id.Ears);
        Eyebrows=(LinearLayout)this.findViewById(R.id.Eyebrows);
        Eyes=(LinearLayout)this.findViewById(R.id.Eyes);
        Glasses=(LinearLayout)this.findViewById(R.id.Glasses);
        Hat=(LinearLayout)this.findViewById(R.id.Hat);
        Mouth=(LinearLayout)this.findViewById(R.id.Mouth);
        Mustache=(LinearLayout)this.findViewById(R.id.Mustache);
        Nose=(LinearLayout)this.findViewById(R.id.Nose);
        Shoes=(LinearLayout)this.findViewById(R.id.Shoes);

        //Set the checkbox listener to make the checkboxes work( visible vs invisible)
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
    //Function to restore the state of the checkboxes.
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Arms.setVisibility(savedInstanceState.getInt("Arms Visibility"));
        Eyes.setVisibility(savedInstanceState.getInt("Eyes Visibility"));
        Eyebrows.setVisibility(savedInstanceState.getInt("Eyebrows Visibility"));
        Ears.setVisibility(savedInstanceState.getInt("Ears Visibility"));
        Glasses.setVisibility(savedInstanceState.getInt("Glasses Visibility"));
        Hat.setVisibility(savedInstanceState.getInt("Hat Visibility"));
        Mouth.setVisibility(savedInstanceState.getInt("Mouth Visibility"));
        Mustache.setVisibility(savedInstanceState.getInt("Mustache Visibility"));
        Nose.setVisibility(savedInstanceState.getInt("Nose Visibility"));
        Shoes.setVisibility(savedInstanceState.getInt("Shoes Visibility"));
        super.onRestoreInstanceState(savedInstanceState);
    }

    //Function to save the current value of the checbboxes to the given key.
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("Arms Visibility", Arms.getVisibility());
        savedInstanceState.putInt("Eyes Visibility", Eyes.getVisibility());
        savedInstanceState.putInt("Eyebrows Visibility", Eyebrows.getVisibility());
        savedInstanceState.putInt("Ears Visibility", Ears.getVisibility());
        savedInstanceState.putInt("Glasses Visibility", Glasses.getVisibility());
        savedInstanceState.putInt("Hat Visibility", Hat.getVisibility());
        savedInstanceState.putInt("Mouth Visibility", Mouth.getVisibility());
        savedInstanceState.putInt("Mustache Visibility", Mustache.getVisibility());
        savedInstanceState.putInt("Nose Visibility", Nose.getVisibility());
        savedInstanceState.putInt("Shoes Visibility", Shoes.getVisibility());
        super.onSaveInstanceState(savedInstanceState);
    }
}

