package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import org.jsoup.nodes.Document;

public class GameFoMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_fo_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameFoMain.this, GameFoMain.class);
                startActivity(intent);
                finish();
            }
        });

        final Button demonsButton = (Button) findViewById(R.id.demons_button);
        final Button ds1Button = (Button) findViewById(R.id.ds1_button);
        final Button ds2Button = (Button) findViewById(R.id.ds2_button);
        final Button scholarButton = (Button) findViewById(R.id.scholar_button);
        final Button ds3Button = (Button) findViewById(R.id.ds3_button);
        final Button bloodborneButton = (Button) findViewById(R.id.bloodborne_button);

        demonsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(GameFoMain.this, Bloodborne.class);
                startActivity(intent);
                finish();
            }
        });
        ds1Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(GameFoMain.this, Bloodborne.class);
                startActivity(intent);
                finish();
            }
        });
        ds2Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(GameFoMain.this, Bloodborne.class);
                startActivity(intent);
                finish();
            }
        });
        scholarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(GameFoMain.this, Bloodborne.class);
                startActivity(intent);
                finish();
            }
        });
        ds3Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(GameFoMain.this, Bloodborne.class);
                startActivity(intent);
                finish();
            }
        });
        bloodborneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(GameFoMain.this, Bloodborne.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
