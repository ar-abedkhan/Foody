package com.abedkhan.foody.Viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abedkhan.foody.R;

public class AllfoodViewholder extends RecyclerView.ViewHolder {

    public ImageView img,addcart;
    public TextView foodname,price,resturentname;


    public AllfoodViewholder(@NonNull View itemView) {
        super(itemView);


        foodname=itemView.findViewById(R.id.foodname);
        price=itemView.findViewById(R.id.foodPrice);
        img=itemView.findViewById(R.id.foodimg);
        addcart=itemView.findViewById(R.id.addtoCart);
        resturentname=itemView.findViewById(R.id.resturentName);
    }
}
