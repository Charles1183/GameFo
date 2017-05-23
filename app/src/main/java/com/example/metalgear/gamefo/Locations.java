package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import android.widget.RelativeLayout;

public class Locations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent intent = new Intent(Locations.this, Bloodborne.class);
                startActivity(intent);
                finish();
            }
        });

        final Button yharnamSlideButton = (Button) findViewById(R.id.yharnam_button);
        final Button dreamSlideButton = (Button) findViewById(R.id.dream_button);
        final Button frontierSlideButton = (Button) findViewById(R.id.frontier_button);
        final Button unseenSlideButton = (Button) findViewById(R.id.unseen_button);
        final Button nightmareSlideButton = (Button) findViewById(R.id.nightmare_button);
        final Button oldHuntersSlideButton = (Button) findViewById(R.id.oldHunters_button);

        //Loads the Yharnam Fragment as default
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        YharnamFragment yharnamFragment = new YharnamFragment();
        fragmentTransaction.replace(R.id.content, yharnamFragment);
        fragmentTransaction.commit();

        yharnamSlideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                YharnamFragment yharnamFragment = new YharnamFragment();
                fragmentTransaction.replace(R.id.content, yharnamFragment);
                fragmentTransaction.commit();
            }
        });

        dreamSlideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                DreamFragment dreamFragment = new DreamFragment();
                fragmentTransaction.replace(R.id.content, dreamFragment);
                fragmentTransaction.commit();
            }
        });

        frontierSlideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FrontierFragment frontierFragment = new FrontierFragment();
                fragmentTransaction.replace(R.id.content, frontierFragment);
                fragmentTransaction.commit();
            }
        });

        unseenSlideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                UnseenFragment unseenFragment = new UnseenFragment();
                fragmentTransaction.replace(R.id.content, unseenFragment);
                fragmentTransaction.commit();
            }
        });

        nightmareSlideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                NightmareFragment nightmareFragment = new NightmareFragment();
                fragmentTransaction.replace(R.id.content, nightmareFragment);
                fragmentTransaction.commit();
            }
        });

        oldHuntersSlideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                OldHuntersFragment oldHuntersFragment = new OldHuntersFragment();
                fragmentTransaction.replace(R.id.content, oldHuntersFragment);
                fragmentTransaction.commit();
            }
        });

    }

}
