package com.example.gaps.continentsandoceans;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public final class countryviewholder extends RecyclerView.ViewHolder {
    private ImageView image;
    private TextView name;
    private TextView cname;

    countryviewholder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.mname);
        image = itemView.findViewById(R.id.img);
        cname = itemView.findViewById(R.id.cname);
    }

    public void setCname(String d) {
        cname.setText(d);
    }

    public void setImage(String ima, Context context) {
        Glide.with(context).load(ima).into(image);


    }

    public void setName(String n) {
        name.setText(n);
    }


}
