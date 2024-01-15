package com.example.prm392_lab3_fruit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewFruit;
    ArrayList<Fruit> fruitArrayList;
    FruitAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Reference();
        adapter = new FruitAdapter(this, R.layout.fruit_line, fruitArrayList);
        listViewFruit.setAdapter(adapter);
    }

    private void Reference(){
        listViewFruit = findViewById(R.id.lvFruit);
        fruitArrayList = new ArrayList<>();
        fruitArrayList.add(new Fruit("Apple","Quả này ăn khá ngon", R.drawable.apple));
        fruitArrayList.add(new Fruit("Banana","Có chứa chút phóng xạ", R.drawable.banana));
        fruitArrayList.add(new Fruit("Blue Berry","Dùng làm thức uống tốt", R.drawable.berry));
        fruitArrayList.add(new Fruit("Coconut","Cái gì cũng có thể tận dụng", R.drawable.coconut));
        fruitArrayList.add(new Fruit("Grapes","Con cáo và chùm nho", R.drawable.grape));
    }
}