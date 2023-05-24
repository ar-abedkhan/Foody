package com.abedkhan.foody.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abedkhan.foody.Model.CetegoryModel;
import com.abedkhan.foody.R;
import com.abedkhan.foody.Viewholder.CetagoryViewholder;
import com.bumptech.glide.Glide;

import java.util.List;

public class CetagoryAdapter extends RecyclerView.Adapter<CetagoryViewholder> {
    List<CetegoryModel>cetegoryModels;
    Context context;

    public CetagoryAdapter(List<CetegoryModel> cetegoryModels, Context context) {
        this.cetegoryModels = cetegoryModels;
        this.context = context;
    }

    @NonNull
    @Override
    public CetagoryViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.cetagorydesign,parent,false);
        return new CetagoryViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CetagoryViewholder holder, int position) {
        CetegoryModel cetegoryModel=cetegoryModels.get(position);

        Glide.with(context).load(cetegoryModel.getCetegoryImg()).into(holder.img);
        holder.name.setText(cetegoryModel.cetegoryName);

//        holder.cardView.setAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(),R.anim.animation));


    }

    @Override
    public int getItemCount() {
        return cetegoryModels.size();
    }
}
