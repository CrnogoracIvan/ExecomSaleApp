package com.example.ivancrnogorac.execomsaleapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ivancrnogorac.execomsaleapp.R;
import com.example.ivancrnogorac.execomsaleapp.adapter.ItemAdapter;
import com.example.ivancrnogorac.execomsaleapp.model.Item;
import com.example.ivancrnogorac.execomsaleapp.model.User;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private List<Item> itemList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = (RecyclerView) findViewById(R.id.itemRecyclerView);
        itemList = new ArrayList<>();
        adapter = new ItemAdapter(this, itemList);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);


        recyclerView.setAdapter(adapter);

        prepareItems();

    }

    private void prepareItems(){

        User Pera = new User();
        User Mika = new User();

        Item i = new Item ("Lopta", Pera);
        Item o = new Item ("Reket", Mika);
        itemList.add(i);
        itemList.add(o);
    }
}
