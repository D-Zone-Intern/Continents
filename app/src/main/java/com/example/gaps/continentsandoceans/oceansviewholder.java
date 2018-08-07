package com.example.gaps.continentsandoceans;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class oceansviewholder extends RecyclerView.ViewHolder {
    private final ImageView oimageView;
    private final TextView oname;
    private final TextView odesc;



    oceansviewholder(View itemView) {
        super(itemView);
        oname = itemView.findViewById(R.id.mname2);
        oimageView = itemView.findViewById(R.id.img2);
        odesc = itemView.findViewById(R.id.cname2);
    }

    public void setoDesc(String d) {
        odesc.setText(d);
    }


    public void setoImage(String image, Context context) {
        Glide.with(context).load(image).into(oimageView);


    }

    public void setoName(String n) {
        oname.setText(n);
    }



}
