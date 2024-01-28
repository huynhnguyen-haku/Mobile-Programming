package com.example.prm392_lab4_v2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnFood, btnDrink;
    TextView txResult;
    String fname = "";
    String drinkName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFood = (Button) findViewById(R.id.btnFood);
        btnDrink = (Button) findViewById(R.id.btnDrink);
        txResult = (TextView) findViewById(R.id.txResult);

        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, food.class);
                startActivityForResult(intent, 1);
            }
        });

        btnDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, drink.class);
                startActivityForResult(intent, 2);
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