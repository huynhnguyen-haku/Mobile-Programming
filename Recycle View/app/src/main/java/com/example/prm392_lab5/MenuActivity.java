package com.example.prm392_lab5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    Button btnLab51, btnLab52;
    TextView txtLab5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        binding();

        btnLab51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, UserActivity.class);
                startActivity(intent);
            }
        });

        btnLab52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ModuleActivity.class);
                startActivity(intent);
            }
        });
    }

    public void binding(){
        btnLab51 = findViewById(R.id.btnLab51);
        btnLab52 = findViewById(R.id.btnLab52);
        txtLab5 = findViewById(R.id.txtLab5);
    }
}