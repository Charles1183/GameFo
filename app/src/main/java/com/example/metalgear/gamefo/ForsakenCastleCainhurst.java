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

public class ForsakenCastleCainhurst extends AppCompatActivity {
    // URL Address
    protected String url = "http://bloodborne.wiki.fextralife.com/Cainhurst+Castle";
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
    protected HashMap<String, List<String>> cainhurstCastleList = new HashMap<String, List<String>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forsaken_castle_cainhurst);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent intent = new Intent(ForsakenCastleCainhurst.this, Locations.class);
                startActivity(intent);
                finish();
            }
        });
        new ForsakenCastleCainhurst.Content().execute();

    }

    // Description AsyncTask
    private class Content extends AsyncTask<Void, Void, Void> {
        private int move = 0;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(ForsakenCastleCainhurst.this);
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
                //Paragraph text
                Elements text = block.select("p");
                //Headers
                Elements headers = block.select("h3");

                headerList.add("Area Information");
                areaOverview.add(text.get(0).text());
                Elements orderedList = block.select("ol");
                Element oLst = orderedList.get(0);
                Elements oEles = oLst.select("li");
                for(Element it:oEles){
                    areaOverview.add(it.text());
                }

                for(int i=0; i< lists.size(); i++){
                    Element lst = lists.get(move);
                    Elements eles = lst.select("li");

                    //Not load "Lore" at index 4
                    switch(i){
                        case 0: headerList.add(headers.get(i).text());
                            for (Element it : eles) {
                                npcList.add(it.text());
                            }
                            move++;
                            break;
                        case 1:headerList.add(headers.get(i).text());
                            for (Element it : eles) {
                                itemList.add(it.text());
                            }
                            move++;
                            break;
                        case 2:move++;
                            break;
                        case 3:headerList.add(headers.get(i).text());
                            for (Element it : eles) {
                                enemyList.add(it.text());
                            }
                            move++;
                            break;
                        case 4:headerList.add(headers.get(i).text());
                            for (Element it : eles) {
                                bossList.add(it.text());
                            }
                            move++;
                            break;
                        default:break;
                    }
                }

                cainhurstCastleList.put(headerList.get(0), areaOverview );// Area Info Header and Paragraph
                cainhurstCastleList.put(headerList.get(1), npcList); // Header, Child data
                cainhurstCastleList.put(headerList.get(2), itemList);
                cainhurstCastleList.put(headerList.get(3), enemyList);
                cainhurstCastleList.put(headerList.get(4), bossList);



            }catch (IOException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {

            LinearLayout cainhurstCastleLayout = (LinearLayout) findViewById(R.id.cainhurst_castle_layout);

            for(int h=0; h<headerList.size(); h++) {
                TextView headerText = new TextView(ForsakenCastleCainhurst.this);
                headerText.setText(headerList.get(h));
                //Styles
                headerText.setTextSize(20);
                //headerText.setTypeface(Typeface.create());
                headerText.setTextColor(Color.BLACK);
                headerText.setBackgroundColor(Color.rgb(217, 217, 217));
                headerText.setPadding(50,10,20,10);
                //Add text
                cainhurstCastleLayout.addView(headerText);

                switch(h){
                    case 0:for (int i = 0; i < areaOverview.size(); i++) {
                        TextView contentText = new TextView(ForsakenCastleCainhurst.this);
                        contentText.setText(areaOverview.get(i));
                        contentText.setTextColor(Color.WHITE);
                        cainhurstCastleLayout.addView(contentText);
                    }break;
                    case 1:for (int i = 0; i < npcList.size(); i++) {
                        TextView contentText = new TextView(ForsakenCastleCainhurst.this);
                        contentText.setText(npcList.get(i));
                        contentText.setTextColor(Color.WHITE);
                        cainhurstCastleLayout.addView(contentText);
                    }break;
                    case 2: for (int i = 0; i < itemList.size(); i++) {
                        TextView contentText = new TextView(ForsakenCastleCainhurst.this);
                        contentText.setText(itemList.get(i));
                        contentText.setTextColor(Color.WHITE);
                        cainhurstCastleLayout.addView(contentText);
                    }break;
                    case 3:
                        for (int i = 0; i < enemyList.size(); i++) {
                            TextView contentText = new TextView(ForsakenCastleCainhurst.this);
                            contentText.setText(enemyList.get(i));
                            contentText.setTextColor(Color.WHITE);
                            cainhurstCastleLayout.addView(contentText);
                    }break;
                    case 4:
                        for (int i = 0; i < bossList.size(); i++) {
                            TextView contentText = new TextView(ForsakenCastleCainhurst.this);
                            contentText.setText(bossList.get(i));
                            contentText.setTextColor(Color.WHITE);
                            cainhurstCastleLayout.addView(contentText);
                    }break;
                }
            }


            mProgressDialog.dismiss();
        }

    }
}
