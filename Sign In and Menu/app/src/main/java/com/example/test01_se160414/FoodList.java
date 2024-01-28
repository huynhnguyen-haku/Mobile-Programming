package com.example.test01_se160414;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodList extends AppCompatActivity {

    String[] fName = {"Phở Hà Nội", "Bún Bò Huế", "Mì Quảng", "Hủ Tíu Sài Gòn"};
    int[] fImage = {R.drawable.pho, R.drawable.bunbo, R.drawable.miquang, R.drawable.hutieu};
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        lv = findViewById(R.id.lvFood);
        FoodAdapter customAdapter = new FoodAdapter(getApplicationContext(), fImage, fName);
        lv.setAdapter(customAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent = new Intent();
               intent.putExtra("Food", fName[position]);
               setResult(1, intent);
               finish();
            }
        });
    }
}