package com.example.project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class Fav_List extends AppCompatActivity {
    ArrayList<String> listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_list);

        listView.add("kadai");

    }

}
