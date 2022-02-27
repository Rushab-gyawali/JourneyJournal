package com.example.journeyjournal.Models;

import android.content.Context;
import android.media.MediaCodecList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.journeyjournal.R;

import java.util.ArrayList;

public class ListAdaptor extends RecyclerView.Adapter<ListAdaptor.myViewHolder> {

    ArrayList<ContentModel> contentModel;

    public ListAdaptor(ArrayList<ContentModel> contentModel) {
        this.contentModel = contentModel;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_view,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.img.setImageResource(contentModel.get(position).getImageId());
        holder.date.setText(contentModel.get(position).getWeather());
    }

    @Override
    public int getItemCount() {
        return contentModel.size();
    }

//    public ListAdaptor(Context context, ArrayList<ContentModel> userArrayList)
//    {
//        super(context, R.layout.item_custom_view,userArrayList);
//
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//
//
//        ContentModel user = getItem(position);
//
//        if (convertView == null)
//        {
//            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_view,parent,false);
//        }
//        ImageView imageView = convertView.findViewById(R.id.image);
//        EditText txtWeather = convertView.findViewById(R.id.date);
//        EditText txtContent = convertView.findViewById(R.id.content);
//        FrameLayout ascentColor = convertView.findViewById(R.id.ascentColor);
//
//
//        imageView.setImageResource(user.ImageId);
//        txtWeather.setText(user.weather);
//        txtContent.setText(user.content);
//
//
//        return super.getView(position, convertView, parent);
//    }

    class myViewHolder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView date,content;
        public myViewHolder(@NonNull View viewItem)
        {
            super(viewItem);
            img=viewItem.findViewById(R.id.image);
            date=viewItem.findViewById(R.id.date);
            content=viewItem.findViewById(R.id.content);
        }
    }
}


