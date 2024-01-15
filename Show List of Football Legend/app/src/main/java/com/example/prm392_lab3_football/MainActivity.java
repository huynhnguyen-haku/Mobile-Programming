package com.example.prm392_lab3_football;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewLegend;
    ArrayList<FootballLegend> footballLegendArrayList;
    FootballAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Reference();
        adapter = new FootballAdapter(this, R.layout.football_line, footballLegendArrayList);
        listViewLegend.setAdapter(adapter);
    }

    private void Reference(){
        listViewLegend = findViewById(R.id.lvLegend);
        footballLegendArrayList = new ArrayList<>();
        footballLegendArrayList.add(new FootballLegend("Maradona","30/11/1960", R.drawable.maradona, R.drawable.achentina));
        footballLegendArrayList.add(new FootballLegend("Lionel Messi","24/6/1987", R.drawable.messi, R.drawable.achentina));
        footballLegendArrayList.add(new FootballLegend("Cristiano Ronaldo","5/2/1985", R.drawable.ronaldo, R.drawable.bodaonha));
        footballLegendArrayList.add(new FootballLegend("Zlatan Ibrahimović","3/10/1981", R.drawable.brahimovic, R.drawable.thuydien));
        footballLegendArrayList.add(new FootballLegend("Pelé","23/10/1940", R.drawable.pele, R.drawable.brazil));
    }
}