package com.example.rishabh.lists;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class Custom_Adapter extends ArrayAdapter<String> {

    Custom_Adapter(Context context, String[] foods) {
        super(context,R.layout.custom_row, foods);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater myInflater=LayoutInflater.from(getContext());
        View customView=myInflater.inflate(R.layout.custom_row,parent,false);

        //getting references
        String singleFoodItem=getItem(position);
        TextView myTxt=(TextView)customView.findViewById(R.id.textView);
        ImageView myImage=(ImageView)customView.findViewById(R.id.imageView);

        myTxt.setText(singleFoodItem);
        myImage.setImageResource(R.drawable.ic_launcher);

        return customView;
    }
}
