package com.example.prm392_lab4_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class food extends AppCompatActivity {


    TextView txSelected;
    Button btnFoodSubmit;

    EditText editQuantity;
    String[] fName = {"Phở", "Bún Bò Huế", "Mì Quảng", "Hủ Tíu"};
    int[] fImage = {R.drawable.pho, R.drawable.bunbo, R.drawable.miquang, R.drawable.hutieu};
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        txSelected = (TextView)findViewById(R.id.txSelected);
        btnFoodSubmit = (Button)findViewById(R.id.btnFoodSubmit);
        editQuantity =(EditText)findViewById(R.id.editQuantiy);
        lv = findViewById(R.id.lvFood);
        FoodAdapter customAdapter = new FoodAdapter(getApplicationContext(), fImage, fName);
        lv.setAdapter(customAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent();
//                intent.putExtra("Food", fName[position]);
//                setResult(1, intent);
//                finish();
                  txSelected.setText(fName[position]);
            }
        });

        btnFoodSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("Food",editQuantity.getText().toString() +" "+ txSelected.getText().toString());
                setResult(1, intent);
                finish();
            }
        });

    }
}