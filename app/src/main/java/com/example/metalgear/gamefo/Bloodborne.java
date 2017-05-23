package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bloodborne extends AppCompatActivity {
    ExpandableListView expListView;
    ExpandableListAdapter expListAdapter;
    //Header lists
    protected ArrayList <String> parentList;
    //Hashmap for expandable lists
    protected HashMap<String, List<String>> optionsList = new HashMap<String, List<String>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodborne);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent intent = new Intent(Bloodborne.this, GameFoMain.class);
                startActivity(intent);
                finish();
            }
        });


        expListView = (ExpandableListView) findViewById(R.id.exp_bloodborne_list);
        prepareListData();
        expListAdapter =new ExpandableListAdapter(Bloodborne.this, parentList, optionsList);
        expListView.setAdapter(expListAdapter);

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub

                switch(optionsList.get(parentList.get(groupPosition)).get(
                        childPosition)){
                    case "Locations":Intent localIntent = new Intent(Bloodborne.this, Locations.class);
                            startActivity(localIntent);
                            finish();
                            break;
                    case "Enemies":Intent enemiesIntent = new Intent(Bloodborne.this, Enemies.class);
                        startActivity(enemiesIntent);
                        finish();
                        break;
                    case "NPCs":Intent npcsIntent = new Intent(Bloodborne.this, NPCs.class);
                        startActivity(npcsIntent);
                        finish();
                        break;
                    default:Intent defaultIntent = new Intent(Bloodborne.this, GameFoMain.class);
                        startActivity(defaultIntent);
                        finish();
                }

                Toast.makeText(
                        getApplicationContext(),
                        parentList.get(groupPosition)
                                + " : "
                                + optionsList.get(
                                parentList.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });

    }
    private void prepareListData() {
        parentList = new ArrayList<String>();
        optionsList = new HashMap<String, List<String>>();

        // Adding parent data
        parentList.add("World");

        // Adding child data
        List<String> worldList = new ArrayList<String>();
        worldList.add("Locations");
        worldList.add("Enemies");
        worldList.add("NPCs");



        optionsList.put(parentList.get(0), worldList);// Header, Child data

    }
}
