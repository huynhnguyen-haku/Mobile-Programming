package com.example.test01_se160414;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class DrinkList extends AppCompatActivity {
    String[] name = {"Pepsi", "Heineken", "Tiger", "Sài Gòn Đỏ"};
    int[] image = {R.drawable.pepsi, R.drawable.heineken, R.drawable.tiger, R.drawable.saigondo};
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        lv = findViewById(R.id.lvDrink);
        DrinkAdapter customAdapter = new DrinkAdapter(getApplicationContext(), image,name);
        lv.setAdapter(customAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                intent.putExtra("Drink", name[position]);
                setResult(2, intent);
                finish();
            }
        });
    }
}