package com.example.divyamjoshi.gameofthrone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final String house_names[] = {
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop",
            "Marshmallow"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    private void initViews(){

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.gamerv);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<House> androidVersions = prepareData();
        HouseAdapter adapter = new HouseAdapter(getApplicationContext(),androidVersions);
        recyclerView.setAdapter(adapter);
    }
    private ArrayList<House> prepareData(){

        ArrayList<House> got_house = new ArrayList<>();
        for(int i=0;i<house_names.length;i++){
            House androidVersion = new House();
            androidVersion.setName(house_names[i]);
            //androidVersion.setAndroid_image_url(android_image_urls[i]);
            got_house.add(androidVersion);
        }
        return got_house;
    }
}
