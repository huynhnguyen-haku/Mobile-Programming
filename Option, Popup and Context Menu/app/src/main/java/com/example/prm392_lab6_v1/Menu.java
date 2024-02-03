package com.example.prm392_lab6_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button btnOptionMenu, btnPoupMenu, btnContextMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        binding();
        btnOptionMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, OptionMenu.class);
                startActivity(intent);
            }
        });

        btnPoupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, PopupMenu.class);
                startActivity(intent);
            }
        });

        btnContextMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, ContextMenu.class);
                startActivity(intent);
            }
        });
    }

    private void binding() {
        btnOptionMenu = findViewById(R.id.btn_OptionMenu);
        btnPoupMenu = findViewById(R.id.btn_PopupMenu);
        btnContextMenu = findViewById(R.id.btn_ContextMenu);
    }
}