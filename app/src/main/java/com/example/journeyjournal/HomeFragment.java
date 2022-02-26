package com.example.journeyjournal;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.journeyjournal.Models.ContentModel;
import com.example.journeyjournal.Models.ListAdaptor;
import com.example.journeyjournal.databinding.FragmentHomeBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private FloatingActionButton floatingActionButton;

    RecyclerView recyclerView;
    ArrayList<ContentModel> contentHolder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.homeList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        contentHolder = new ArrayList<>();

        ContentModel model = new ContentModel("25","test","",R.drawable.a);
        contentHolder.add(model);
        ContentModel model1 = new ContentModel("25","test","",R.drawable.a);
        contentHolder.add(model1);
        ContentModel model2 = new ContentModel("25","test","",R.drawable.a);
        contentHolder.add(model2);
        ContentModel model3 = new ContentModel("25","test","",R.drawable.a);
        contentHolder.add(model3);
        ContentModel model4 = new ContentModel("25","test","",R.drawable.a);
        contentHolder.add(model4);
        ContentModel model5 = new ContentModel("25","test","",R.drawable.a);
        contentHolder.add(model5);
        ContentModel model6 = new ContentModel("25","test","",R.drawable.a);
        contentHolder.add(model6);
        ContentModel model7 = new ContentModel("25","test","",R.drawable.a);
        contentHolder.add(model7);
        ContentModel model8 = new ContentModel("25","test","",R.drawable.a);
        contentHolder.add(model8);

        recyclerView.setAdapter(new ListAdaptor(contentHolder));

        FloatingActionButton floatingActionButton = (FloatingActionButton) rootView.findViewById(R.id.floatingBtn);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),JournalActivity.class);
                intent.putExtra("some", "some thing");
                startActivity(intent);
            }
        });
        return rootView;
    }
}