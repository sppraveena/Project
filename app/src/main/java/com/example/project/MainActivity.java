package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    //
    String[] nameArray = {"Kadai Chicken", "Biryani", "Chilli Chicken", "Paneer Butter Masala"};
//


    String[] infoArray = {
            "Spicy and flavorful", "Hyderbadi special", "Chinese special", "Kebabs and Tikkis Recipe"

    };
    ListView listView;
    // ListView search_food;
    Timer timer;

    ArrayAdapter<String> adapter;
WebView webView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // search_food=(ListView) findViewById(R.id.search_food);
        Integer[] imageArray = new Integer[]{R.drawable.kadai,
                R.drawable.biriyani, R.drawable.chilli, R.drawable.panner};
        listView = (ListView) findViewById(R.id.listviewID);
        //inal ArrayAdapter<String> adapter =  new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,nameArray);
        final Person whatever = new Person(this, nameArray, infoArray, imageArray);
        listView = (ListView) findViewById(R.id.listviewID);
        //listView.setAdapter(whatever);
        listView.setAdapter(whatever);
        // search_food.setAdapter(adapter);
//        //SearchView simpleSearchView = (SearchView) findViewById(R.id.search_view); // inititate a search view
//   webView = (WebView) findViewById(R.id.webview);
//   webView.setWebViewClient(new WebViewClient());
//   webView.loadUrl("http://www.google.com");
//        WebSettings webSettings=webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
        // inititate a search view

//        SearchView mySearchView;
//        mySearchView = (SearchView)findViewById(R.id.search_view);


        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), DetiledActivity.class);
                    startActivityForResult(myIntent, 0);

                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ActivityTwo.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ActivityThree.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), ActivityFour.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.search_engine, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

//respond to menu item selection
        switch (item.getItemId()) {

            case R.id.action_favorite:

               startActivity(new Intent(this, Webactivity.class));

                return true;
//
//                    case R.id.help:
//
//                        startActivity(new Intent(this, Help.class));
//
//                        return true;
//
            default:

                return super.onOptionsItemSelected(item);

        }
    }

}

