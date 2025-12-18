package com.example.singers;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SingersAdapter extends RecyclerView.Adapter<SingersViewHolder> {

    private ArrayList<String> singersList;

    public SingersAdapter(ArrayList<String> movieList) {
        this.singersList = movieList;
    }

    @NonNull
    @Override
    public SingersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SingersViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_singers,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SingersViewHolder holder, int position) {
        holder.bind(singersList.get(position));

    }

    @Override
    public int getItemCount() {
        return singersList.size();
    }
}
