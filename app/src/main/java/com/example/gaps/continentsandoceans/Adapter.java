package com.example.gaps.continentsandoceans;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class Adapter extends PagerAdapter{


        private ArrayList<Integer> images;
        private LayoutInflater inflater;

    Adapter(Context context, ArrayList<Integer> images) {
        this.images=images;
        inflater = LayoutInflater.from(context);
    }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

        @Override
        public int getCount() {
        return images.size();
    }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup view, int position) {
        View myImageLayout = inflater.inflate(R.layout.slider, view, false);
        ImageView myImage = myImageLayout
                .findViewById(R.id.image);
            myImage.setImageResource(images.get(position));
        view.addView(myImageLayout, 0);
        return myImageLayout;
    }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
    }
