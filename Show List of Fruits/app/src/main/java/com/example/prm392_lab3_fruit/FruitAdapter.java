package com.example.prm392_lab3_fruit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;
public class FruitAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Fruit> fruitList;

    public FruitAdapter(Context context, int layout, List<Fruit> fruitList) {
        this.context = context;
        this.layout = layout;
        this.fruitList = fruitList;
    }


    @Override
    public int getCount() {
        return fruitList.size();
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
        TextView txtDescription = view.findViewById(R.id.txtDescription);
        ImageView imgFruit =  view.findViewById(R.id.imgFruit);

        Fruit fruit = fruitList.get(i);

        txtName.setText(fruit.getName());
        txtDescription.setText(fruit.getDescription());
        imgFruit.setImageResource(fruit.getFruitImg());

        return view;
    }
}
