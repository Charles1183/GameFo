package com.example.metalgear.gamefo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LectureBuilding extends AppCompatActivity {
    // URL Address
    protected String url = "http://bloodborne.wiki.fextralife.com/Lecture+Building";
    protected ProgressDialog mProgressDialog;

    //Location information text
    protected ArrayList<String> areaOverview = new ArrayList<>();
    //Header lists
    protected ArrayList <String> headerList = new ArrayList<>();
    //Content item lists
    protected ArrayList <String> npcList = new ArrayList<>();
    protected ArrayList <String> bossList = new ArrayList<>();
    protected ArrayList <String> itemList = new ArrayList<>();
    protected ArrayList <String> enemyList = new ArrayList<>();
    //Hashmap for expandable lists
    protected HashMap<String, List<String>> lectureBuildingList = new HashMap<String, List<String>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture_building);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent intent = new Intent(LectureBuilding.this, Locations.class);
                startActivity(intent);
                finish();
            }
        });
        new LectureBuilding.Content().execute();

    }

    // Description AsyncTask
    private class Content extends AsyncTask<Void, Void, Void> {
        private int move = 0;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(LectureBuilding.this);
            mProgressDialog.setTitle("Loading Content, Please Stand By.");
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                // Connect to the web site
                Document document = Jsoup.connect(url).get();
                // Using Elements to get the Meta data
                Elements block = document.select("div[id=sub-main]");
                //List
                Elements lists = block.select("ul");
                //Headers
                Elements headers = block.select("h3");

                int h=0;
                for(int i=0; i< lists.size(); i++){
                    Element lst = lists.get(move);
                    Elements eles = lst.select("li");

                    //Not load "Lore" at index 4
                    switch(i){
                        case 0: headerList.add("Area Information");
                            for (Element it : eles) {
                                areaOverview.add(it.text());
                            }
                            move++;
                            break;
                        case 1: headerList.add(headers.get(h).text());
                            for (Element it : eles) {
                                npcList.add(it.text());
                            }
                            h++;
                            move++;
                            break;
                        case 2: headerList.add(headers.get(h).text());
                            for (Element it : eles) {
                                bossList.add(it.text());
                            }
                            h++;
                            move++;
                            break;
                        case 3:headerList.add(headers.get(h).text());
                            for (Element it : eles) {
                                itemList.add(it.text());
                            }
                            h++;
                            move++;
                            break;
                        case 4:headerList.add(headers.get(h).text());
                            for (Element it : eles) {
                                enemyList.add(it.text());
                            }
                            h++;
                            move++;
                            break;
                        default:break;
                    }
                }

                lectureBuildingList.put(headerList.get(0), areaOverview );// Area Info Header and Paragraph
                lectureBuildingList.put(headerList.get(1), npcList); // Header, Child data
                lectureBuildingList.put(headerList.get(2), bossList);
                lectureBuildingList.put(headerList.get(3), itemList);
                lectureBuildingList.put(headerList.get(4), enemyList);



            }catch (IOException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {

            LinearLayout lectureBuildingLayout = (LinearLayout) findViewById(R.id.lecture_building_layout);

            for(int h=0; h<headerList.size(); h++) {
                TextView headerText = new TextView(LectureBuilding.this);
                headerText.setText(headerList.get(h));
                headerText.setTextSize(20);
                //headerText.setTypeface(Typeface.create());
                headerText.setTextColor(Color.BLACK);
                headerText.setBackgroundColor(Color.rgb(217, 217, 217));
                headerText.setPadding(50,10,20,10);
                lectureBuildingLayout.addView(headerText);

                switch(h){
                    case 0:for (int i = 0; i < areaOverview.size(); i++) {
                        TextView contentText = new TextView(LectureBuilding.this);
                        contentText.setText(areaOverview.get(i));
                        contentText.setTextColor(Color.WHITE);
                        lectureBuildingLayout.addView(contentText);
                    }break;
                    case 1:for (int i = 0; i < npcList.size(); i++) {
                        TextView contentText = new TextView(LectureBuilding.this);
                        contentText.setText(npcList.get(i));
                        contentText.setTextColor(Color.WHITE);
                        lectureBuildingLayout.addView(contentText);
                    }break;
                    case 2: for (int i = 0; i < bossList.size(); i++) {
                        TextView contentText = new TextView(LectureBuilding.this);
                        contentText.setText(bossList.get(i));
                        contentText.setTextColor(Color.WHITE);
                        lectureBuildingLayout.addView(contentText);
                    }break;
                    case 3:for (int i = 0; i < itemList.size(); i++) {
                        TextView contentText = new TextView(LectureBuilding.this);
                        contentText.setText(itemList.get(i));
                        contentText.setTextColor(Color.WHITE);
                        lectureBuildingLayout.addView(contentText);
                    }break;
                    case 4:for (int i = 0; i < enemyList.size(); i++) {
                        TextView contentText = new TextView(LectureBuilding.this);
                        contentText.setText(enemyList.get(i));
                        contentText.setTextColor(Color.WHITE);
                        lectureBuildingLayout.addView(contentText);
                    }break;
                }
            }


            mProgressDialog.dismiss();
        }

    }
}
