package com.example.gaps.continentsandoceans;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import me.relex.circleindicator.CircleIndicator;

public class splash_acivity extends AppCompatActivity {
    private ViewPager viewPager;
    private Button btnprev,btnnext;
    private int currentpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_acivity);

        init();
    }
        public void init(){
            viewPager = findViewById(R.id.splash_slider);
            com.example.gaps.continentsandoceans.slideradapter slideradapter = new slideradapter(this);
            viewPager.setAdapter(slideradapter);
            CircleIndicator indicator = findViewById(R.id.ind);
            indicator.setViewPager(viewPager);
            btnnext = findViewById(R.id.next);
            btnprev = findViewById(R.id.prev);
            viewPager.addOnPageChangeListener(listener);
            btnnext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        viewPager.setCurrentItem(currentpage);
                        if (btnnext.getText()=="finish")
                        {
                            Intent i = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(i);
                            finish();
                        }
                        else
                            {
                                viewPager.setCurrentItem(currentpage +1 );
                            }
                }
            });
            btnprev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewPager.setCurrentItem(currentpage -1);

                }
            });

        }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    ViewPager.OnPageChangeListener listener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                currentpage = position;
                if (position == 0){
                    btnnext.setEnabled(true);
                    btnprev.setEnabled(false);
                    btnprev.setVisibility(View.INVISIBLE);
                    btnnext.setText("next");
                    btnprev.setText("");

                }else if (position==2){
                    btnnext.setEnabled(true);
                    btnprev.setEnabled(true);
                    btnprev.setVisibility(View.VISIBLE);
                    btnnext.setText("finish");
                    btnprev.setText(R.string.prev_button);
                }else
                {
                     btnnext.setEnabled(true);
                     btnprev.setEnabled(true);
                     btnprev.setVisibility(View.VISIBLE);
                     btnnext.setText("next");
                     btnprev.setText(R.string.prev_button);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        };

}
