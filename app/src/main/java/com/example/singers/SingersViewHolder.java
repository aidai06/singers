package com.example.singers;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class SingersViewHolder extends RecyclerView.ViewHolder {
    TextView tvsinger;
    public SingersViewHolder(@NonNull View itemView) {
        super(itemView);

        tvsinger = itemView.findViewById(R.id.tv_singers);
    }


    public void bind (String move){
        tvsinger.setText(move);
    }
}

