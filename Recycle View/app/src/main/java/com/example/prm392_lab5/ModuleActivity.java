package com.example.prm392_lab5;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ModuleActivity extends AppCompatActivity {
    ArrayList<Module> moduleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        RecyclerView rvModule = findViewById(R.id.rvModule);

        moduleList = new ArrayList<>();
        moduleList.add(new Module("Bird", "Phần mềm theo dõi chim", "IOS", Uri.parse("android.resource://com.example.prm392_lab5/" + R.drawable.iconsbird)));
        moduleList.add(new Module("Exam", "Phần mềm làm bài kiểm tra", "Android 7.0", Uri.parse("android.resource://com.example.prm392_lab5/" + R.drawable.iconstask)));
        moduleList.add(new Module("Settings", "Cài đặt cho máy", "Android 14.0", Uri.parse("android.resource://com.example.prm392_lab5/" + R.drawable.iconssettings)));
        moduleList.add(new Module("Task", "Phần mềm giao bài tập tự động", "Window Phone", Uri.parse("android.resource://com.example.prm392_lab5/" + R.drawable.iconsexam)));

        rvModule.setLayoutManager(new LinearLayoutManager(this));

        ModuleAdapter adapter = new ModuleAdapter(moduleList);

        rvModule.setAdapter(adapter);
    }
}
