package com.example.test01_se160414;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodAdapter extends BaseAdapter {

    Context context;
    int fImage[];
    String fName[];
    LayoutInflater inflater;
    public FoodAdapter(Context context, int fImage[], String[] fName) {
        this.context = context;
        this.fImage = fImage;
        this.fName = fName;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return fName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.item, null);
        TextView fName = (TextView) view.findViewById(R.id.txName);
        ImageView fImage = (ImageView) view.findViewById(R.id.imageView);
        fName.setText(this.fName[i].toString());
        fImage.setImageResource(this.fImage[i]);
        return view;
    }
}
