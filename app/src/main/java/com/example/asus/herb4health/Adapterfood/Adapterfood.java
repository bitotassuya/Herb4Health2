package com.example.asus.herb4health.Adapterfood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.herb4health.Model.Food;
import com.example.asus.herb4health.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Non on 12/4/2017.
 */

public class Adapterfood extends BaseAdapter {

    List<Food> foodList;
    Context context;

    public Adapterfood(List<Food> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int i) {
        return foodList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View rootView = view;
        if (rootView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            View itemView = inflater.inflate(R.layout.layout_item, null);
            TextView name = (TextView) itemView.findViewById(R.id.label);
            ImageView imageView = (ImageView) itemView.findViewById(R.id.image);

            Picasso.with(context).load(foodList.get(i).getImg()).into(imageView);
            name.setText(foodList.get(i).getTitle());
            return imageView;
        }
        return rootView;
    }

}
