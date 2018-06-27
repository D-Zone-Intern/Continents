package com.example.gaps.continentsandoceans;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public final class countryviewholder extends RecyclerView.ViewHolder {
    private final ImageView imageView;
    private final TextView name;
    private final TextView desc;



    countryviewholder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.mname);
        imageView = itemView.findViewById(R.id.img);
        desc = itemView.findViewById(R.id.cname);
    }

    public void setDesc(String d) {
        desc.setText(d);
    }


    public void setImage(String image, Context context) {
        Glide.with(context).load(image).into(imageView);


    }

    public void setName(String n) {
        name.setText(n);
    }



}
