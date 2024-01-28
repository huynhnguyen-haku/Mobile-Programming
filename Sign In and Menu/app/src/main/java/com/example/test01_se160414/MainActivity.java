package com.example.test01_se160414;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnFood, btnDrink, btnClose;
    TextView txResult;
    String fname = "";
    String drinkName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFood = (Button) findViewById(R.id.btnFood);
        btnDrink = (Button) findViewById(R.id.btnDrink);
        btnClose = (Button) findViewById(R.id.btnClose);
        txResult = (TextView) findViewById(R.id.txResult);

        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FoodList.class);
                startActivityForResult(intent, 1);
            }
        });

        btnDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DrinkList.class);
                startActivityForResult(intent, 2);
            }
        });

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (data.hasExtra("Food")) {
                fname = data.getStringExtra("Food");
                txResult.setText(fname + " - " + drinkName);
            }
        }
        if (requestCode == 2) {
            if (data.hasExtra("Drink")) {
                drinkName = data.getStringExtra("Drink");
                txResult.setText(fname + " - " + drinkName);
            }
        }
    }
}