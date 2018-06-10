package com.example.gaps.continentsandoceans;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.common.ConnectionResult;
import me.relex.circleindicator.CircleIndicator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {

    private static final Integer[] pics = {R.drawable.s1, R.drawable.s2};
    private  ViewPager mPager;
    private static int currentPage = 0;
    private ArrayList<Integer> picsArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    private void init() {
        Collections.addAll(picsArray, pics);

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new Adapter(this, picsArray));
        CircleIndicator indicator = findViewById(R.id.indicator);
        indicator.setViewPager(mPager);
        

    }
}
