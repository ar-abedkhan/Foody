package com.abedkhan.foody.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abedkhan.foody.Model.AllFoodModel;
import com.abedkhan.foody.R;
import com.abedkhan.foody.Viewholder.AllfoodViewholder;
import com.bumptech.glide.Glide;

import java.util.List;

public class PopularFoodAdapter extends RecyclerView.Adapter<AllfoodViewholder> {
    List<AllFoodModel> allFoodModelList;
    Context context;

    public PopularFoodAdapter(List<AllFoodModel> allFoodModelList, Context context) {
        this.allFoodModelList = allFoodModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public AllfoodViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.popularfooddesign,parent,false);

        return new AllfoodViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllfoodViewholder holder, int position) {
        AllFoodModel allFoodModel=allFoodModelList.get(position);

        Glide.with(context).load(allFoodModel.getImage()).into(holder.img);
        holder.foodname.setText(allFoodModel.getFoodName());
        holder.price.setText(allFoodModel.getPrice());


    }

    @Override
    public int getItemCount() {
        return allFoodModelList.size();
    }
}
