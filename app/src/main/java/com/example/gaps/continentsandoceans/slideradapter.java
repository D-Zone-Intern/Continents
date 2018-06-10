package com.example.gaps.continentsandoceans;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.example.gaps.continentsandoceans.R.layout.slide_layout;

public class slideradapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;
    int[] myImageList = new int[]{R.drawable.common_google_signin_btn_icon_dark_focused, R.drawable.index1, R.drawable.index2};
    String[] heading = new String[]{"HELLO", "JEKJKW", "EJKW"};

    public slideradapter(Context context) {

        this.context = context;
    }


    @Override
    public int getCount() {
        return heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view;
        view = layoutInflater.inflate(R.layout.slide_layout,container,false);
        ImageView imageView = view.findViewById(R.id.image);
        TextView textView = view.findViewById(R.id.str);
        imageView.setImageResource(myImageList[position]);
        textView.setText(heading[position]);
        ViewPager vp = (ViewPager) container;
        vp.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
