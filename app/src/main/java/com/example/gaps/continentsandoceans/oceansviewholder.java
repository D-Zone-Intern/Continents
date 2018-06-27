package com.example.gaps.continentsandoceans;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class oceansviewholder extends RecyclerView.ViewHolder {
    private ImageView image;
    private TextView name;
    private TextView cname;

    oceansviewholder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.mname2);
        image = itemView.findViewById(R.id.img2);
        cname = itemView.findViewById(R.id.cname2);
    }

    public void setCname(String d) {
        cname.setText(d);
    }

    public void setImage(String ima2, Context context) {
        Glide.with(context).load(ima2).into(image);


    }

    public void setName(String n) {
        name.setText(n);
    }


}