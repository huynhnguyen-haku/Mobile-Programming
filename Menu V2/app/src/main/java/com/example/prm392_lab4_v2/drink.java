package com.example.prm392_lab4_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class drink extends AppCompatActivity {
    String[] name = {"Coca", "Bia", "Nước Mia", "Trà"};
    int[] image = {R.drawable.coca, R.drawable.bia, R.drawable.nuocmia, R.drawable.tra};
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