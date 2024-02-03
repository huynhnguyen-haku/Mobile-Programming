package com.example.prm392_lab6_v1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ContextMenu extends AppCompatActivity {

    Button btnChonMau;
    ConstraintLayout manHinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        btnChonMau = findViewById(R.id.btn_chon_mau);
        manHinh = findViewById(R.id.manHinh);

        registerForContextMenu(btnChonMau);
    }

    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuVang) {
            manHinh.setBackgroundColor(Color.YELLOW);
        } else if (item.getItemId() == R.id.menuXanh) {
            manHinh.setBackgroundColor(Color.BLUE);
        } else if (item.getItemId() == R.id.menuDo) {
            manHinh.setBackgroundColor(Color.RED);
        }
        return super.onContextItemSelected(item);
    }
}