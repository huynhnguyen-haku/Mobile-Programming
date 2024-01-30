package com.example.prm392_lab5;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModuleAdapter extends RecyclerView.Adapter<ModuleAdapter.ViewHolder> {

    private ArrayList<Module> moduleList;

    public ModuleAdapter(ArrayList<Module> moduleList) {
        this.moduleList = moduleList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.row_modulelist, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        Module module = moduleList.get(position);
        holder.tvName.setText(module.getName());
        holder.tvDesName.setText(module.getDescription());
        holder.tvDevice.setText(module.getDevice());
        holder.imgView.setImageURI(module.getImages());
    }

    @Override
    public int getItemCount() {
        return moduleList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvName, tvDesName, tvDevice;
        ImageView imgView;
        LinearLayout linearLayoutAll;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvDesName =  itemView.findViewById(R.id.tvDescription);
            tvDevice = itemView.findViewById(R.id.tvDevice);
            imgView = itemView.findViewById(R.id.imageView);
            linearLayoutAll = itemView.findViewById(R.id.LinearLayoutAll);
        }
    }
}