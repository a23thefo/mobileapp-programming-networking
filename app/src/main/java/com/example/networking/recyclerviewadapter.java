package com.example.networking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class recyclerviewadapter extends RecyclerView.Adapter<recyclerviewadapter.MyViewHolder> {
    Context context;
    ArrayList <Mountain> mountains;
    public recyclerviewadapter(Context context, ArrayList<Mountain>mountains){
        this.context =context;
        this.mountains=mountains;
    }
    @NonNull
    @Override
    public recyclerviewadapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.recyclerviewitem, parent, false);

        return new recyclerviewadapter.MyViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerviewadapter.MyViewHolder holder, int position) {
        holder.textview.setText(mountains.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textview;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textview = itemView.findViewById(R.id.title);
        }
    }
}