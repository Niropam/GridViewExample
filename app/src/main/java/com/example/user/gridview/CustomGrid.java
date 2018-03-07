package com.example.user.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class CustomGrid extends ArrayAdapter<Items> {

    ArrayList<Items> itemCountry;

    public CustomGrid(Context context, int textViewResourceId, ArrayList objects) {
        super(context, textViewResourceId, objects);
        itemCountry= objects;
    }
    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.grid_single, null);

        TextView cNames=(TextView) v.findViewById(R.id.grid_text);
        ImageView cImages=(ImageView) v.findViewById(R.id.grid_image);

        cNames.setText(itemCountry.get(position).getCountryName());
        cImages.setImageResource(itemCountry.get(position).getCountryFlag());



        return v;
    }
}



