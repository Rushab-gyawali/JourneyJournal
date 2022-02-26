package com.example.journeyjournal.Models;

import android.content.Context;
import android.media.MediaDrm;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.journeyjournal.R;

import java.util.ArrayList;

public class ListAdaptop extends ArrayAdapter<Test> {

    public ListAdaptop(Context context, ArrayList<Test> userArrayList)
    {
        super(context, R.layout.item_custom_view,userArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        Test user = getItem(position);

        if (convertView == null)
        {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_view,parent,false);
        }
        ImageView imageView = convertView.findViewById(R.id.image);
        EditText txtWeather = convertView.findViewById(R.id.date);
        EditText txtContent = convertView.findViewById(R.id.content);
        FrameLayout ascentColor = convertView.findViewById(R.id.ascentColor);


        imageView.setImageResource(user.ImageId);
        txtWeather.setText(user.weather);
        txtContent.setText(user.content);


        return super.getView(position, convertView, parent);
    }
}


