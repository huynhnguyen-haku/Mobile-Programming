package com.example.prm392_lab3_football;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;


public class FootballAdapter extends BaseAdapter {

    private Context context;

    private int layout;
    private List<FootballLegend> legendList;

    public FootballAdapter(Context context, int layout, List<FootballLegend> legendList) {
        this.context = context;
        this.layout = layout;
        this.legendList = legendList;
    }

    @Override
    public int getCount() {
        return legendList.size();
    }

    @Override
    public Objects getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        // Reference
        TextView txtName = view.findViewById(R.id.txtName);
        TextView txtBirthday = view.findViewById(R.id.txtBirthday);
        ImageView imgLegend = view.findViewById(R.id.imgLegend);
        ImageView imgFlag = view.findViewById(R.id.imgFlag);

        // Gán giá trị
        FootballLegend footballLegend = legendList.get(i);

        txtName.setText(footballLegend.getName());
        txtBirthday.setText(footballLegend.getBirthDay());
        imgLegend.setImageResource(footballLegend.getFooterImg());
        imgFlag.setImageResource(footballLegend.getFlagImg());

        return view;
    }
}
