package com.elflin.petqper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.sql.Date;
import java.util.ArrayList;

import adapter.SocialRVAdapter;
import model.Post;

public class SocialFragment extends Fragment {

    private View view;
    private RecyclerView social_recyclerview;
    private SocialRVAdapter socialRVAdapter;
    private ArrayList<Post> postlist;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.view = inflater.inflate(R.layout.fragment_social, container, false);
        makeData();
        initComponent();
        setupRecyclerView();
        return this.view;
    }

    private void setupRecyclerView() {
        this.socialRVAdapter = new SocialRVAdapter(postlist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        this.social_recyclerview.setLayoutManager(layoutManager);
        this.social_recyclerview.setAdapter(socialRVAdapter);
    }

    private void makeData() {
        this.postlist = new ArrayList<>();
        for (int i = 0; i<10; i++) {
            this.postlist.add(new Post("0", "0", "0", "0", new Date(System.currentTimeMillis())));
        }
    }

    private void initComponent() {
        this.social_recyclerview = view.findViewById(R.id.social_recyclerview);
    }
}
