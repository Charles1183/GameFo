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

public class Enemies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enemies);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent intent = new Intent(Enemies.this, Bloodborne.class);
                startActivity(intent);
                finish();
            }
        });

        final Button bossesSlideButton = (Button) findViewById(R.id.bosses_button);
        final Button greatSlideButton = (Button) findViewById(R.id.great_ones_button);
        final Button chaliceSlideButton = (Button) findViewById(R.id.chalice_bosses_button);
        final Button dlcSlideButton = (Button) findViewById(R.id.dlc_bosses_button);

        //Loads the Bosses Fragment as default
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        BossesFragment bossesFragment = new BossesFragment();
        fragmentTransaction.replace(R.id.enemies_content, bossesFragment);
        fragmentTransaction.commit();


        bossesSlideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BossesFragment bossesFragment = new BossesFragment();
                fragmentTransaction.replace(R.id.enemies_content, bossesFragment);
                fragmentTransaction.commit();
            }
        });

        greatSlideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                GreatOnesFragment greatOnesFragment = new GreatOnesFragment();
                fragmentTransaction.replace(R.id.enemies_content, greatOnesFragment);
                fragmentTransaction.commit();
            }
        });

        chaliceSlideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ChaliceBossesFragment chaliceBossesFragment = new ChaliceBossesFragment();
                fragmentTransaction.replace(R.id.enemies_content, chaliceBossesFragment);
                fragmentTransaction.commit();
            }
        });

        dlcSlideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                DlcBossesFragment dlcBossesFragment = new DlcBossesFragment();
                fragmentTransaction.replace(R.id.enemies_content, dlcBossesFragment);
                fragmentTransaction.commit();
            }
        });
    }

}
