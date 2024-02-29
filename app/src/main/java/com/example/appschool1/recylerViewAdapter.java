package com.example.appschool1;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class recylerViewAdapter extends RecyclerView.Adapter<recylerViewAdapter.ViewHolder> {

    Context context;
    List<Item> foods;
    public recylerViewAdapter(Context context, List<Item> foods) {
        this.context = context;
        this.foods = foods;
    }

    @NonNull
    @Override
    public recylerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recyler_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull recylerViewAdapter.ViewHolder holder, int position) {
        holder.foodImage.setImageResource(foods.get(position).getImage());
        holder.foodName.setText(foods.get(position).getName());
        holder.foodPrice.setText(foods.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView foodImage;
        TextView foodName,foodPrice;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.food_image);
            foodName = itemView.findViewById(R.id.food_name);
            foodPrice = itemView.findViewById(R.id.food_price);
        }
    }


}
