package com.example.prm392_lab6_v1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PopupMenu extends AppCompatActivity {
    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        btnMenu = (Button) findViewById(R.id.btnMenu);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMenu();
            }
        });
    }

    private void ShowMenu() {
        android.widget.PopupMenu popupMenu = new android.widget.PopupMenu(this, btnMenu);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

        // them sua xoa
        popupMenu.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.menuThem) {
                    btnMenu.setText("Menu Them");
                } else if (menuItem.getItemId() == R.id.menuSua) {
                    btnMenu.setText("Menu Sua");
                } else if (menuItem.getItemId() == R.id.menuXoa) {
                    btnMenu.setText("Menu Xoa");
                }
                return false;
            }
        });
        popupMenu.show();
    }

    // chọn menu hiển thị
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.popup_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // chọn item hiển thị
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuThem) {
            btnMenu.setText("Menu Them");
        } else if (item.getItemId() == R.id.menuSua) {
            btnMenu.setText("Menu Sua");
        } else if (item.getItemId() == R.id.menuXoa) {
            btnMenu.setText("Menu Xoa");
        }
        return super.onOptionsItemSelected(item);
    }
}