package com.abedkhan.foody.Viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abedkhan.foody.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class CetagoryViewholder extends RecyclerView.ViewHolder {
    public TextView name;
    public CircleImageView img;


    public CetagoryViewholder(@NonNull View itemView) {
        super(itemView);

        name=itemView.findViewById(R.id.catName);
        img=itemView.findViewById(R.id.catImg);

    }
}
